package com.example.practice1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = getIntent()
        var count = intent.getStringExtra("카운트")
        val range = (0..count!!.toInt())

        var text1 = findViewById<TextView>(R.id.text1)
        var text2 = findViewById<TextView>(R.id.text2)

        text1.text = "Here is a random number between 0 and " + count
        text2.text = range.random().toString()
    }
}