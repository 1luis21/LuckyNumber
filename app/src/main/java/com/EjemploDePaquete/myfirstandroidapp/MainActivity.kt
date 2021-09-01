package com.EjemploDePaquete.myfirstandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNext = findViewById<Button>(R.id.btnNext)

        val txtName = findViewById<EditText>(R.id.txtName)
        val txtAge = findViewById<EditText>(R.id.txtAge)

        btnNext.setOnClickListener {

            val usrName:String = txtName.text.toString()
            val usrAge:String = txtAge.text.toString()

            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("txtName", usrName)
                putExtra("txtAge", usrAge)
            }
            startActivity(intent)

        }
    }
}