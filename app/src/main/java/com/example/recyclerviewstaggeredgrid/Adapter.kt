package com.example.recyclerviewstaggeredgrid

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Adapter (private val products:ArrayList<Product>):RecyclerView.Adapter<Adapter.ViewHolder>(){
    private lateinit var context: Context

    inner class ViewHolder (view: View): RecyclerView.ViewHolder(view){
        val productName : TextView = view.findViewById(R.id.productName)
        val productDescription : TextView = view.findViewById(R.id.productDescription)
        val productMRP : TextView = view.findViewById(R.id.productMRP)
        val productImage : ImageView = view.findViewById(R.id.productImage)
        private val detailButton : Button = view.findViewById(R.id.btn_showDetail)
        lateinit var product:Product
        init {
            detailButton.setOnClickListener {
                val intent = Intent (context, ProductDetailActivity::class.java)
                intent.putExtra("nameKey",productName.text)
                intent.putExtra("descriptionKey",productDescription.text)
                intent.putExtra("mrpKey",productMRP.text)
                intent.putExtra("imageKey",product.image)
                context.startActivity(intent)
                Toast.makeText(context,"clicked",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_layout,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val product = products[position]
        holder.productName.text = product.name
        holder.productDescription.text = product.description
        holder.productMRP.text = product.mrp
        holder.productImage.setImageResource(product.image)
        holder.product = product
    }

}