package com.example.pdm_00024317.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pdm_00024317.R
import kotlinx.android.synthetic.main.activity_opciones.*

class opciones : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opciones)

        btn_match.setOnClickListener {
            val intent = Intent(this, equipos::class.java)
            startActivity(intent)
        }

        btn_result.setOnClickListener {
            val intent = Intent(this, resultados::class.java)
            startActivity(intent)
        }
    }
}
