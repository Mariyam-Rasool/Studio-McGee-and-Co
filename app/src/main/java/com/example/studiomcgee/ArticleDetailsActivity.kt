package com.example.studiomcgee


import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ArticleDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_details)

        val img = intent.getIntExtra("img", 0)
        val title = intent.getStringExtra("title")
        val desc = intent.getStringExtra("desc")
        val details = intent.getStringExtra("details")

        findViewById<ImageView>(R.id.img1).setImageResource(img)
        findViewById<TextView>(R.id.title1).text=title
        findViewById<TextView>(R.id.desc1).text=desc
        findViewById<TextView>(R.id.details).text=details

    }
}