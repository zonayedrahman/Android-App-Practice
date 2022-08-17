package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // button reference
        findViewById<Button>(R.id.button).setOnClickListener{
            findViewById<TextView>(R.id.textView).setTextColor(resources.getColor(R.color.white))
        }

    }
}