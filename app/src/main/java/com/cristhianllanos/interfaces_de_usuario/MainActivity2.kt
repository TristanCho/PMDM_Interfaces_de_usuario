package com.cristhianllanos.interfaces_de_usuario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnVolver.setOnClickListener{
            onClick(it)
        }
    }
    fun onClick(view:android.view.View){
        val intent = Intent()
        val datos ="Estos son datos generados en ${MainActivity2::class.simpleName}"
        intent.putExtra("datos",datos)
        setResult(RESULT_OK, intent)
        finish()
    }
}