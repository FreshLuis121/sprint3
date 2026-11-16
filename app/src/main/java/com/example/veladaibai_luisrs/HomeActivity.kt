package com.example.veladaibai_luisrs

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.veladaibai_luisrs.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*
         * PRINCIPIOS DE DISEÑO Y ACCESIBILIDAD APLICADOS:
         * 1. Accesibilidad: Textos externalizados en strings.xml, zonas táctiles mínimas de 48dp
         *    y uso de contentDescription en imágenes.
         * 2. UI/UX: Jerarquía visual clara (título en negrita y mayor tamaño que el subtítulo),
         *    márgenes coherentes (24dp) y contraste alto entre texto y fondo.
         * 3. Personalización: Uso de shapes personalizados (bg_boton_redondeado), CardView con
         *    esquinas redondeadas para la imagen y paleta temática acorde al evento.
         * 4. Buenas prácticas: Uso de ViewBinding en lugar de findViewById.
         */

        binding.btnAccion.setOnClickListener {
            Toast.makeText(
                this,
                getString(R.string.toast_no_implementado),
                Toast.LENGTH_SHORT
            ).show()
        }

        binding.btnIrCard.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
    }
}