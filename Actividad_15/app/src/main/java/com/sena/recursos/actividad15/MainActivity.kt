package com.sena.recursos.actividad15

import android.os.Bundle
import android.view.View
import android.widget.*
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pager = findViewById<androidx.viewpager2.widget.ViewPager2>(R.id.pager)
        pager.adapter = PageAdapter(listOf(Color.rgb(255, 220, 180), Color.rgb(180, 235, 200), Color.rgb(180, 220, 255)), false)
        pager.orientation = androidx.viewpager2.widget.ViewPager2.ORIENTATION_VERTICAL
    }

    private class PageAdapter(private val pages: List<Int>, private val images: Boolean) : androidx.recyclerview.widget.RecyclerView.Adapter<PageAdapter.Holder>() {
        class Holder(val view: android.widget.FrameLayout) : androidx.recyclerview.widget.RecyclerView.ViewHolder(view)
        override fun onCreateViewHolder(parent: android.view.ViewGroup, viewType: Int): Holder {
            val frame = android.widget.FrameLayout(parent.context)
            frame.layoutParams = android.view.ViewGroup.LayoutParams(-1, -1)
            return Holder(frame)
        }
        override fun getItemCount() = pages.size
        override fun onBindViewHolder(holder: Holder, position: Int) {
            holder.view.removeAllViews()
            holder.view.setBackgroundColor(pages[position])
            val label = android.widget.TextView(holder.view.context)
            label.text = if (images) listOf("🌄", "🌻", "🌊")[position] else "Página ${position + 1}"
            label.textSize = if (images) 90f else 30f
            label.gravity = android.view.Gravity.CENTER
            holder.view.addView(label, android.widget.FrameLayout.LayoutParams(-1, -1))
        }
    }
}
