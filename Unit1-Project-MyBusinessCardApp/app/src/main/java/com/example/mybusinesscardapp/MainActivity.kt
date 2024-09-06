package com.example.mybusinesscardapp

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mybusinesscardapp.ui.theme.MyBusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyBusinessCardAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    BusinessCard()
                }
            }
        }
    }
}


@Composable
fun BusinessCard(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ){
        Row {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 50.dp)
            ) {
                Row(modifier = Modifier.padding(top = 130.dp, bottom = 20.dp)) {
                    val image = painterResource(R.drawable.profile)
                    Image(
                        painter = image,
                        contentDescription = null
                    )
                }
                Row {
                    Text(
                        text = "G Santosh Kumar",
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive
                    )
                }
                Row {
                    Text(
                        text = "Android Developer",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Cursive
                    )
                }
            }
        }


        Row {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ){
                val MyAppIcons = Icons.Rounded
                Row {
                    Column {
                        Icon(
                            imageVector = MyAppIcons.Phone,
                            contentDescription = "Phone Icon",
                            modifier = Modifier
                                .padding(start = 70.dp)
                                .size(20.dp)
                        )
                    }
                    Column {
                        Text(
                            text = "+91 9738037623",
                            fontSize = 13.sp,
                            modifier = Modifier.padding(start = 50.dp))
                    }
                }
                Row {
                    Column {
                        Icon(
                            imageVector = MyAppIcons.Star,
                            contentDescription = "Star Icon",
                            modifier = Modifier
                                .padding(start = 70.dp)
                                .size(20.dp)
                        )
                    }
                    Column {
                        Text(
                            text = "@g-santosh-kumar",
                            fontSize = 13.sp,
                            modifier = Modifier.padding(start = 46.dp))
                    }
                }
                Row {
                    Column {
                        Icon(
                            imageVector = MyAppIcons.Email,
                            contentDescription = "Email Icon",
                            modifier = Modifier
                                .padding(start = 70.dp)
                                .size(20.dp)
                        )
                    }
                    Column {
                        Text(
                            text = "girisantoshkumar1999@gmail.com",
                            fontSize = 13.sp,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyBusinessCardAppTheme {
        BusinessCard()
    }
}