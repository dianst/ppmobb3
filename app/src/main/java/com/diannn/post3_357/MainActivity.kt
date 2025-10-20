package com.diannn.post3_357

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import com.diannn.post3_357.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object{
        const val DATA_NAMA = "data_nama"
        const val DATA_USERNAME = "data_username"
        const val DATA_UMUR = "data_umur"
        const val DATA_JK = "data_jk"
    }
    private lateinit var binding: ActivityMainBinding
    private var jk = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            tombolsubmit.setOnClickListener {
                val nama = isinama.text.toString()
                val username = isiusername.text.toString()
                val umur = isiumur.text.toString()
                if (rdb1.isChecked){
                    jk = "Laki-laki"
                }else if(rdb2.isChecked){
                    jk = "Perempuan"
                }
                if(isipassword.text.toString() != isiconfirm.text.toString()){
                    Toast.makeText(this@MainActivity,"Password Does Not Match!!!", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                val intent = Intent(this@MainActivity, HasilActivity::class.java)
                intent.putExtra(DATA_NAMA,nama)
                intent.putExtra(DATA_USERNAME,username)
                intent.putExtra(DATA_UMUR,umur)
                intent.putExtra(DATA_JK, jk)
                startActivity(intent)
            }
        }


    }
}