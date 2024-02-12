package com.vivekgroup.roomdatabase_kotlin.Database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Table (

    var Name : String,
    var Email :String,
    @PrimaryKey(autoGenerate = true)
    var id :Int =0

)