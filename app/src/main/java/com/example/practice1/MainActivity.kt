package com.example.practice1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text = findViewById<TextView>(R.id.text)
        text.text = "0"

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val intent = Intent(this, SecondActivity::class.java)

        button1.setOnClickListener {
            Toast.makeText(this, "Toast Message", Toast.LENGTH_SHORT).show()
        }
        var count = 0
        button2.setOnClickListener {
            count++
            text.text = count.toString()
            intent.putExtra("카운트", count.toString())
            if(count == 20) count = 0
        }



        button3.setOnClickListener {
            startActivity(intent)
        }
    }
}