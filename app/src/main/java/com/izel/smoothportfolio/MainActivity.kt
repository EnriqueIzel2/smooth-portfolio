package com.izel.smoothportfolio

import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import com.izel.smoothportfolio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fotoPerfil = BitmapFactory.decodeResource(resources, R.drawable.foto_perfil)
        val circulo = RoundedBitmapDrawableFactory.create(resources, fotoPerfil)
        circulo.isCircular = true
        binding.imgFotoPerfil.setImageDrawable(circulo)

        binding.btnProjetos.setOnClickListener {
            val intent = Intent(this, ProjetoActivity::class.java)
            startActivity(intent)
        }

        binding.btnContato.setOnClickListener {
            val intent = Intent(this, ContatoActivity::class.java)
            startActivity(intent)
        }
    }
}