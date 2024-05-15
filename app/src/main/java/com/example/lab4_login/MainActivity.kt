package com.example.lab4_login

import android.os.Bundle
import coil.compose.rememberImagePainter
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4_login.ui.theme.Lab4_LoginTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Login()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab4_LoginTheme {
//        Login()
//        ListUser()
//        SimpleListView()
    }
}
@Composable
fun Login() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(
                color = Color.White
            )
            .verticalScroll(rememberScrollState())
    ){
        Box{
            Image(
                painter = rememberImagePainter("https://raw.githubusercontent.com/coredxor/images/main/bk_login.png"),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(20.dp),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(20.dp)
            ){
                renderLogo()
                Text("Login",
                    color = Color(0xFF181725),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text("Enter your emails and password",
                    color = Color(0xFF7C7C7C),
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(vertical = 20.dp,)
                )
                renderEmail()
                renderPassword()
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .weight(1f)
                    ){
                    }
                    TextButton(
                        onClick = {},
                    ){
                        Text("Forgot Password?",
                            color = Color(0xFF181725),
                            fontSize = 14.sp,
                        )
                    }
                }
                renderButtonLogin()
                renderCanSignup()
            }
        }
    }
}
@Composable
fun renderLogo() {
    Image(
        painter = painterResource(id = R.mipmap.logo),
        contentDescription = "Flower",
        modifier = Modifier
            .size(200.dp)
            .fillMaxWidth()
    )
}
@Composable
fun renderEmail() {
    Column(
        modifier = Modifier
            .padding(vertical = 16.dp,)
            .fillMaxWidth()
    ){
        Text("Email",
            color = Color(0xFF7C7C7C),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 8.dp,)
        )
        BasicTextField(
            value = "hadao1204@gmail.com",
            onValueChange = { },
            textStyle = TextStyle(
                color = Color(0xFF181725),
                fontSize = 18.sp,
            ),
            modifier = Modifier
                .padding(vertical = 12.dp,)
                .height(22.dp)
                .fillMaxWidth()
                .background(
                    color = Color(0xFFFFFFFF),
                )
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .height(1.dp)
                .fillMaxWidth()
                .background(
                    color = Color(0xFFE2E2E2),
                )
        ){
        }
    }
}
@Composable
fun renderPassword() {
    Column(
        modifier = Modifier
            .padding(vertical = 16.dp,)
            .fillMaxWidth()
    ){
        Text("Password",
            color = Color(0xFF7C7C7C),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 8.dp,)
        )
        BasicTextField(
            value = "*************",
            onValueChange = { },
            textStyle = TextStyle(
                color = Color(0xFF181725),
                fontSize = 18.sp,
            ),
            modifier = Modifier
                .padding(top = 12.dp, bottom = 8.dp,)
                .height(22.dp)
                .fillMaxWidth()
                .background(
                    color = Color(0xFFFFFFFF),
                )
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .height(1.dp)
                .fillMaxWidth()
                .background(
                    color = Color(0xFFE2E2E2),
                )
        ){
        }
    }
}
@Composable
fun renderButtonLogin() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(vertical = 20.dp,)
            .height(65.dp)
            .fillMaxWidth()
            .background(
                color = Color(0xFF53B175),
                shape = RoundedCornerShape(20.dp)
            )
    ){
        Text("LOG IN",
            color = Color(0xFFFFF9FF),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}
@Composable
fun renderCanSignup() {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
    ){
        Text("Don’t have an account?",
            color = Color(0xFF181725),
            fontSize = 14.sp,
        )
        TextButton(
            onClick = {},
        ){
            Text(" Signup",
                color = Color(0xFF53B175),
                fontSize = 14.sp,
            )
        }
    }
}