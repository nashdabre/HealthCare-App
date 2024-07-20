package com.example.healthcare.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.healthcare.R
import com.example.healthcare.navigation.Routes

@Composable
fun StartPage(navController: NavController){
    Image(painter = painterResource(id = R.drawable.loadingpage), contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize())

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {

        Text(
            text = "We Care For You",
            style = TextStyle(
                fontWeight = FontWeight.ExtraBold,
                fontSize = 45.sp,

                ),
            color = Color.White,
            textAlign = TextAlign.Center
            // modifier = Modifier.height( 10.dp)
        )
        Box(modifier = Modifier.height(30.dp))
        Text(
            text = "Health Care is a Right, not a Privilege",
            style = TextStyle(

                fontSize = 26.sp,

                ),
            color = Color.Gray,
            textAlign = TextAlign.Center
            // modifier = Modifier.height( 10.dp)

        )

        Box(modifier = Modifier.height(30.dp))

        Button(onClick = {
            navController.navigate(Routes.Languages.routes) {
                popUpTo(navController.graph.startDestinationId)
                launchSingleTop = true
            }


        }, modifier = Modifier.fillMaxWidth(),
            colors =  ButtonDefaults.outlinedButtonColors(
                backgroundColor = Color(android.graphics.Color.parseColor("#6C9E81")))//
            , shape = RoundedCornerShape(20.dp),


        )

         {
            Text(
                text = "Get Started", style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,

                    ), modifier = Modifier.padding(vertical = 6.dp),color = Color.White
            )

        }

    }

}