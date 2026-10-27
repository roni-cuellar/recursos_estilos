package com.sena.recursos.actividad16

import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pager = findViewById<ViewPager2>(R.id.pager)
        val imagenes = listOf(R.drawable.paisaje_1, R.drawable.paisaje_2, R.drawable.paisaje_3)
        pager.adapter = ImagenAdapter(imagenes)
    }

    private class ImagenAdapter(private val imagenes: List<Int>) :
        RecyclerView.Adapter<ImagenAdapter.ImagenHolder>() {

        class ImagenHolder(val imagen: ImageView) : RecyclerView.ViewHolder(imagen)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagenHolder {
            val imagen = ImageView(parent.context)
            imagen.layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            imagen.scaleType = ImageView.ScaleType.FIT_CENTER
            return ImagenHolder(imagen)
        }

        override fun getItemCount(): Int = imagenes.size

        override fun onBindViewHolder(holder: ImagenHolder, position: Int) {
            holder.imagen.setImageResource(imagenes[position])
        }
    }
}
