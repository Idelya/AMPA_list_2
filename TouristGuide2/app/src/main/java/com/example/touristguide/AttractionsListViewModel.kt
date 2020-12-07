package com.example.touristguide

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class AttractionsListViewModel: ViewModel()  {

    var _attractionsList: MutableLiveData<List<AttractionModel>> = MutableLiveData(attractions_list_static)
    private val _current_details = MutableLiveData<AttractionModel>()

    val attractionsList: LiveData<List<AttractionModel>>
        get() = _attractionsList

    val current_details: LiveData<AttractionModel>
        get() = _current_details

    fun toggleFavourite(attraction: AttractionModel) {
        attraction.toggleFavourite()
    }

    fun removeItem(attraction: AttractionModel) {
        _attractionsList = MutableLiveData(attractionsList.value!!.filter { item -> item == attraction })
    }

    fun openDetails(attraction: AttractionModel) {
        _current_details.value = attraction
    }

    fun clearDetails() {
        _current_details.value = null
    }
}