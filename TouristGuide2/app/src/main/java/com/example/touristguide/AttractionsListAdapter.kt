package com.example.touristguide

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView


class AttractionsListAdapter(
    private val values: List<AttractionModel>
) : ListAdapter<AttractionModel, AttractionsListAdapter.ViewHolder>(DiffCallback()) {
    lateinit var listener: ItemListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.attraction_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.nameView.text = item.name
        holder.categoryView.text = item.category
        holder.previewView.setImageResource(item.preview)

        if (item.isFavourite) {
            holder.favouriteBView.setImageResource(R.drawable.ic_favorite_24px)
        }
        else {
            holder.favouriteBView.setImageResource(R.drawable.ic_favorite_border_24px_1)
        }

        holder.bind(item)
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val nameView: TextView = itemView.findViewById(com.example.touristguide.R.id.name)
        val categoryView: TextView = itemView.findViewById(com.example.touristguide.R.id.category)
        val previewView: ImageView = itemView.findViewById(com.example.touristguide.R.id.preview)
        val favouriteBView: ImageButton = itemView.findViewById(com.example.touristguide.R.id.favourite)

        fun bind(item: AttractionModel) {
            itemView.setOnClickListener {listener.onItemClick(item)}
            favouriteBView.setOnClickListener {listener.onFavouriteClick(item)}
        }
    }

    interface ItemListener {
        fun onItemClick(item: AttractionModel?) {}
        fun onFavouriteClick(item: AttractionModel) {}
    }

    fun setNewListener(
        newListener: ItemListener
    ){
        listener = newListener
    }
}

class DiffCallback: DiffUtil.ItemCallback<AttractionModel>() {
    override fun areItemsTheSame(oldItem: AttractionModel, newItem: AttractionModel): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: AttractionModel, newItem: AttractionModel): Boolean {
        return oldItem.name == newItem.name && oldItem.category == newItem.category && oldItem.isFavourite == newItem.isFavourite
    }
}