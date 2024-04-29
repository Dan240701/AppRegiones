package com.example.regionesapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.regionesapp.databinding.ActivityDetallesDepartamentoBinding
import com.example.regionesapp.databinding.ActivityRegionesBinding

class DetallesDepartamento : AppCompatActivity() {
    private lateinit var binding: ActivityDetallesDepartamentoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDetallesDepartamentoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Obtener el id de la región y mostrar sus detalles
        val idDepartamento = intent.getIntExtra("idDepartamento", 0)
        val departamento = Global.departamentos[idDepartamento]

        // Mostrar los detalles de la región en la interfaz de usuario
        binding.txtnombre.text = departamento.nombre
        binding.txtIso.text = departamento.iso
        binding.txtCabecera.text =  departamento.cabecera
        binding.txtPoblacion.text =  departamento.poblacion.toString()
        binding.txtArea.text = departamento.area.toString()
        binding.txtDensidad.text = departamento.densidad.toString()
        binding.txtRegion.text = departamento.Region




        // Aquí puedes mostrar otros detalles de la región si los tienes, como la descripción


    }
}