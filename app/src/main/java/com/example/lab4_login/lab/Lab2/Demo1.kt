package com.example.demo1.Lab2

fun main(){
    //Giai phuong trinh bac hai
    var a : Double ? = null
    var b : Double ? = null
    var c : Double ? = null
    while (a == null){
        print("Nhap so a: ")
        a = readLine()?.toDoubleOrNull()
        if (a == null){
            println("Nhap lai so a")
        }
    }
    while (b == null){
        print("Nhap so b: ")
        b = readLine()?.toDoubleOrNull()
        if (b == null){
            println("Nhap lai so b")
        }
    }
    while (c == null){
        print("Nhap so c: ")
        c = readLine()?.toDoubleOrNull()
        if (c == null){
            println("Nhap lai so c")
        }
    }

    if (a == 0.0){
        if (b == 0.0){
            if (c == 0.0){
                println("Phuong trinh co vo so nghiem")
            } else {
                println("Phuong trinh vo nghiem")
            }
        } else {
            println("Phuong trinh co nghiem duy nhat: x = %2f".format(-c/b))
        }
    } else {
        var del = b*b - 4*a*c
        if(del < 0.0){
            println("Phuong trinh vo nghiem")
        } else if (del == 0.0) {
            println("Phuong trinh co nghiem kep: x1 = x2 = %2f".format(-b/(2*a)))
        } else {
            var x1 = (-b + Math.sqrt(del))/(2*a)
            var x2 = (-b - Math.sqrt(del))/(2*a)
            println("Phuong trinh co 2 nghiem phan biet: x1 = %.2f \n x2 = %.2f".format(x1, x2))
        }
    }
}