package com.example.lab3.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.lab3.Model.Phone
import com.example.lab3.R

class PhoneAdapter(context: Context, phoneList:ArrayList<Phone>) : ArrayAdapter<Phone>(context, 0, phoneList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view  = LayoutInflater.from(context).inflate(R.layout.phone_listview, null)
        var image = view.findViewById<ImageView>(R.id.image_phone)
        var name = view.findViewById<TextView>(R.id.textview_phone_name)
        var price = view.findViewById<TextView>(R.id.textview_phone_price)

        getItem(position)!!.image?.let { image.setImageResource(it) }
        name.text = getItem(position)!!.name
        price.text = "${getItem(position)!!.price}"

        return view
    }
}