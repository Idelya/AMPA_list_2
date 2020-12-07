package com.example.touristguide

class AttractionModel(val name: String, val category: String, val preview: Int, var isFavourite: Boolean, val description: String, val gallery: List<Int>, val worthSeeing: List<String>){
    fun toggleFavourite() {
        isFavourite=!isFavourite
    }
}