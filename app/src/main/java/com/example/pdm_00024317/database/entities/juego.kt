package com.example.pdm_00024317.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity (tableName = "Juego")
class juego (
    @PrimaryKey (autoGenerate = true)
    @ColumnInfo(name = "id")
    val id : Int,

    @ColumnInfo(name = "Equipo 1")
    val eq1: String,

    @ColumnInfo(name = "Equipo 2")
    val eq2: String,

    @ColumnInfo(name = "Puntaje 1")
    val pun1: Int,

    @ColumnInfo(name = "Puntaje 2")
    val pun2: Int,

    @ColumnInfo(name = "Fecha")
    val date: String,

    @ColumnInfo(name = "Hora")
    val time: String,

    @ColumnInfo(name = "Ganador")
    val win: String






    )