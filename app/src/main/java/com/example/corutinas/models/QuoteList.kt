package com.example.corutinas.models

import com.google.gson.annotations.SerializedName

data class QuoteList (
   @SerializedName("count") val count: Int? = null,
   @SerializedName("lastItemIndex") val lastItemIndex: Int? = null,
   @SerializedName("page") val page: Int? = null,
   @SerializedName("results") val results: List<Result>? = null,
   @SerializedName("totalCount") val totalCount: Int? = null,
   @SerializedName("totalPages") val totalPages: Int? = null
)
