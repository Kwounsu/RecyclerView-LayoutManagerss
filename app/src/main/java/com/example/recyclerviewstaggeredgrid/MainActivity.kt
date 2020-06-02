package com.example.recyclerviewstaggeredgrid

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = findViewById<RecyclerView>(R.id.recyclerView)
        val products = Product.getProduct(30)
        val adapter = Adapter(products)
        view.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        view.layoutManager = layoutManager
//        view.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL))
//        view.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))

        val linearButton: Button = findViewById(R.id.btn_linearLayout)
        val gridButton: Button = findViewById(R.id.btn_gridLayout)
        val staggeredButton: Button = findViewById(R.id.btn_staggeredLayout)

        linearButton.setOnClickListener {
            val layoutManager = LinearLayoutManager(this)
            view.layoutManager = layoutManager
        }

        gridButton.setOnClickListener {
            val layoutManager = GridLayoutManager(this, 2)
            view.layoutManager = layoutManager
        }

        staggeredButton.setOnClickListener {
            val layoutManager =
                StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            view.layoutManager = layoutManager
        }
    }
}
