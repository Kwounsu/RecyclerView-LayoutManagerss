package com.example.recyclerviewstaggeredgrid

class Product (val id:Int, val name:String, val description:String, val mrp:String, val image:Int) {
    companion object {
        private val products = ArrayList<Product>()
        fun getProduct(size:Int):ArrayList<Product> {
            for(i in 1..size) {
                if (i%4 == 0) {
                    val product = Product(i,"AirPod", "Description $i", "MRP $i", R.drawable.airpod)
                    products.add(product)
                } else if (i % 3 == 0) {
                    val product = Product(i,"Bose QC35", "Description $i", "MRP $i", R.drawable.boseqc35)
                    products.add(product)
                } else {
                    val product = Product(i,"Sony WH 1000XM3", "Description $i", "MRP $i", R.drawable.sony)
                    products.add(product)
                }
            }
            return products
        }
    }
}