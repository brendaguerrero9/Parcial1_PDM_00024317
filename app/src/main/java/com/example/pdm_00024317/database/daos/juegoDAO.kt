package com.example.pdm_00024317.database.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.pdm_00024317.database.entities.juego


@Dao
interface juegoDAO {

    @Query("SELECT * FROM Juego")
    fun getAll(): LiveData<List<juego>>

    @Insert
    suspend fun insert(game:juego)

}