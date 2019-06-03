package com.example.pdm_00024317.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.pdm_00024317.R
import com.example.pdm_00024317.activities.result
import com.example.pdm_00024317.database.entities.juego
import kotlinx.android.synthetic.main.resultado_cardview.view.*

class resultAdapter (var items: List<juego>):RecyclerView.Adapter<resultAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.resultado_cardview,null,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(items[position])
    }

    fun updateList(newGames:List<juego>){
        this.items=newGames
        notifyDataSetChanged()
    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun bindItems(game:juego)= with(itemView){
            tv_team1.text=game.eq1
            tv_team2.text=game.eq2
            tv_puntaje1.text=game.pun1.toString()
            tv_puntaje2.text=game.pun2.toString()
            tv_date.text=game.date
            tv_time.text=game.time
            tv_winner.text=game.win

        }
    }
}