package com.vivekgroup.roomdatabase_kotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vivekgroup.roomdatabase_kotlin.Database.DbHandler
import com.vivekgroup.roomdatabase_kotlin.Database.MyAdapter
import com.vivekgroup.roomdatabase_kotlin.Database.Table

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter :MyAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycle)
        recyclerView.layoutManager = LinearLayoutManager(this)


        var  db =DbHandler.getDb(this)
        val dataList =db.tableDao.getData()
        adapter = MyAdapter(this, dataList)
        recyclerView.adapter = adapter
        var edit0 =findViewById<EditText>(R.id.edit1)
        var edit01 =findViewById<EditText>(R.id.edit2)
        var edit02 =findViewById<EditText>(R.id.edit3)
        var btn =findViewById<Button>(R.id.button)
        var btn2 =findViewById<Button>(R.id.button2)
        var btn3 =findViewById<Button>(R.id.button3)


        btn.setOnClickListener{
            //insert
            val txt1 =edit01.text.toString()
            val txt2 =edit02.text.toString()
            db.tableDao.insertData(Table(txt1,txt2))
            println(  db.tableDao.getData())


        }

        btn2.setOnClickListener {
//          delete
            val txt0 =edit0.text.toString().toInt()
            val txt1 =edit01.text.toString()
            val txt2 =edit02.text.toString()
            db.tableDao.getUpdate(txt0,txt1,txt2)
        }


        btn3.setOnClickListener {
//          delete
            val txt0 =edit0.text.toString().toInt()
            db.tableDao.getDelete(txt0)
        }
    }
}