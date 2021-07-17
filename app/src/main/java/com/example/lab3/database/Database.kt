package com.example.lab3.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class Database(context:Context?) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    companion object {
        const val DATABASE_NAME = "PHONE_DATABASE"
        const val TABLE_PHONE = "PHONE"
        const val DATABASE_VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val tablePhone = "CREATE TABLE $TABLE_PHONE (NAME TEXT PRIMARY KEY, PRICE REAL, IMAGE INTEGER)"
        db!!.execSQL(tablePhone)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        if (newVersion < oldVersion) {
            db!!.execSQL("DROP TABLE $TABLE_PHONE")
        }
    }

}
