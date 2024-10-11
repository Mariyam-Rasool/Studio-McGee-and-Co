package com.example.studiomcgee

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val imageView: ImageView = itemView.findViewById(R.id.img1)
    val dateTextView: TextView = itemView.findViewById(R.id.date1)
    val titleTextView: TextView = itemView.findViewById(R.id.title1)
    val descTextView: TextView = itemView.findViewById(R.id.desc1)

}