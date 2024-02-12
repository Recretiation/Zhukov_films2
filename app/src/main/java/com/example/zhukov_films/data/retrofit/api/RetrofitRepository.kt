package com.example.zhukov_films.data.retrofit.api

import com.example.zhukov_films.models.moviesModel
import retrofit2.Response

class RetrofitRepository {
    suspend fun getMovies(): Response<moviesModel> {
        return RetrofitInstance.api.getPopularMovie()
    }
}