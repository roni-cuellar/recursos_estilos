package com.sena.recursos.actividad07

import android.os.Bundle
import android.view.View
import android.widget.*
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val result = findViewById<TextView>(R.id.result)
        val product = findViewById<EditText>(R.id.product)
        val quantity = findViewById<EditText>(R.id.quantity)
        findViewById<Button>(R.id.add).setOnClickListener { result.text = "${product.text}: ${quantity.text}" }
        findViewById<Button>(R.id.update).setOnClickListener { result.text = "${product.text}: ${quantity.text}" }
        findViewById<Button>(R.id.delete).setOnClickListener { result.text = "" }
    }
}
