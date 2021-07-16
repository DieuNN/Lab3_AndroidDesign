package com.example.lab3.database

import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import com.example.lab3.Model.Phone

class PhoneDB(private val db: Database) {
    private var sqlDatabase:SQLiteDatabase? = null

    fun getAllPhone():ArrayList<Phone> {
        var list = ArrayList<Phone>()
        sqlDatabase = db.writableDatabase
        val cursor:Cursor = sqlDatabase!!.rawQuery("SELECT * FROM ${Database.TABLE_PHONE}", null)

        if(cursor.count >0) {
            cursor.moveToFirst()
            while (!cursor.isAfterLast) {
                var phone = Phone()
                phone.name = cursor.getString(0)
                phone.price = cursor.getDouble(1)
                phone.image = cursor.getInt(2)
                list.add(phone)

                cursor.moveToNext()

            }
        }

        cursor.close()
        return list
    }

    fun newPhone(phone: Phone): Boolean {
        sqlDatabase = db.writableDatabase

        var contentValue = ContentValues()
        contentValue.put("NAME", phone.name)
        contentValue.put("PRICE", phone.price)
        contentValue.put("IMAGE", phone.image)

        return sqlDatabase!!.insert(Database.TABLE_PHONE, null, contentValue) > 0

    }


}