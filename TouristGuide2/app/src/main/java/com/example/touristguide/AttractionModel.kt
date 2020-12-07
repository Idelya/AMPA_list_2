package com.example.touristguide

import android.util.Log

/*data class AttractionModel(val name: String, val category: String, val preview: String, val description: String, val gallery: Array<String>){
}*/

class AttractionModel(val name: String, val category: String, val preview: Int, var isFavourite: Boolean){
    fun toggleFavourite() {
        isFavourite=!isFavourite
    }
}