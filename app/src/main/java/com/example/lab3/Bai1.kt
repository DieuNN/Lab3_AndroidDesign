package com.example.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import java.util.*
import java.util.logging.Level.parse
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class Bai1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai1)

        var list = ArrayList<HashMap<String, Any>>()
        var hashMap = HashMap<String, Any>()

        hashMap.put("ten", "hancook")
        hashMap.put("hinh", R.drawable.hancock)
        hashMap.put("tuoi", "18")
        list.add(hashMap)

        hashMap = HashMap()
        hashMap.put("ten", "shank")
        hashMap.put("hinh", R.drawable.shank)
        hashMap.put("tuoi", "35")
        list.add(hashMap)

        val from = arrayOf("ten", "tuoi", "hinh")
        val to = intArrayOf(R.id.lblNameSimpleAdapter, R.id.lblAgeSimpleAdapter, R.id.imgSimpleAdapter)

        val adapter:SimpleAdapter = SimpleAdapter(this, list, R.layout.simple_adapter_row, from, to)
        val listView:ListView = findViewById(R.id.listViewSimpleAdapter)
        listView.adapter = adapter





    }
}