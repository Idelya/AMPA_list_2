package com.example.touristguide.details

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.touristguide.AttractionModel
import com.example.touristguide.R

class GalleryAdapter(
private val gallery: List<Int>
) : RecyclerView.Adapter<GalleryAdapter.GalleryViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GalleryAdapter.GalleryViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.gallery_item, parent, false)
        return GalleryViewHolder(view)
    }

    override fun getItemCount(): Int = gallery.size

    override fun onBindViewHolder(holder: GalleryAdapter.GalleryViewHolder, position: Int) {
        holder.galleryItemIV.setImageResource(gallery[position])
    }

    inner class GalleryViewHolder(private val listItemView: View): RecyclerView.ViewHolder(listItemView) {
        val galleryItemIV: ImageView = itemView.findViewById<ImageView>(R.id.galleryImg)
    }
}