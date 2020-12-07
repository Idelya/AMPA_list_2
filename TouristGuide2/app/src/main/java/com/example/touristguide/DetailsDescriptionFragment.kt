package com.example.touristguide

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.viewpager2.widget.ViewPager2
import com.example.touristguide.details.DescriptionFragment
import com.example.touristguide.details.GalleryFragment
import com.example.touristguide.details.PagerAdapter
import com.example.touristguide.details.WorthSeeingFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class DetailsDescriptionFragment : Fragment() {

    private lateinit var viewModel: AttractionsListViewModel

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.details_description_fragment, container, false)

        viewModel = this.activity?.let { ViewModelProvider(it).get(AttractionsListViewModel::class.java) }!!
        val pager: ViewPager2 = view.findViewById(R.id.pager)
        pager.adapter = PagerAdapter(this.activity!!)

        val tabs: TabLayout = view.findViewById(R.id.tab_layout)
        TabLayoutMediator(tabs, pager) { tab, position ->
            when (position) {
                0 -> tab.setText(R.string.description)
                1 -> tab.setText(R.string.gallery)
                else ->  tab.setText(R.string.worth_seeing)
            }
        }.attach()

        val backBtn = view.findViewById<Button>(R.id.backButton)

        backBtn.setOnClickListener {
            backToList()
        }

        return view
    }

    private fun backToList() {
        NavHostFragment.findNavController(this).navigate(R.id.action_back_to_list)
        viewModel.clearDetails()
    }
}