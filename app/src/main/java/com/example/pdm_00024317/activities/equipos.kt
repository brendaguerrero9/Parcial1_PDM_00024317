package com.example.pdm_00024317.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.pdm_00024317.R
import kotlinx.android.synthetic.main.activity_equipos.*

class equipos : AppCompatActivity() {

    var cont1:Int=0
    var cont2:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equipos)

        btn_update.setOnClickListener {
            tv_team1.text=et_team1.text
            tv_team2.text=et_team2.text
        }

        var btn1=findViewById(R.id.btn_libre) as Button
        var btn2=findViewById(R.id.btn_doble) as Button
        var btn3=findViewById(R.id.btn_triple) as Button

        var btn4=findViewById(R.id.btn_libre2) as Button
        var btn5=findViewById(R.id.btn_doble2) as Button
        var btn6=findViewById(R.id.btn_triple2) as Button

        var score1=findViewById(R.id.tv_score1) as TextView
        var score2=findViewById(R.id.tv_score2) as TextView

        btn1.setOnClickListener (){
            cont1 += 1
            score1.setText(cont1.toString())
        }

        btn2.setOnClickListener (){
            cont1 += 2
            score1.setText(cont1.toString())
        }

        btn3.setOnClickListener (){
            cont1 += 3
            score1.setText(cont1.toString())
        }

        btn4.setOnClickListener (){
            cont2 += 1
            score2.setText(cont2.toString())
        }

        btn5.setOnClickListener (){
            cont2 += 2
            score2.setText(cont2.toString())
        }

        btn6.setOnClickListener (){
            cont2 += 3
            score2.setText(cont2.toString())
        }




    }



}
