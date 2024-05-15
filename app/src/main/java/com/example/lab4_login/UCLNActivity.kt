package com.example.lab4_login

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UCLNActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_uclnactivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        var a = findViewById<EditText>(R.id.editTextNumber1)
        var b = findViewById<EditText>(R.id.editTextNumber2)

        var buttonTotal = findViewById<Button>(R.id.buttonAdd)
        var textResult = findViewById<TextView>(R.id.textViewResult)

        buttonTotal.setOnClickListener {
            var a1 = a.text.toString().toIntOrNull()
            var b1 = b.text.toString().toIntOrNull()
            var ucln = 1

            if (a1 == null) a.error = "Nhập số"
            if (b1 == null) b.error = "Nhập số"

            val min = if (a1!! > b1!!) b1 else a1

            for (i in min downTo 1){
                if (a1 % i == 0 && b1 % i == 0){
                    ucln = i
                    break
                }
            }
//            println("UCLN cua $a1 và $b1 là: $ucln")
            textResult.setText(ucln.toString())
        }
    }
}