package com.sena.recursos.actividad10

import android.os.Bundle
import android.view.View
import android.widget.*
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count = 0
        val counter = findViewById<TextView>(R.id.counter)
        findViewById<Button>(R.id.count).setOnClickListener {
            count++
            counter.text = count.toString()
        }
    }
}
