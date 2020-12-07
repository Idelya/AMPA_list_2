package com.example.touristguide

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class AttractionsFragment : Fragment() {

    private lateinit var viewModel: AttractionsListViewModel

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_attraction_list_item,
            container,
            false
        ) as RecyclerView
        view.layoutManager = LinearLayoutManager(context)

        viewModel = this.activity?.let { ViewModelProvider(it).get(AttractionsListViewModel::class.java) }!!

        view.adapter = AttractionsListAdapter(viewModel.attractionsList.value!!)

        viewModel.current_details.observe(viewLifecycleOwner, Observer<AttractionModel> {
            attraction -> if(attraction!=null) openDetailsOfAttraction()
        })

        viewModel.favourites.observe(viewLifecycleOwner, Observer<Int> {
                (view.adapter as AttractionsListAdapter).notifyDataSetChanged()
        })

        (view.adapter as AttractionsListAdapter).setNewListener(object : AttractionsListAdapter.ItemListener {
            override fun onItemClick(item: AttractionModel?) {
                if (item != null) {
                    viewModel.openDetails(item)
                }
            }
            override fun onFavouriteClick(item: AttractionModel) {
                if (item != null) {
                    viewModel.toggleFavourite(item)
                }
            }
        } )
        return view
    }

    private fun openDetailsOfAttraction() {
        NavHostFragment.findNavController(this).navigate(R.id.action_itemFragment_to_detailsDescriptionFragment)
    }
}