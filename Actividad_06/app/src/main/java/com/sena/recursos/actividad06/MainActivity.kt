package com.sena.recursos.actividad06

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
            val group = findViewById<RadioGroup>(R.id.options)
            val selected = group.checkedRadioButtonId
            val answer = if (selected == -1) "Select an answer" else findViewById<RadioButton>(selected).text.toString()
            Toast.makeText(this, answer, Toast.LENGTH_SHORT).show()
        }
    }
}
