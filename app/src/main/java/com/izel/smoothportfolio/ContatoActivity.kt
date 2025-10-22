package com.izel.smoothportfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
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

        binding.btnWhatsapp.setOnClickListener {
            abrirWhatsapp()
        }
    }

    private fun abrirWhatsapp() {
        val numeroTelefone = "5592981659117"
        val uri = Uri.parse("https://api.whatsapp.com/send?phone=$numeroTelefone")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)

        if (numeroTelefone.equals(numeroTelefone)) {
            startActivity(intent)
        } else {
            val playStoreIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp"))
            startActivity(playStoreIntent)
        }
    }
}