package com.example.pdm_00024317.database.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.pdm_00024317.database.RoomDB
import com.example.pdm_00024317.database.entities.juego
import com.example.pdm_00024317.database.repositories.juegoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class juegoViewModel(app:Application): AndroidViewModel(app) {

    private val repository : juegoRepository

    init {
        val JuegoDAO=RoomDB.getInstance(app).JuegoDAO()
        repository= juegoRepository(JuegoDAO)
    }

    fun getAll():LiveData<List<juego>> = repository.getAll()

    fun insert(game:juego)=viewModelScope.launch(Dispatchers.IO){
        repository.insert(game)
    }


}
