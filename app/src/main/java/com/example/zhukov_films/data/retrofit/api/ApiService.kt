package com.example.zhukov_films.data.retrofit.api

import com.example.zhukov_films.models.moviesModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("api/v2.2/films/top?Type=TOP_100_POPULAR_FILMS")
    suspend fun getPopularMovie(): Response<moviesModel>

}