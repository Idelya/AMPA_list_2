package com.example.touristguide.details

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.touristguide.AttractionsListViewModel
import com.example.touristguide.R

class GalleryFragment : Fragment() {

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_gallery, container, false) as RecyclerView
        view.layoutManager = LinearLayoutManager(context)

        val viewModel = this.activity?.let { ViewModelProvider(it).get(AttractionsListViewModel::class.java) }!!

        val galleryList: List<Int>? = viewModel.current_details.value?.gallery

        if(galleryList!=null) {
            view.adapter = GalleryAdapter(galleryList)
        }

        return view
    }

}