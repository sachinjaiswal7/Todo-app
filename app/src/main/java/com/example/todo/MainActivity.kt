package com.example.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val songsObject = ArrayList<song>()
        songsObject.add(song("kya mujhe pyaar","2008"))
        songsObject.add(song("tum mile","no name"))
        songsObject.add(song("beautiful","black clover"))
        songsObject.add(song("mai koi aisa geet gau","king"))
        songsObject.add(song("badshah o badshah","Badhsha Movie"))
        songsObject.add(song("kya mujhe pyaar","2008"))
        songsObject.add(song("tum mile","no name"))
        songsObject.add(song("beautiful","black clover"))
        songsObject.add(song("mai koi aisa geet gau","king"))
        songsObject.add(song("badshah o badshah","Badhsha Movie"))
        val rc = findViewById<RecyclerView>(R.id.RecyclerView)
        val myAdapter = MyAdapter(songsObject)
        val btn = findViewById<Button>(R.id.add_btn)
        btn.setOnClickListener {
            val add = findViewById<EditText>(R.id.add_text)
            if(add.text.isEmpty()){
                Toast.makeText(this,"write something in box to add",Toast.LENGTH_LONG).show()

            }
            else{
                songsObject.add(song(add.text.toString(),"something"))
                myAdapter.notifyDataSetChanged()
            }
        }
        rc.adapter = myAdapter
       val layout = LinearLayoutManager(this)
        layout.orientation = LinearLayoutManager.VERTICAL
        rc.layoutManager = layout
    }
}