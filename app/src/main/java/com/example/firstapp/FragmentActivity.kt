package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstapp.fragments.FirstFragment

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.con, FirstFragment())
            .commit()
    }
}