package com.example.corutinas.models

import com.google.gson.annotations.SerializedName

data class PerroResponse(
   @SerializedName("status") val status: String ? = null,
   @SerializedName("message") val message: List<String> ? = null
)
