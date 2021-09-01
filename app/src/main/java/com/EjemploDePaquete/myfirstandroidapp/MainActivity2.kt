package com.EjemploDePaquete.myfirstandroidapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnBack = findViewById<Button>(R.id.btnBack)

        btnBack.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

        val txtName2 = findViewById<TextView>(R.id.txtName2)
        val usrName2 = intent.getStringExtra("txtName")

        txtName2.text = usrName2

        val txtLuckyNumber2 = findViewById<TextView>(R.id.txtLuckyNumber2)
        val usrLuckyNumber = intent.getStringExtra("txtAge") //numero en string

        var luckyNum = usrLuckyNumber?.toInt()
        var aux:String
        var aux2:String
        var newNum:Int
        var total = 0

        //proceso para obtener el numero en int y separarlos
        if (luckyNum != null) {
            //para un digito
            if (luckyNum <= 9) {

                newNum = luckyNum * 7

                if (newNum == 7) {

                    aux = newNum.toString()
                    txtLuckyNumber2.text = aux
                }

                else {
                    do {
                        for (number in newNum.toString().toCharArray()) {
                            val numberLucky = number.toString().toInt()
                            total += numberLucky
                        }
                        newNum = total
                        total = 0

                    }while (newNum > 9)

                    aux2 = newNum.toString()
                    txtLuckyNumber2.text = aux2
                }

            } else{

                do {
                    for (number in luckyNum.toString().toCharArray()) {
                        val numberLucky = number.toString().toInt()
                        total += numberLucky
                    }
                    luckyNum = total
                    total = 0

                }while (luckyNum!! > 9)

                aux2 = luckyNum.toString()
                txtLuckyNumber2.text = aux2
            }

        }


    }
}