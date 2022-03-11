package com.android.buttons

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    lateinit var button1 : Button
    lateinit var magic : Button
    lateinit var myText : TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        magic = findViewById(R.id.doMagic)
        button1 = findViewById(R.id.myButton)
        myText = findViewById(R.id.textExample)

        magic.setOnClickListener(){

            magic.setBackgroundColor(Color.BLACK)
            myText.text = "I have done magic"
            myText.isVisible = false
            magic.isVisible = false
        }

        button1.setOnClickListener{
            myText.isVisible = true
            magic.isVisible = true
        }
    }
}