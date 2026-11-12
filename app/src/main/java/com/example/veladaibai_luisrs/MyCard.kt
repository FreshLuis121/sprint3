package com.example.veladaibai_luisrs

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.veladaibai_luisrs.databinding.LayoutMyCardBinding

class MyCard @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val binding: LayoutMyCardBinding =
        LayoutMyCardBinding.inflate(LayoutInflater.from(context), this, true)

    fun setTitulo(titulo: String) {
        binding.tvCardTitle.text = titulo
    }

    fun setSubtitulo(subtitulo: String) {
        binding.tvCardSubtitle.text = subtitulo
    }

    fun setDescripcion(descripcion: String) {
        binding.tvCardDescription.text = descripcion
    }

    fun setImagen(resourceId: Int) {
        binding.ivCardImage.setImageResource(resourceId)
    }
}