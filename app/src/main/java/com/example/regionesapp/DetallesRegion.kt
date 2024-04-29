package com.example.regionesapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.regionesapp.databinding.ActivityDetallesRegionBinding
import com.example.regionesapp.databinding.ActivityRegionesBinding

class DetallesRegion : AppCompatActivity() {
    private lateinit var binding: ActivityDetallesRegionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDetallesRegionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Obtener el id de la región y mostrar sus detalles
        val idRegion = intent.getIntExtra("idRegion", 0)
        val region = Global.regiones[idRegion]

        // Mostrar los detalles de la región en la interfaz de usuario
        binding.txtTituloRegion.text = region.region
        binding.txtDescripcion.text = region.descripcion
        binding.txtDep.setText(Integer.toString(region.dp));
        // Aquí puedes mostrar otros detalles de la región si los tienes, como la descripción


    }
}