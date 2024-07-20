package com.fatihden.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.fatihden.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityMainBinding
    private lateinit var superKahramanListe: ArrayList<SuperKahraman>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        val view = _binding.root
        setContentView(view)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val superman = SuperKahraman("Ironman", "Teknoloji", R.drawable.iron)
        val hulk = SuperKahraman("Hulk", "Doktor", R.drawable.hulk_)
        val docterStrage = SuperKahraman("Doktor Strage", "Doktor", R.drawable.docter)
        val amerika = SuperKahraman("Amerika ", "Asker", R.drawable.amerika)


        superKahramanListe = arrayListOf(superman, hulk, docterStrage, amerika)

        val adapter = Adapter(superKahramanListe)
        _binding.mainRcyclerView.layoutManager = LinearLayoutManager(this)
        _binding.mainRcyclerView.adapter = adapter

    }


}