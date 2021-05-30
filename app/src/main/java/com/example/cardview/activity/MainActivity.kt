package com.example.cardview.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cardview.R
import com.example.cardview.adapter.Adapter
import com.example.cardview.model.Cards

class MainActivity : AppCompatActivity() {

    lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler = findViewById(R.id.recycler)

        //Cria a lista de posts
        val posts = Cards()
        val listaDePostscards = posts.getPosts()

        //Configura o adapter
        val adapter: Adapter = Adapter(listaDePostscards)

        //Define alyout
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(applicationContext)
        recycler.layoutManager = layoutManager
        recycler.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))
        recycler.setHasFixedSize(true)
        recycler.adapter = (adapter)
    }
}