    package com.example.lab3.Activity

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.getSystemService
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3.Model.Brand
import com.example.lab3.R

class Bai3 : AppCompatActivity() {
    var brandList = ArrayList<Brand>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai3)



        brandList.add(Brand("Android", R.drawable.android))
        brandList.add(Brand("Facebook", R.drawable.facebook))
        brandList.add(Brand("Apple", R.drawable.apple))
        brandList.add(Brand("Chrome", R.drawable.chrome))
        brandList.add(Brand("Firefox", R.drawable.firefox))
        brandList.add(Brand("Dell", R.drawable.firefox))
        brandList.add(Brand("Blogger", R.drawable.blogger))
        brandList.add(Brand("Microsoft", R.drawable.microsoft))
        brandList.add(Brand("XBox", R.drawable.xbox))
        brandList.add(Brand("Android", R.drawable.android))
        brandList.add(Brand("Facebook", R.drawable.facebook))
        brandList.add(Brand("Apple", R.drawable.apple))
        brandList.add(Brand("Chrome", R.drawable.chrome))
        brandList.add(Brand("Firefox", R.drawable.firefox))
        brandList.add(Brand("Dell", R.drawable.firefox))
        brandList.add(Brand("Blogger", R.drawable.blogger))
        brandList.add(Brand("Microsoft", R.drawable.microsoft))
        brandList.add(Brand("XBox", R.drawable.xbox))

        var adapter:BrandAdapter?= null
        val gridView = findViewById<GridView>(R.id.gridViewBai3)
        adapter = BrandAdapter(brandList, this)
        gridView.adapter= adapter

    }

    class BrandAdapter:BaseAdapter {
        var brandList = ArrayList<Brand>()
        var context:Context? = null

        constructor(brandList: ArrayList<Brand>, context: Context) {
            this.brandList = brandList
            this.context = context
        }

        override fun getCount(): Int {
            return brandList.size
        }

        override fun getItem(position: Int): Brand {
           return brandList.get(position)
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }


//        https://www.programmersought.com/article/521751829/
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var view = convertView
            var holder:ViewHolder

            if(view == null) {
                view = LayoutInflater.from(context).inflate(R.layout.grid_view_item, null)
                holder = ViewHolder(view)
                view.tag = holder
            } else {
                holder = view.tag as ViewHolder
            }

            val brand = brandList[position]
            holder.image!!.setImageResource(brand.brandImage!!)
            holder.name!!.text = brand.brandName

            return view!!
        }
        inner class ViewHolder(view:View?) {
            val image:ImageView? = view!!.findViewById(R.id.imageBrandLogo)
            var name:TextView? = view!!.findViewById(R.id.lblBrandName)
        }
    }
}