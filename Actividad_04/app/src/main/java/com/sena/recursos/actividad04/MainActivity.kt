package com.sena.recursos.actividad04

import android.os.Bundle
import android.view.View
import android.widget.*
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.send).setOnClickListener {
            val message = findViewById<EditText>(R.id.message).text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}
