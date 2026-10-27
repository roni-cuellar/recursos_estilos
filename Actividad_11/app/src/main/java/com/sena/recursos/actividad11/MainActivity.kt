package com.sena.recursos.actividad11

import android.os.Bundle
import android.view.View
import android.widget.*
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val check = findViewById<CheckBox>(R.id.check)
        findViewById<Button>(R.id.toggle).setOnClickListener { check.isChecked = !check.isChecked }
    }
}
