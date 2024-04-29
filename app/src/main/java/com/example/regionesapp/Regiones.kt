package com.example.regionesapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.regionesapp.databinding.ActivityRegionesBinding

class Regiones : AppCompatActivity() {
    private lateinit var binding: ActivityRegionesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityRegionesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.DetalleRegionView) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.listViewDpto.adapter = AdapterRegion(this,Global.regiones)

        binding.listViewDpto.setOnItemClickListener { parent, view, position, id ->
            // Obtener la región seleccionada
            val regionSeleccionada = Global.regiones[position]

            // Crear un Intent para iniciar la actividad de DetalleRegion
            val intent = Intent(this, DetallesRegion::class.java)

            // Pasar el ID de la región seleccionada a la actividad de DetalleRegion
            intent.putExtra("idRegion", regionSeleccionada.id)

            // Iniciar la actividad de DetalleRegion
            startActivity(intent)
        }



    }
}
