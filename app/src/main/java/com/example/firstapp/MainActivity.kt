package com.example.firstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstButton = findViewById<Button>(R.id.firstButton)
        val implicitButton = findViewById<Button>(R.id.implicitButton)
        val recyclerViewButton = findViewById<Button>(R.id.recyclerViewId)
        val fragmentActivityButton = findViewById<Button>(R.id.fragmentActivityButton)

        val listViewActivityButton = findViewById<Button>(R.id.listViewActivityButton)

        val nameControl = findViewById<EditText>(R.id.name)


        firstButton.setOnClickListener(){
            val firstIntent = Intent(this,  FirstActivity::class.java)
            val nameValue = nameControl.text.toString()
            firstIntent.putExtra("UserName", nameValue)
            startActivity(firstIntent)
        }

        implicitButton.setOnClickListener() {
            val secondIntent = Intent(Intent.ACTION_VIEW)

            secondIntent.setData(Uri.parse("https://www.javatpoint.com/"))

            startActivity(secondIntent)
        }

        listViewActivityButton.setOnClickListener(){
            val firstIntent = Intent(this,  ListViewActivity::class.java)

            startActivity(firstIntent)
        }

        recyclerViewButton.setOnClickListener(){
            val firstIntent = Intent(this,  RecyclerViewActivity::class.java)

            startActivity(firstIntent)
        }


        fragmentActivityButton.setOnClickListener(){
            val firstIntent = Intent(this,  FragmentActivity::class.java)

            startActivity(firstIntent)
        }

        Log.v("Main Activity", "On Create method!")
    }

//    override fun onStart() {
//        super.onStart()
//        Log.v("Main Activity", "On Start method!")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.v("Main Activity", "On Resume method!")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.v("Main Activity", "On Pause method!")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.v("Main Activity", "On Stop method!")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.v("Main Activity", "On Destroy method!")
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        Log.v("Main Activity", "On Restar method!")
//    }
}