package com.izel.smoothportfolio

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.izel.smoothportfolio.databinding.ActivityContatoBinding

class ContatoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContatoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityContatoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbarContato = binding.toolbarContato

        toolbarContato.setNavigationOnClickListener {
            finish()
        }
    }
}