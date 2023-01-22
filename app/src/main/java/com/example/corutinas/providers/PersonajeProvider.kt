package com.example.corutinas.providers

import com.example.corutinas.models.Personaje

class PersonajeProvider {
    companion object{

        var listaPersonajes = mutableListOf<Personaje>(
            Personaje("Rick Sanchez", "Alive", "Earth (C-137)", "https://rickandmortyapi.com/api/character/avatar/1.jpeg"),
            Personaje("Morty Smith", "Alive", "Earth (C-137)", "https://rickandmortyapi.com/api/character/avatar/2.jpeg"),
            Personaje("Summer Smith", "Alive", "Earth (C-137)", "https://rickandmortyapi.com/api/character/avatar/3.jpeg"),
            Personaje("Beth Smith", "Alive", "Earth (C-137)", "https://rickandmortyapi.com/api/character/avatar/4.jpeg"),
            Personaje("Jerry Smith", "Alive", "Earth (C-137)", "https://rickandmortyapi.com/api/character/avatar/5.jpeg"),
            Personaje("Abadango Cluster Princess", "Alive", "Abadango", "https://rickandmortyapi.com/api/character/avatar/6.jpeg"),
            Personaje("Abradolf Lincler", "unknown", "unknown", "https://rickandmortyapi.com/api/character/avatar/7.jpeg"),
            Personaje("Adjudicator Rick", "Dead", "Citadel of Ricks", "https://rickandmortyapi.com/api/character/avatar/8.jpeg"),
            Personaje("Agency Director", "Dead", "Earth (Replacement Dimension)", "https://rickandmortyapi.com/api/character/avatar/9.jpeg"),
            Personaje("Alan Rails", "Alive", "Earth (C-137)", "https://rickandmortyapi.com/api/character/avatar/10.jpeg"),
        )
    }
}