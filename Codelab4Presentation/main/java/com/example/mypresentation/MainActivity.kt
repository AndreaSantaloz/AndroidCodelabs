package com.example.mypresentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mypresentation.ui.theme.MypresentationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MypresentationTheme {

                    Presentation(
                        name= "Andrea Santana López",
                        description = "Android Developer Extraordinaire",
                        phoneNumber = "+608 (608) 29 25 37",
                        email = "andreasantaloz@gmail.com",
                        share="@AndreaSantaloz",
                        modifier = Modifier.background(color = Color(0xFFB2FBA5))

                    )
                }
            }
        }
    }


@Composable
fun Presentation(name: String,description: String,phoneNumber: String,
                 email:String,share:String,
                 modifier: Modifier = Modifier) {



    Column(
        modifier = modifier.fillMaxSize()
                            .background(color = Color(0xFFB2FBA5)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Image(
            painter= painterResource(id=R.drawable.android_logo),
            contentDescription = "",
            modifier =Modifier
                    .size(100.dp)
                    .border(BorderStroke(1.dp, Color.Black))
                    .background(Color.Black)




        )
        Text(
            text = " $name",
            modifier = modifier.padding(
                top=16.dp,
            )
        )
        Text(
            text = " $description",
            fontSize = 16.sp,
            modifier = modifier.padding(bottom = 16.dp)
                                .align(Alignment.CenterHorizontally)
        )

        Text(
            text = " $phoneNumber ",
            fontSize = 16.sp,
            modifier = modifier.align(Alignment.CenterHorizontally)

        )
        Text(
            text = " $share ",
            fontSize = 16.sp,
            modifier = modifier.align(Alignment.CenterHorizontally)

        )
        Text(
            text = " $email ",
            fontSize = 16.sp,
            modifier = modifier.align(Alignment.CenterHorizontally)

        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MypresentationTheme {
        Presentation("Andrea Santana López","Android Developer Extraordinaire","+608 (608) 29 25 37",
            "andreasantaloz@gmail.com","@AndreaSantaloz")
    }
}

