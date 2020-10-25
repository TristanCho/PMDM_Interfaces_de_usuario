package com.cristhianllanos.interfaces_de_usuario

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCambiarSaludo.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        if(contexto == null)
            contexto = this
    }
    override fun onResume() {
        super.onResume()
        tvSaludo.text= "Son iguales los contextos: ${this ==contexto}"
    }
    companion object {
        private var contexto: Context? = null
    }
}