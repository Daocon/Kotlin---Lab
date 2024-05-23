package com.example.lab4_login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

@Composable
fun ImageURL() {
    Card(
        modifier = Modifier.size(300.dp),
        shape = RectangleShape,
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Image(
            painter = rememberAsyncImagePainter(model = "https://cellphones.com.vn/sforum/wp-content/uploads/2023/08/hinh-nen-meo-9.jpg"),
            contentDescription = "meo",
            contentScale = ContentScale.Crop)
    }
}