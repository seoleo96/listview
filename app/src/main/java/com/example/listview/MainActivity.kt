package com.example.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val arrayList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numbers = numbers()
        val listView = findViewById<ListView>(R.id.list_view_id)
        val arrayAdapter = ArrayAdapter(this, R.layout.row_list_view, R.id.text_of_lists, numbers)
        listView.adapter = arrayAdapter
    }

    private fun numbers(): ArrayList<String> {
        for (i in 1 until 11) {
            arrayList.add("$i's element")
        }
        return arrayList
    }
}
