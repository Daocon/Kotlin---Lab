package com.example.demo1.Lab2

import java.util.Locale

fun main(){
    println("Chương trình kiểm tra năm nhuận:")
    while (true) {
        var year: Int ? = null
        while (year == null || year < 0) {
            print("Nhập năm (>=0): ")
            year = readLine()?.toIntOrNull()
        }
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("$year là năm nhuận")
        } else {
            println("$year không phải là năm nhuận")
        }
        print("Tiếp tục kiểm tra năm nhuận? (Y/N): ")
        val choice = readLine()
        if (choice != null) {
            if (choice.uppercase(Locale.ROOT) != "Y") {
                break
            }
        }
    }
    println("Kết thúc chương trình")
}