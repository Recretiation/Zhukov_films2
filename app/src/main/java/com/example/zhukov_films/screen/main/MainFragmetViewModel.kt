package com.example.zhukov_films.screen.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.zhukov_films.data.retrofit.api.RetrofitRepository
import com.example.zhukov_films.models.moviesModel
import kotlinx.coroutines.launch
import retrofit2.Response

class MainFragmentViewModel: ViewModel() {

    private val repository = RetrofitRepository()
    val myMovies: MutableLiveData<Response<moviesModel>> = MutableLiveData()

    fun getMovies(){
        viewModelScope.launch {
            myMovies.value = repository.getMovies()
        }

    }
}