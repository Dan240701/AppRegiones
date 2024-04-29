package com.example.regionesapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.regionesapp.databinding.ActivityDepartamentosBinding

class Departamentos : AppCompatActivity() {
    private lateinit var binding : ActivityDepartamentosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDepartamentosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.listView.adapter = AdapterDepartamento(this,Global.departamentos)

        binding.listView.setOnItemClickListener { parent, view, position, objects ->
            /*
             Toast.makeText(this, "Se selecciono el elemento en la posicion:  $position que es : ${Global.contactos[position]}", Toast.LENGTH_SHORT).show()
             */
            //obtener el id del contacto seleccionado, lo pasaos al siguiente activity
            val idDepartamento = Global.departamentos[position].id
            var i = Intent(this, DetallesDepartamento::class.java)
            i.putExtra("idDepartamento", idDepartamento)
            startActivity(i)


        }

    }
}