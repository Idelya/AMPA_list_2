package com.example.touristguide.details

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.touristguide.DetailsDescriptionFragment

class PagerAdapter(parent: FragmentActivity): FragmentStateAdapter(parent) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> DescriptionFragment()
            1 -> GalleryFragment()
            else ->  WorthSeeingFragment()
        }
    }

}