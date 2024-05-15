package com.example.lab4_login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val countryList =
    mutableListOf("India", "Pakistan", "China", "United States")
private val listModifier = Modifier
    .fillMaxSize()
    .background(Color.Gray)
    .padding(10.dp)
private val textStyle = TextStyle(fontSize = 20.sp, color = Color.White)
@Composable
fun SimpleListView() {
    LazyColumn(modifier = listModifier) {
        items(countryList) { country ->
            Text(text = country, style = textStyle)
        }
    }
}