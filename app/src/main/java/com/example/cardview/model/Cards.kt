package com.example.cardview.model

import com.example.cardview.R

data class Cards(
    var titulo: String = "",
    var comentario: String = "",
    var imagem: Int = 0

) {

    fun getPosts(): MutableList<Cards> {
        val listaDePosts = mutableListOf(
            Cards("Primeira Viagem", "Primeiro Post", R.drawable.imagem1),
            Cards("Segunda Viagem", "Segundo Post", R.drawable.imagem2),
            Cards("Terceira Viagem", "Terceiro Post", R.drawable.imagem3),
            Cards("Quarta Viagem", "Quarto Post", R.drawable.imagem4),
            Cards("Primeira Viagem", "Primeiro Post", R.drawable.imagem1),
            Cards("Segunda Viagem", "Segundo Post", R.drawable.imagem2),
            Cards("Terceira Viagem", "Terceiro Post", R.drawable.imagem3),
            Cards("Quarta Viagem", "Quarto Post", R.drawable.imagem4),
            Cards("Primeira Viagem", "Primeiro Post", R.drawable.imagem1),
            Cards("Segunda Viagem", "Segundo Post", R.drawable.imagem2),
            Cards("Terceira Viagem", "Terceiro Post", R.drawable.imagem3),
            Cards("Quarta Viagem", "Quarto Post", R.drawable.imagem4),
            Cards("Primeira Viagem", "Primeiro Post", R.drawable.imagem1),
            Cards("Segunda Viagem", "Segundo Post", R.drawable.imagem2),
            Cards("Terceira Viagem", "Terceiro Post", R.drawable.imagem3),
            Cards("Quarta Viagem", "Quarto Post", R.drawable.imagem4),
            Cards("Primeira Viagem", "Primeiro Post", R.drawable.imagem1),
            Cards("Segunda Viagem", "Segundo Post", R.drawable.imagem2),
            Cards("Terceira Viagem", "Terceiro Post", R.drawable.imagem3),
            Cards("Quarta Viagem", "Quarto Post", R.drawable.imagem4),
            Cards("Primeira Viagem", "Primeiro Post", R.drawable.imagem1),
            Cards("Segunda Viagem", "Segundo Post", R.drawable.imagem2),
            Cards("Terceira Viagem", "Terceiro Post", R.drawable.imagem3),
            Cards("Quarta Viagem", "Quarto Post", R.drawable.imagem4),
            Cards("Primeira Viagem", "Primeiro Post", R.drawable.imagem1),
            Cards("Segunda Viagem", "Segundo Post", R.drawable.imagem2),
            Cards("Terceira Viagem", "Terceiro Post", R.drawable.imagem3),
            Cards("Quarta Viagem", "Quarto Post", R.drawable.imagem4),
            Cards("Primeira Viagem", "Primeiro Post", R.drawable.imagem1),
            Cards("Segunda Viagem", "Segundo Post", R.drawable.imagem2),
            Cards("Terceira Viagem", "Terceiro Post", R.drawable.imagem3),
            Cards("Quarta Viagem", "Quarto Post", R.drawable.imagem4)
        )
        return listaDePosts
    }
}