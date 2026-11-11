package com.example.proyectofinal

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar los datos enviados desde LoginActivity
        val usuario = intent.getStringExtra("USUARIO")
        val password = intent.getStringExtra("PASSWORD")

        // Mostrar el usuario en pantalla
        val tvBienvenida = findViewById<TextView>(R.id.tvBienvenida)

        tvBienvenida.text = "Bienvenido, $usuario"
    }
}
