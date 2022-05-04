package tecsup.edu.mamusic.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import tecsup.edu.mamusic.R
import tecsup.edu.mamusic.adapter.AdapterMusic
import tecsup.edu.mamusic.databinding.ActivityMainBinding
import tecsup.edu.mamusic.model.Repository

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var contactListRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setRecyclerView()
    }

    private fun setRecyclerView() {
        contactListRecyclerView = binding.musicsList
        contactListRecyclerView.layoutManager = LinearLayoutManager(this)
        val musics = Repository()
        val adapter = AdapterMusic(musics.musics)
        contactListRecyclerView.adapter = adapter
    }
}