package com.sena.recursos.actividad12

import android.os.Bundle
import android.view.View
import android.widget.*
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val screen = findViewById<TextView>(R.id.screen)
        var expression = ""
        val buttons = listOf(R.id.key0, R.id.key1, R.id.key2, R.id.key3, R.id.key4,
            R.id.key5, R.id.key6, R.id.key7, R.id.key8, R.id.key9,
            R.id.keyplus, R.id.keyminus, R.id.keytimes, R.id.keydivide)
        buttons.forEach { id ->
            findViewById<Button>(id).setOnClickListener { view ->
                expression += (view as Button).text.toString()
                screen.text = expression
            }
        }
        findViewById<Button>(R.id.keyclear).setOnClickListener {
            expression = ""
            screen.text = "0"
        }
        findViewById<Button>(R.id.keyequal).setOnClickListener {
            val match = Regex("""^(-?\d+)([+*/-])(-?\d+)$""").matchEntire(expression)
            if (match == null) {
                screen.text = "Error"
            } else {
                val (left, operator, right) = match.destructured
                val a = left.toDouble()
                val b = right.toDouble()
                val result = when (operator) {
                    "+" -> a + b
                    "-" -> a - b
                    "*" -> a * b
                    else -> if (b == 0.0) Double.NaN else a / b
                }
                expression = if (result.isFinite()) result.toString() else ""
                screen.text = if (expression.isEmpty()) "Error" else expression
            }
        }
    }
}
