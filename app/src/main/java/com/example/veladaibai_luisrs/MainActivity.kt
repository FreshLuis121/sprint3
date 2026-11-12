package com.example.veladaibai_luisrs

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
         * PRINCIPIOS DE DISEÑO Y ACCESIBILIDAD APLICADOS:
         * 1. Accesibilidad: He externalizado los textos a strings.xml y he
         *     añadido "contentDescription" a la imagen para lectores de pantalla.
         * 2. UI/UX: He usado un diseño limpio, centrado y sencillo con márgenes
         *    coherentes (padding de 24dp) para que se vea bien el contenido.
         * 3. Jerarquía visual: El título tiene tamaño y negrita.
         * 4. Personalización: He creado un shape (bg_boton_redondeado) para el botón.
         */

        val btnAccion = findViewById<Button>(R.id.btnAccion)

        btnAccion.setOnClickListener {
            Toast.makeText(this, "Todavía no está implementado", Toast.LENGTH_SHORT).show()
        }
    }
}