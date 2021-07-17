package com.example.lab3.Activity

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.Adapter.PhoneAdapter
import com.example.lab3.Model.Phone
import com.example.lab3.R
import com.example.lab3.database.Database
import com.example.lab3.database.PhoneDB


class MyCustomAdapter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_custom_adapter)


        val database = Database(this)
        val phoneDB = PhoneDB(database)

        var phoneList = ArrayList<Phone>()

        phoneDB.newPhone(Phone("iPhone 11", 14.490, R.drawable.iphone_12))
        phoneDB.newPhone(Phone("Galaxy S21", 21.000, R.drawable.samsung_galaxy_s21_plus))
        phoneDB.newPhone(Phone("Galaxy Note 20", 19.990, R.drawable.samsing_galaxy_note_20))
        phoneDB.newPhone(Phone("Asus Vivobook", 15.990, R.drawable.laptop_asus_vivobook))



         var adapter:PhoneAdapter = PhoneAdapter(this, phoneDB.getAllPhone())
        var listView:GridView = findViewById(R.id.my_grid_view)
        listView.adapter = adapter
    }
}