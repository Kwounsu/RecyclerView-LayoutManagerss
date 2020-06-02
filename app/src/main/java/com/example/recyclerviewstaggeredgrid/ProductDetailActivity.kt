package com.example.recyclerviewstaggeredgrid

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val imageView: ImageView = findViewById(R.id.detail_image)
        val nameView: TextView = findViewById(R.id.detail_name)
        val descriptionView: TextView = findViewById(R.id.detail_description)
        val mrpView: TextView = findViewById(R.id.detail_mrp)

        val bundle:Bundle? = intent.extras
        nameView.text = bundle?.get("nameKey") as CharSequence
        descriptionView.text = bundle.get("descriptionKey") as CharSequence
        mrpView.text = bundle.get("mrpKey") as CharSequence
        imageView.setImageResource(bundle.get("imageKey") as Int)
    }
}
