package com.example.youtube_projekt_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.youtube_projekt_kotlin.R
import com.google.android.material.imageview.ShapeableImageView

class FilterAdapterclass  (var context: Context?, var items: ArrayList<Filter>) :
RecyclerView.Adapter<RecyclerView.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_feed_video,parent,false)
        return FilterViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val filter = items[position]


        if (holder is FilterViewHolder) {
            var tv_title  = holder.tv_title
            var title = holder.title


        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class FilterViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val tv_title : ShapeableImageView
    var title : ImageView

    init {
        tv_title = view.findViewById(R.id.tv_title)
        title = view.findViewById(R.id.title)
    }
}
