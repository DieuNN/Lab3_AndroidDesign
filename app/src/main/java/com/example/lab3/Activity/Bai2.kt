package com.example.lab3.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import android.widget.SpinnerAdapter
import com.example.lab3.Adapter.SocialMediaAdapter
import com.example.lab3.Model.SocialMedia
import com.example.lab3.R

class Bai2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai2)

        var list:ArrayList<SocialMedia> = ArrayList()
        list.add(SocialMedia("Facebook", R.drawable.facebook))
        list.add(SocialMedia("Twitter", R.drawable.twitter))
        list.add(SocialMedia("Microsoft", R.drawable.microsoft))
        list.add(SocialMedia("Blogger", R.drawable.blogger))

        val spinner = findViewById<Spinner>(R.id.spinner)
        val adapter = SocialMediaAdapter(this, list )
        spinner.adapter =adapter

    }
}