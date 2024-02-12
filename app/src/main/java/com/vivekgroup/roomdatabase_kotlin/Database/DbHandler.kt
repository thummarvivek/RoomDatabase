package com.vivekgroup.roomdatabase_kotlin.Database

import android.content.Context
import androidx.room.Room

object DbHandler {
    fun getDb(context: Context) :  TableDb{
        return Room.databaseBuilder(context,TableDb::class.java,"TableData").allowMainThreadQueries().build()
    }
}