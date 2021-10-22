package com.lal.tarealist.data

import com.lal.tarealist.model.Music

class Datasource {

    fun cargarMusica() : List<Music> {
        return listOf<Music>(
            Music("STAY","The Kid LAROI","Pop","https://f4.bcbits.com/img/a0725618779_10.jpg"),
            Music("INDUSTRY BABY","Lil Nas X","Pop","https://i.redd.it/pwq4ed7xslc71.jpg"),
            Music("Bad Habits","Ed Sheeran","Pop","https://img.discogs.com/NJLnnC5vROxT3tK4bAF1pI73t14=/fit-in/600x599/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-19261759-1625603751-5827.jpeg.jpg"),
            Music("good 4 u","Olivia Rodrigo","Pop","https://upload.wikimedia.org/wikipedia/en/3/3e/Olivia_Rodrigo_-_Good_4_U.png"),
            Music("MONTERO","Lil Nas X","HipHop","https://static.onecms.io/wp-content/uploads/sites/20/2021/09/02/lil-nas-x-3.jpg"),
            Music("Yonaguni","Bad Bunny","Reguetón","https://www.lahiguera.net/musicalia/artistas/varios/disco/0/tema/25243/yonaguni-portada.jpg"),
            Music("Blinding Lights","The Weeknd","R&B/Soul","https://upload.wikimedia.org/wikipedia/en/e/e6/The_Weeknd_-_Blinding_Lights.png"),
            Music("Peaches","Justin Bieber","Pop","https://cdns-images.dzcdn.net/images/cover/87468622c8e7ac9dce7b541be136aa4c/500x500.jpg"),
            Music("Take My Breath","The Weeknd","R&B/Soul","https://1.bp.blogspot.com/-in3g0UH9i5Q/YQy1OUsdh-I/AAAAAAAAp1Q/apYKcC_AHrEsHQdtAjF4DZzOx3l8vNlXgCLcBGAsYHQ/s600/1.jpg"),
            Music("Save Your Tears","The Weeknd","R&B/Soul","https://1.bp.blogspot.com/-A7-CV3O14lE/YIBz-b12eMI/AAAAAAAApYU/7U1pgcN4_DQRbfURz6T7yLfn0AX59AsTwCLcBGAsYHQ/s600/1.jpg")
        )
    }
}