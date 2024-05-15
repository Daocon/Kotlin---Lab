package com.example.lab4_login.lab

fun main() {

    var a : Double? = null
    var b : Double? = null

    while (a == null){
        println("Nhập số a: ")
        a = readLine()?.toDoubleOrNull()
    }
    while (b == null){
        println("Nhập số b: ")
        b = readLine()?.toDoubleOrNull()
    }
    if (a == 0.0){
        if(b == 0.0){
            println("Phuong trinh vo so nghiem")
        } else {
            println("Phuong trinh vo nghiem")
        }
    } else {
        println("Phuong tinh co nghiem duy nhat: x = %2f ".format(-b/a) )
    }
}