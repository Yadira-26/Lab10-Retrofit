package com.example.lab10retrofit.data

data class SerieModel(
    @SerializedName("id")
    var id:Int,
    @SerializedName("name")
    var name:String,
    @SerializedName("release_date")
    var release_date:String,
    @SerializedName("rating")
    var rating:Int,
    @SerializedName("category")
    var category:String
)
