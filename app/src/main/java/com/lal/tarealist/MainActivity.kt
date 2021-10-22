package com.lal.tarealist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lal.tarealist.adapter.MusicAdapter
import com.lal.tarealist.data.Datasource
import com.lal.tarealist.databinding.ActivityMainBinding
import com.lal.tarealist.model.Music

private lateinit var binding : ActivityMainBinding
private lateinit var adapter : MusicAdapter
private lateinit var linearLayout: RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = MusicAdapter(this, Datasource().cargarMusica()){
            onClick(it)
        }
        linearLayout = LinearLayoutManager(this)

        binding.recycleView.setHasFixedSize(true)
        binding.recycleView.adapter = adapter
        binding.recycleView.layoutManager = linearLayout
    }

    private fun onClick(it: Music) {
        Toast.makeText(this, "${it.Artista}", Toast.LENGTH_LONG).show()
    }


}