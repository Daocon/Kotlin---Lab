package com.example.lab4_login

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                Icon(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "Logo")
                HoriImgList(imgListData)
                VerImgList(imgListData)
            }
        }
    }
}
val imgListData = listOf(R.drawable.anh1, R.drawable.anh2, R.drawable.anh3)

@Composable
fun HoriImgList(imageList: List<Int>){
    val scrollState = rememberScrollState()
    Row(
        modifier = Modifier
            .horizontalScroll(scrollState)
            .padding(16.dp)
    ) {
        imageList.forEachIndexed { index, img ->
            Image(painter = painterResource(id = img), contentDescription = "Image Description",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .size(200.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .padding(
                        start = if (index == 0) 0.dp else 8.dp,
                        end = 8.dp
                    )
            )
        }
    }
}

@Composable
fun VerImgList(imageList: List<Int>){
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .verticalScroll(scrollState)
            .padding(16.dp)
    ) {
        imageList.forEachIndexed { index, img ->
            Image(painter = painterResource(id = img), contentDescription = "Image Description",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .padding(
                        top = if (index == 0) 0.dp else 8.dp,
                        bottom = 8.dp
                    )

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHorizontalImageList() {
    HoriImgList(listOf(R.drawable.anh1, R.drawable.anh2,
        R.drawable.anh3))
}
@Preview(showBackground = true)
@Composable
fun PreviewVerticalImageList() {
    VerImgList(listOf(R.drawable.anh1, R.drawable.anh2,
        R.drawable.anh3))
}