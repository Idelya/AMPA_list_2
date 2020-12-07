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
import com.example.touristguide.AttractionsListViewModel
import com.example.touristguide.R

class DescriptionFragment : Fragment() {

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_description, container, false)

        val viewModel = this.activity?.let { ViewModelProvider(it).get(AttractionsListViewModel::class.java) }!!

        val nameTV = view.findViewById<TextView>(R.id.name)
        val imageIV = view.findViewById<ImageView>(R.id.mainImage)
        val descriptionTV = view.findViewById<TextView>(R.id.description)

        nameTV.text = viewModel.current_details.value?.name ?: ""
        viewModel.current_details.value?.preview?.let { imageIV.setImageResource(it) }
        descriptionTV.text = viewModel.current_details.value?.description

        return view
    }

}