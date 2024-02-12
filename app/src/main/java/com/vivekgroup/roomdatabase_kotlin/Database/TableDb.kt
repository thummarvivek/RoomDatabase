package com.vivekgroup.roomdatabase_kotlin.Database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Table ::class],
    version = 1
)

abstract class TableDb :RoomDatabase() {

    abstract  val  tableDao :TableDao
}