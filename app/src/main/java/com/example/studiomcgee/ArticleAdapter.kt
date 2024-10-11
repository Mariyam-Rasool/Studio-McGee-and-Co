package com.example.studiomcgee

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class ArticleAdapter(val articles: List<Article>): RecyclerView.Adapter<ArticleViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ArticleViewHolder {
        val view:View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)
        return ArticleViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ArticleViewHolder,
        position: Int
    ) {
        val article = articles.get(position)
        holder.imageView.setImageResource(article.imageId)
        holder.dateTextView.text = article.date
        holder.titleTextView.text = article.title
        holder.descTextView.text = article.desc

        holder.itemView.setOnClickListener {

            // For article 1
            val intent =Intent(holder.itemView.context, ArticleDetailsActivity::class.java)
                intent.putExtra("img", article.imageId)
                intent.putExtra("title", article.title)
                intent.putExtra("desc", article.desc)
                intent.putExtra("details", article.details)
                holder.itemView.context.startActivity(intent)
            
        }

    }

    override fun getItemCount(): Int {
        return articles.size
    }
}