package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // button reference
        findViewById<Button>(R.id.change_text_color).setOnClickListener{
            findViewById<TextView>(R.id.textView).setTextColor(resources.getColor(R.color.white))
        }

        findViewById<Button>(R.id.change_background).setOnClickListener{
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(resources.getColor(R.color.black))
            findViewById<TextInputEditText>(R.id.text_edit_field).setBackgroundColor(resources.getColor(R.color.black))
        }

        findViewById<ConstraintLayout>(R.id.backgroundView).setOnClickListener{
            findViewById<TextView>(R.id.textView).setTextColor(resources.getColor(R.color.default_color))
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(resources.getColor(R.color.white))
            findViewById<TextInputEditText>(R.id.text_edit_field).setBackgroundColor(resources.getColor(R.color.white))

        }

        findViewById<Button>(R.id.change_text).setOnClickListener{
            findViewById<TextView>(R.id.textView).text = "Goodbye 👋"
        }


//        findViewById<TextInputEditText>(R.id.text_edit_field).setOnFocusChangeListener()

    }
}