package com.vivekgroup.roomdatabase_kotlin.Database

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.vivekgroup.roomdatabase_kotlin.R

class MyAdapter (private val context: Context,private val dataList: List<Table>) :
        RecyclerView.Adapter<MyAdapter.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val view =LayoutInflater.from(context).inflate(R.layout.datacustom,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
       val currentItem =dataList[position]
        holder.bind(currentItem)
    }

    override fun getItemCount(): Int {
       return dataList.size
    }

    inner class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        private val id: TextView = itemView.findViewById(R.id.idsh)
        private val name: TextView = itemView.findViewById(R.id.namesh)
        private val email: TextView = itemView.findViewById(R.id.emailsh)

        fun bind(item :Table)
        {
            id.text =item.id.toString()
            name.text =item.Name
            email.text=item.Email
        }

    }

}