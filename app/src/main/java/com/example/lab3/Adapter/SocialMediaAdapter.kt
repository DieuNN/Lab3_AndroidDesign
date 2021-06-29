package com.example.lab3.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.lab3.Model.SocialMedia
import com.example.lab3.R
import org.w3c.dom.Text

class SocialMediaAdapter(context: Context, socialMedia: List<SocialMedia>):ArrayAdapter<SocialMedia>(context, 0, socialMedia) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    private fun initView(position: Int, convertView: View?, parent: ViewGroup):View {
        val socialMedia = getItem(position)
        val convertView = LayoutInflater.from(context).inflate(R.layout.custom_spinner_row, parent, false)
        val image = convertView.findViewById<ImageView>(R.id.imageSocialMediaSpinner)
        val name = convertView.findViewById<TextView>(R.id.lblSocialMediaName)

        image.setImageResource(socialMedia!!.image)
        name.text = socialMedia.name
        return convertView

    }


}