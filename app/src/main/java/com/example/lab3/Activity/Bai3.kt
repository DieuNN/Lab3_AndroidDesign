package com.example.lab3.Activity

import android.content.Context
import android.media.Image
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.Model.Brand
import com.example.lab3.R
import org.w3c.dom.Text

class Bai3 : AppCompatActivity() {
    var adapter:BrandAdapter?= null
    var brandList = ArrayList<Brand>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai3)
        val gridView = findViewById<GridView>(R.id.gridViewBai3)

        brandList.add(Brand("Android", R.drawable.android))
        brandList.add(Brand("Facebook", R.drawable.facebook))
        brandList.add(Brand("Apple", R.drawable.apple))
        brandList.add(Brand("Chrome", R.drawable.chrome))
        brandList.add(Brand("Firefox", R.drawable.firefox))
        brandList.add(Brand("Dell", R.drawable.firefox))
        brandList.add(Brand("Blogger", R.drawable.blogger))
        brandList.add(Brand("Microsoft", R.drawable.microsoft))
        brandList.add(Brand("XBox", R.drawable.xbox))

        adapter = BrandAdapter(brandList, this)
        gridView.adapter= adapter

    }

    class BrandAdapter:BaseAdapter {
        var brandList = ArrayList<Brand>()
        var context:Context? = null

        constructor(brandList: ArrayList<Brand>, context: Context?) : super() {
            this.brandList = brandList
            this.context = context
        }



        override fun getCount(): Int {
            return brandList.size
        }

        override fun getItem(position: Int): Any {
           return position
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var brand = this.brandList[position]
            var view = LayoutInflater.from(context).inflate(R.layout.grid_view_item, parent, false)
            var brandImage = view.findViewById<ImageView>(R.id.imageBrandLogo)
            brandImage.setImageResource(brand.brandImage!!)
            var brandName = view.findViewById<TextView>(R.id.lblBrandName)
            brandName.text= brand.brandName
            return view
        }

    }



}