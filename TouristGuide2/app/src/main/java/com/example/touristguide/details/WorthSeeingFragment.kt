package com.example.touristguide.details

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.touristguide.AttractionsListViewModel
import com.example.touristguide.R

class WorthSeeingFragment : Fragment() {

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_worth_seeing, container, false) as RecyclerView
        view.layoutManager = LinearLayoutManager(context)

        val viewModel = this.activity?.let { ViewModelProvider(it).get(AttractionsListViewModel::class.java) }!!

        val worthSeeingList: List<String>? = viewModel.current_details.value?.worthSeeing

        if(worthSeeingList!=null) {
            view.adapter = WorthSeeingAdapter(worthSeeingList)
        }

        return view
    }

}