package com.example.veladaibai_luisrs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.veladaibai_luisrs.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.miTarjetaCustom.setTitulo("Ibai Llanos")
        binding.miTarjetaCustom.setSubtitulo("Organizador Oficial")
        binding.miTarjetaCustom.setDescripcion("Descubre todos los detalles de los combates, artistas invitados y sorpresas de la Velada del Año 2027.")

        // Añadimos la imagen de la velada de manera programática
        binding.miTarjetaCustom.setImagen(R.drawable.img_velada)
    }
}