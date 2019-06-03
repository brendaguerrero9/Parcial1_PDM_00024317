package com.example.pdm_00024317

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pdm_00024317.activities.opciones
import com.example.pdm_00024317.activities.register
import com.example.pdm_00024317.adapter.resultAdapter
import com.example.pdm_00024317.database.entities.juego
import com.example.pdm_00024317.database.viewmodels.juegoViewModel
import kotlinx.android.synthetic.main.activity_equipos.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resultados.*
import kotlinx.android.synthetic.main.resultado_cardview.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter:resultAdapter
    lateinit var viewModel:juegoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_login.setOnClickListener {
            val intent = Intent(this, opciones::class.java)
            startActivity(intent)
        }

        btn_singin.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }
    }

    fun bind() {
        adapter = resultAdapter(ArrayList())
        viewModel = ViewModelProviders.of(this).get(juegoViewModel::class.java)
        rv_result.apply {
            adapter = this@MainActivity.adapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
        viewModel.getAll().observe(this, Observer {
            adapter.updateList(it)
        })

        
    }


}
