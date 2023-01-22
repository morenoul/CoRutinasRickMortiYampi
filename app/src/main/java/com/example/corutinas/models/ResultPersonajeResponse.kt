package com.example.corutinas.models

import com.google.gson.annotations.SerializedName

data class ResultPersonajeResponse(
   @SerializedName("info") val info: InfoResponse? = null,
   @SerializedName("results") val results: List<ResultDataResponse>? = null
)
