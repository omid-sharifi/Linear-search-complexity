package com.example.c1messageshowapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {

            Log.i("MainActivity", "Button was clicked !")
            //log statement help to log out the values and it is visible for the developer not to the user

            Toast.makeText(this, "Button was clicked !", Toast.LENGTH_SHORT).show()
        }

    }

}