package com.vivekgroup.roomdatabase_kotlin.Database

import android.text.Editable
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TableDao {
    @Insert
    fun insertData(table: Table)

    @Query("Select * from `Table`")
    fun getData(): List<Table>

    @Query("Delete from `Table` where id = :id ")
    fun getDelete(id: Int)



    @Query("UPDATE `Table` SET Name= :Name,Email =:Email where id = :id ")
    fun getUpdate(id: Int, Name:String ,Email:String)
}