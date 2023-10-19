package com.example.c1messageshowapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //now attach layout to  second activity
        setContentView(R.layout.activity_second)
    }
}