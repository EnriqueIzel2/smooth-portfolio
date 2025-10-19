package com.izel.smoothportfolio

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.izel.smoothportfolio.databinding.ActivityProjetoBinding

class ProjetoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProjetoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjetoBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        val toolbarProjetos = binding.toolbarProjeto
        toolbarProjetos.setOnClickListener {
            finish()
        }
    }
}