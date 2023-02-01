package com.example.meuprimeiroprojeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
import androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val edtPeso: EditText = findViewById(R.id.edttext_peso)
        val edtAltura: EditText = findViewById(R.id.edttext_altura)

        btnCalcular.setOnClickListener {

            val alturaStr = edtAltura.text.toString()
            val pesoStr = edtPeso.text.toString()

            if(alturaStr.isNotEmpty() && pesoStr.isNotEmpty()){

            val altura : Float = alturaStr.toFloat()
            val peso : Float = pesoStr.toFloat()
            val alturaFINAL : Float = altura * altura
            val result : Float = (peso / alturaFINAL)

            val intent = Intent(this, ResultActivity::class.java)
                .apply {
                    putExtra("EXTRA_RESULT", result)
                }

            startActivity(intent)

            }else{
                Toast.makeText(this,"Preencher Todos os Campos", Toast.LENGTH_LONG).show()
            }

                }

            }


        }