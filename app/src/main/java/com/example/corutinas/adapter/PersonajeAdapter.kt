package com.example.corutinas.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.corutinas.R
import com.example.corutinas.holder.ViewholderPersonaje
import com.example.corutinas.models.Personaje
import com.example.corutinas.providers.PersonajeProvider

class PersonajeAdapter(context:Context, listaPersonaje: List<Personaje>): RecyclerView.Adapter<ViewholderPersonaje>() {

    private val inflater = LayoutInflater.from(context)

    private var items:List<Personaje> = listaPersonaje



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewholderPersonaje {
        return ViewholderPersonaje(inflater.inflate(R.layout.fragment_itempersonaje, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewholderPersonaje, position: Int) {
        val item = items[position]
        holder.render(item)
    }

}