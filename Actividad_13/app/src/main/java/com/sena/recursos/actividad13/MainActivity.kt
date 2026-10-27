package com.sena.recursos.actividad13

import android.os.Bundle
import android.view.View
import android.widget.*
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val background = findViewById<View>(R.id.background)
        findViewById<Button>(R.id.red).setOnClickListener { background.setBackgroundColor(Color.RED) }
        findViewById<Button>(R.id.green).setOnClickListener { background.setBackgroundColor(Color.GREEN) }
        findViewById<Button>(R.id.blue).setOnClickListener { background.setBackgroundColor(Color.BLUE) }
        findViewById<Button>(R.id.random).setOnClickListener {
            background.setBackgroundColor(Color.rgb((0..255).random(), (0..255).random(), (0..255).random()))
        }
    }
}
