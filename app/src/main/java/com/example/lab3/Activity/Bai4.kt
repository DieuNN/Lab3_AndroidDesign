package com.example.lab3.Activity

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.Model.People
import com.example.lab3.R

class Bai4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai4)
        var people = ArrayList<People>()

        people.add(People("Kimbap", R.drawable.kimbap))
        people.add(People("Kimchi", R.drawable.kimchi))
        people.add(People("Kim Hee Sun", R.drawable.kimheesun))
        people.add(People("Kim Nam Joo", R.drawable.kimnamjoo))
        people.add(People("Kim So Eun", R.drawable.kimsoeun))
        people.add(People("Kim Tae Hee", R.drawable.kimtaehee))
        people.add(People("Kimbap", R.drawable.kimbap))
        people.add(People("Kimchi", R.drawable.kimchi))
        people.add(People("Kim Hee Sun", R.drawable.kimheesun))
        people.add(People("Kim Nam Joo", R.drawable.kimnamjoo))
        people.add(People("Kim So Eun", R.drawable.kimsoeun))
        people.add(People("Kim Tae Hee", R.drawable.kimtaehee))
        people.add(People("Kimbap", R.drawable.kimbap))
        people.add(People("Kimchi", R.drawable.kimchi))
        people.add(People("Kim Hee Sun", R.drawable.kimheesun))
        people.add(People("Kim Nam Joo", R.drawable.kimnamjoo))
        people.add(People("Kim So Eun", R.drawable.kimsoeun))
        people.add(People("Kim Tae Hee", R.drawable.kimtaehee))

        var listView: ListView = findViewById(R.id.listViewBai4)
        listView.adapter = MyAdapter(this, people)


    }

    class MyAdapter : BaseAdapter {
        var context: Context? = null
        var people: ArrayList<People> = ArrayList()

        constructor(context: Context, list: ArrayList<People>) {
            this.context = context
            this.people = list
        }


        override fun getCount(): Int {
            return people.size
        }

        override fun getItem(position: Int): People {
            return people[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var view = convertView
            val viewHolder: ViewHolder

            if (convertView == null) {
                view = LayoutInflater.from(context).inflate(R.layout.list_view_row_bai4, null)
                viewHolder = ViewHolder()

                viewHolder.peopleName = view.findViewById(R.id.lblPeopleName)
                viewHolder.peopleImage = view.findViewById(R.id.imageListViewBai4)

                view.tag = viewHolder

            } else {
                viewHolder = view!!.tag as ViewHolder
            }


            viewHolder.peopleName.text = people[position].name!!
            viewHolder.peopleImage.setImageResource(people[position].image!!)
            return view!!

        }

        inner class ViewHolder {
            lateinit var peopleName: TextView
            lateinit var peopleImage: ImageView
        }

    }
}
