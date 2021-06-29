package com.example.lab3.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.lab3.R

class MainActivity : AppCompatActivity() {
    //People think Kotlin is better than Java, but I don't think so. Java has developed above 30 years ago and being better day by day
    //Kotlin is sorter than Java, but Java is better for me to read the code :)
    //Nong Ngoc Dieu PH15766, https://github.com/DieuNN
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bai1:Button = findViewById(R.id.btnBai1)
        bai1.setOnClickListener {
            startActivity(Intent(this, Bai1::class.java))
        }

        val bai2:Button = findViewById(R.id.btnBai2)
        bai2.setOnClickListener {
            startActivity(Intent(this, Bai2::class.java))
        }

        val bai3:Button = findViewById(R.id.btnBai3)
        bai3.setOnClickListener {
            startActivity(Intent(this, Bai3::class.java))
        }

        val bai4:Button = findViewById(R.id.btnbai4)
        bai4.setOnClickListener {
            startActivity(Intent(this, Bai4::class.java))
        }
    }
}