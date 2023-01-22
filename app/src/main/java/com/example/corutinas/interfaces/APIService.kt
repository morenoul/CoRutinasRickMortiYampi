package com.example.corutinas.interfaces

import com.example.corutinas.models.PerroResponse
import com.example.corutinas.models.Personaje
import com.example.corutinas.models.QuoteList
import com.example.corutinas.models.ResultPersonajeResponse

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {
    @GET("akita/images")
    suspend fun getQuotesApi(): Response<PerroResponse>
    @GET("character")
    suspend fun getPersonajesApi(): Response<ResultPersonajeResponse>
}