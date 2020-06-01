package com.example.recyclerviewstaggeredgrid

class Product (val name:String, val description:String, val mrp:String, val image:Int) {
    companion object {
        private val products = ArrayList<Product>()
        fun getProduct(size:Int):ArrayList<Product> {
            for(i in 1..size) {
                if (i%4 == 0) {
                    val product = Product("AirPod $i", "Description $i", "MRP $i", R.drawable.airpod)
                    products.add(product)
                } else if (i % 3 == 0) {
                    val product = Product("Bose QC35 $i", "Description $i", "MRP $i", R.drawable.boseqc35)
                    products.add(product)
                } else {
                    val product = Product("Sony WH 1000XM3 $i", "Description $i", "MRP $i", R.drawable.sony)
                    products.add(product)
                }
            }
            return products
        }
    }
}