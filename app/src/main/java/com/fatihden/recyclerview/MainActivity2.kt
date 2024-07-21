package com.fatihden.recyclerview

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.fatihden.recyclerview.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var _binding :ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = _binding.root
        setContentView(view)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val adapterdenGelenIntent = intent
        //api : 33
        //adapterdenGelenIntent.getSerializableExtra("tiklananRecyclerItem",SuperKahraman::class.java)
        // daha eski api için geçerli
        val secilenKahraman = adapterdenGelenIntent.getSerializableExtra("tiklananRecyclerItem") as SuperKahraman

        _binding.imageView.setImageResource(secilenKahraman.gorsel)
        _binding.textView.text = secilenKahraman.isim
        _binding.textView2.text = secilenKahraman.meslek




    }






}