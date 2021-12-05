package com.example.todo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val songs:ArrayList<song>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val inflator = LayoutInflater.from(parent.context)
        val view = inflator.inflate(R.layout.todo_item_activity,parent,false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.head.text = songs[position].head
        holder.body.text = songs[position].body

    }

    override fun getItemCount(): Int {
        return songs.size
    }
   inner class MyViewHolder(view:View): RecyclerView.ViewHolder(view) {
    val head = view.findViewById<TextView>(R.id.head_text)
       val body = view.findViewById<TextView>(R.id.body_text)
    }
}
