package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val bundle : Bundle? = intent.extras

        val userNameControl = findViewById<TextView>(R.id.username)

        if(bundle != null) {
            val userName = bundle.get("UserName")
            userNameControl.setText("")
            userNameControl.setText("Hello: "+ userName.toString())
        }

        val backButton = findViewById<Button>(R.id.backButton)

        backButton.setOnClickListener(){
            val backIntent = Intent(this, MainActivity::class.java)

            startActivity(backIntent)
        }

    }
}