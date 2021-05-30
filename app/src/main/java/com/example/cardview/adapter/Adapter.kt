package com.example.cardview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cardview.R
import com.example.cardview.model.Cards

class Adapter(listaDePostscards: MutableList<Cards>) :
    RecyclerView.Adapter<Adapter.MyViewHolder>() {
    private val listaDePostscards = listaDePostscards

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemLista: View =
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_card, parent, false)

        return MyViewHolder(itemLista)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val post: Cards = listaDePostscards.get(position)
        holder.titulo.text = post.titulo
        holder.comentario.text = post.comentario
        holder.imagem.setImageResource(post.imagem)
    }

    override fun getItemCount(): Int {
        return listaDePostscards.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var titulo: TextView = itemView.findViewById(R.id.textTitulo)
        var comentario: TextView = itemView.findViewById(R.id.textComentario)
        var imagem: ImageView = itemView.findViewById(R.id.imageCard)
    }
}