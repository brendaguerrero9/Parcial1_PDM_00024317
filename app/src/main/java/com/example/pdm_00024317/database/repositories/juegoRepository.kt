package com.example.pdm_00024317.database.repositories

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.pdm_00024317.database.daos.juegoDAO
import com.example.pdm_00024317.database.entities.juego

class juegoRepository(private val JuegoDAO:juegoDAO) {

    fun getAll():LiveData<List<juego>> = JuegoDAO.getAll()

    @WorkerThread
    suspend fun insert(game: juego)=JuegoDAO.insert(game)
}