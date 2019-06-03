package com.example.pdm_00024317.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pdm_00024317.database.daos.juegoDAO
import com.example.pdm_00024317.database.entities.juego
import java.security.AccessControlContext


@Database(entities = [juego::class],version = 1,exportSchema = false)
        public abstract class RoomDB:RoomDatabase() {

    abstract fun JuegoDAO():juegoDAO

    companion object{
        @Volatile
        private var INSTANCE:RoomDB?=null

        fun getInstance(
            context: Context
        ):RoomDB{
            val tempInstance= INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance= Room.databaseBuilder(context.applicationContext,RoomDB::class.java,"JuegoDatabase").build()
                INSTANCE=instance
                return instance
            }
        }
    }
}