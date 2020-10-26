package com.cristhianllanos.interfaces_de_usuario

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCambiarSaludo.setOnClickListener{
            tvSaludo.text ="Bienvenidos a Android, Programadores!!"
            val  intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        if (contexto == null)
            contexto = this
    }

    override fun onResume() {
        super.onResume()

        tvSaludo.text = "Ahora el contexto es este !! Son iguales los contextos: ${this == contexto}"
        Log.e("MainActivity", "Son iguales los contextos: ${this == contexto}")
    }

    companion object {
        private var contexto: Context? = null
    }
}

