package tecsup.edu.mamusic.model

data class Repository(val musics:MutableList<Music> = ArrayList()) {

    init {
        getDataMusics()
    }

    fun getDataMusics(): List<Music> {
        musics.add(Music(1, "Somos de calle", "Daddy Yankee", "ic_artist_1", "regueton"))
        musics.add(Music(2, "Llamada de emergencia", "Daddy Yankee", "ic_artist_1", "regueton"))
        musics.add(Music(3, "Enemy", "Imagine Dragon", "ic_artist_2", "alternativo"))
        musics.add(Music(4, "Bad Liar", "Imagine Dragon", "ic_artist_2", "alternativo"))
        musics.add(Music(5, "Wathever It Takes", "Imagine Dragon", "ic_artist_2", "alternativo"))
        musics.add(Music(6, "We Will Rock You", "Queen", "ic_artist_3", "rock"))
        musics.add(Music(7, "Bohemian Rhapsody", "Queen", "ic_artist_3", "rock"))
        musics.add(Music(8, "La Gozadera", "Gente de Zona", "ic_artist_4", "salsa"))
        return musics
    }
}

