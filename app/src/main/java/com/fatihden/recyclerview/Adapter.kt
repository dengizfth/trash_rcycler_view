package com.fatihden.recyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fatihden.recyclerview.databinding.ActivityMainBinding
import com.fatihden.recyclerview.databinding.MainCardViewBinding

class Adapter(val kahListe:ArrayList<SuperKahraman>) :
    RecyclerView.Adapter<Adapter.ViewHolder>()  {
    class ViewHolder(val binding: MainCardViewBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = MainCardViewBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return kahListe.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvRecyclerView.text = kahListe[position].isim

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context , MainActivity2::class.java )
            Singleton.secilenKahramanSingleton = kahListe[position]
            //intent.putExtra("tiklananRecyclerItem",kahListe[position])
            holder.itemView.context.startActivity(intent)
        }




    }




}