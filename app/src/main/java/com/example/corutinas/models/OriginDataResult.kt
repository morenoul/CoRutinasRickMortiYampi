package com.example.corutinas.models

import com.google.gson.annotations.SerializedName

data class OriginDataResult(
    @SerializedName("name") val name: String ? = null,
    @SerializedName("url") val url: String ? = null
)
