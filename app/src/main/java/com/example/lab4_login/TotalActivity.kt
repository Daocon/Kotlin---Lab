package com.example.lab4_login

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TotalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_total)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var a = findViewById<EditText>(R.id.editTextNumber1)
        var b = findViewById<EditText>(R.id.editTextNumber2)
        var c = findViewById<EditText>(R.id.editTextNumber3)

        var buttonTotal = findViewById<Button>(R.id.buttonAdd)
        var textResult = findViewById<TextView>(R.id.textViewResult)

        buttonTotal.setOnClickListener {
            var a1 = a.text.toString().toDoubleOrNull()
            var b1 = b.text.toString().toDoubleOrNull()
            var c1 = c.text.toString().toDoubleOrNull()

            if (a1 == null) a.error = "Nhập số"
            if (b1 == null) b.error = "Nhập số"
            if (c1 == null) c.error = "Nhập số"

            if (a1 != null && b1 != null && c1 != null) {
                var result = a1 + b1 + c1
                textResult.text = "Tổng của 3 số $a1, $b1, $c1 la: %.2f".format(result)
            }
        }
    }
}