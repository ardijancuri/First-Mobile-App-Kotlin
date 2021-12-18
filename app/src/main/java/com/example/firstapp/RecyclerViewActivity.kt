package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.firstapp.adapters.BasicRecyclerViewAdapter
import com.example.firstapp.models.Student

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val data: MutableList<Student> = initList();

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewComponent)

        // Ova svojstvo se postavuva koga sme sigurni deka sekoj ITEM od listat ima fiksna golemina (shirina, visina)
        //recyclerView.setHasFixedSize(true)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val recyclerViewAdapter = BasicRecyclerViewAdapter(this, data)

        recyclerView.adapter = recyclerViewAdapter
    }


    private fun initList(): MutableList<Student> {
        return mutableListOf(
            Student("Dimitar", "Kitanovski", 11111),
            Student("Vlatko", "Spasev", 22222),
            Student("Stefan", "Andonov", 33333),
            Student("Marko", "Markovik", 33333),
            Student("Bojan", "Dabevski", 33333),
            Student("Vladimir", "Stojceski", 33333)
        );
    }
}