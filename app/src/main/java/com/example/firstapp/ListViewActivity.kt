package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.firstapp.adapters.BasicListViewAdapter
import com.example.firstapp.models.Student

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val data: MutableList<Student> = initList()

        val listViewComponent = findViewById<ListView>(R.id.basicListView)

        val basicAdapter = BasicListViewAdapter(this, data)

        listViewComponent.adapter = basicAdapter
    }

    private fun initList(): MutableList<Student> {
        return mutableListOf(
            Student("Dimitar", "Kitanovski", 11111),
            Student("Vlatko", "Spasev", 22222),
            Student("Stefan", "Andonov", 33333));
    }
}