package com.lal.tarealist.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.lal.tarealist.R
import com.lal.tarealist.databinding.ItemMusicBinding
import com.lal.tarealist.model.Music

class MusicAdapter(private val context: Context, private val musicList: List<Music>,
private val listener: (Music) -> Unit
) : RecyclerView.Adapter<MusicAdapter.ViewHolder>() {

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val binding = ItemMusicBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_music, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val musica = musicList[position]

        with(holder) {
            binding.root.setOnClickListener {
                listener(musica)
            }
            binding.txtTitulo.text = musica.titulo

            Glide.with(context)
                .load(musica.imagen)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .circleCrop()
                .into(binding.imgFoto)
        }
    }

    override fun getItemCount(): Int {
        return musicList.size
    }

}