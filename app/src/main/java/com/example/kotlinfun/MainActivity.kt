package com.example.kotlinfun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView:TextView
    var count = 0

    fun reset(view: View) {
        count =0
        textView.text = count.toString()
    }

    fun plusOne(view: View) {
        count ++
        //textView.setText(count.toString()) Old school :)
        textView.text = count.toString()

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      textView  = findViewById<TextView>(R.id.textView)
        textView.text = "0"

        }

    }



