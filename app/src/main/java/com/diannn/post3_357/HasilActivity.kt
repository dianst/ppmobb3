package com.diannn.post3_357

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import com.diannn.post3_357.MainActivity.Companion.DATA_JK
import com.diannn.post3_357.MainActivity.Companion.DATA_NAMA
import com.diannn.post3_357.MainActivity.Companion.DATA_UMUR
import com.diannn.post3_357.MainActivity.Companion.DATA_USERNAME
import com.diannn.post3_357.databinding.ActivityHasilBinding
import com.diannn.post3_357.databinding.ActivityMainBinding

class HasilActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHasilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHasilBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        val nama = intent.getStringExtra(DATA_NAMA)
        val username = intent.getStringExtra(DATA_USERNAME)
        val umur = intent.getStringExtra(DATA_UMUR)
        val jk = intent.getStringExtra(DATA_JK)

        binding.apply {
            hasiloutput1.text = nama
            hasiloutput2.text = username
            hasiloutput3.text = umur
            hasiloutput4.text = jk


        }

    }
    companion object{}

}