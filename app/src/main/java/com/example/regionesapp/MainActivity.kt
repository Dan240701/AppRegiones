package com.example.regionesapp

// Asegúrate de que este import sea el correcto
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.regionesapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null // Variable para el ViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.getRoot())

        // Configurar el listener de clic para el botón "Region"
        binding!!.btnRegion.setOnClickListener { view ->
            // Iniciar la actividad "Regiones"
            val intent = Intent(
                this@MainActivity,
                Regiones::class.java
            )
            startActivity(intent)
        }

        // Configurar el listener de clic para el botón "Region"
        binding!!.btnDepartamento.setOnClickListener { view ->
            // Iniciar la actividad "Regiones"
            val intent = Intent(
                this@MainActivity,
                Departamentos::class.java
            )
            startActivity(intent)
        }





        // Otros códigos de inicialización, si los hay
    }
}

