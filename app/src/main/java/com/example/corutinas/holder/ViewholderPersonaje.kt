package com.example.corutinas.holder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.corutinas.databinding.FragmentItempersonajeBinding
import com.example.corutinas.models.Personaje

class ViewholderPersonaje(inflate: View):RecyclerView.ViewHolder(inflate) {
    private val binding = FragmentItempersonajeBinding.bind(inflate)

    fun render(item: Personaje) {
        binding.nombre.text = item.name
        binding.estado.text = item.status
        binding.Location.text = item.location
        Glide.with(binding.imageView3.context).load(item.image).into(binding.imageView3)
    }
}
