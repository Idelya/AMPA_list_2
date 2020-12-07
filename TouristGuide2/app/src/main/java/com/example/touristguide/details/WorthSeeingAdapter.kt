package com.example.touristguide.details
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.touristguide.AttractionModel
import com.example.touristguide.R

class WorthSeeingAdapter(
    private val list: List<String>
) : RecyclerView.Adapter<WorthSeeingAdapter.WorthSeeingViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WorthSeeingAdapter.WorthSeeingViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.worth_seeing_item, parent, false)
        return WorthSeeingViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    inner class WorthSeeingViewHolder(private val listItemView: View): RecyclerView.ViewHolder(listItemView) {
        val idTV = listItemView.findViewById<TextView>(R.id.idList)
        val describeTV = listItemView.findViewById<TextView>(R.id.describeTV)
    }

    override fun onBindViewHolder(holder: WorthSeeingViewHolder, position: Int) {
        holder.idTV.text = (position+1).toString()
        holder.describeTV.text = list[position]
    }
}