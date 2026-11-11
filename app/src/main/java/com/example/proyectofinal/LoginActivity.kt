package com.example.proyectofinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class LoginActivity : AppCompatActivity() {

    // Constantes de usuario y contraseña
    private val MYUSER = "admin"
    private val MYPASS = "1234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Referencias a los elementos del XML
        val etUsuario = findViewById<EditText>(R.id.etUsuario)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnValidar = findViewById<Button>(R.id.btnValidar)

        // Evento del botón Validar
        btnValidar.setOnClickListener {

            val usuario = etUsuario.text.toString()
            val password = etPassword.text.toString()

            if (usuario == MYUSER && password == MYPASS) {

                // Crear Intent explícito
                val intent = Intent(this, MainActivity::class.java)

                // Pasar datos al Activity principal
                intent.putExtra("USUARIO", usuario)
                intent.putExtra("PASSWORD", password)

                startActivity(intent)

            } else {

                Toast.makeText(
                    this,
                    "Usuario o contraseña incorrectos",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}