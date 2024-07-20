package com.example.healthcare.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.healthcare.R
import com.example.healthcare.navigation.Routes


@Composable
fun TestLab(navController: NavHostController){

    Column(
        Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color(android.graphics.Color.parseColor("#eeeeee")))
            .padding(top = 32.dp, start = 16.dp, end = 16.dp),
        //  horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .height(45.dp)
                .width(60.dp)
                .background(
                    color = Color(android.graphics.Color.parseColor("#ffffff")),
                    shape = RoundedCornerShape(20.dp)
                )

        ) {
            Image(
                painter = painterResource(id = R.drawable.back),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable {
                        navController.navigate(Routes.BottomNav.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }

                    }
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        ) {

            MyApp()
        }
//-----------------------------------------------------------------------------
//
        LazyColumn(modifier = Modifier.padding(20.dp)) {
            
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 1.dp)
        ) {
            Column(
                Modifier
                    .weight(0.5f)
                    .height(100.dp)
                    .padding(end = 12.dp)
                    .background(
                        color = Color(android.graphics.Color.parseColor("#ffb74d")),
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.Start
            ) {


                    Text(
                        text = "Popular\nHealth Checks", style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,

                            ), modifier = Modifier.padding(start = 10.dp),color = Color.Black
                    )

                Row(){Icon(
                    modifier = Modifier
                        .padding(start = 6.dp,top = 18.dp)
                        .width(28.dp)
                        .height(28.dp)
                        .clip(shape = CircleShape)
                        .background(color = Color(android.graphics.Color.parseColor("#000000")))
                        .padding(2.dp),
                    tint = Color.White,
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "Home Icon"
                )
                    Image(
                        painter = painterResource(id = R.drawable.stethoscope),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 50.dp, bottom = 4.dp)
                            .clickable {


                            }
                    )

                }

                }



//---------------------------------------------------------------------------------------------------
            Column(
                Modifier
                    .weight(0.5f)
                    .height(100.dp)
                    .padding(end = 12.dp)
                    .background(
                        color = Color(android.graphics.Color.parseColor("#ff80ab")),
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.Start
            ) {


                Text(
                    text = "X-rays\nScans & MRI", style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,

                        ), modifier = Modifier.padding(start = 10.dp),color = Color.Black
                )

                Row(){Icon(
                    modifier = Modifier
                        .padding(start = 6.dp,top = 18.dp)
                        .width(28.dp)
                        .height(28.dp)
                        .clip(shape = CircleShape)
                        .background(color = Color(android.graphics.Color.parseColor("#000000")))
                        .padding(2.dp),
                    tint = Color.White,
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "Home Icon"
                )
                    Image(
                        painter = painterResource(id = R.drawable.x_ray),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 50.dp, bottom = 4.dp)
                            .clickable {


                            }
                    )

                }

            }
        }
   //-----------------------------------------------------------------
   //------------------------------------------------------------------------

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            Column(
                Modifier
                    .weight(0.5f)
                    .height(100.dp)
                    .padding(end = 12.dp)
                    .background(
                        color = Color(android.graphics.Color.parseColor("#dce775")),
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.Start
            ) {


                Text(
                    text = "Urine Test\n", style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,

                        ), modifier = Modifier.padding(start = 10.dp),color = Color.Black
                )

                Row(){Icon(
                    modifier = Modifier
                        .padding(start = 6.dp,top = 18.dp)
                        .width(28.dp)
                        .height(28.dp)
                        .clip(shape = CircleShape)
                        .background(color = Color(android.graphics.Color.parseColor("#000000")))
                        .padding(2.dp),
                    tint = Color.White,
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "Home Icon"
                )
                    Image(
                        painter = painterResource(id = R.drawable.urine_test),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 50.dp, bottom = 4.dp)
                            .clickable {


                            }
                    )

                }

            }
//---------------------------------------------------------------------------------------------------
            Column(
                Modifier
                    .weight(0.5f)
                    .height(100.dp)
                    .padding(end = 12.dp)
                    .background(
                        color = Color(android.graphics.Color.parseColor("#4fc3f7")),
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.Start
            ) {


                Text(
                    text = "Thyroid Tests\n", style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,

                        ), modifier = Modifier.padding(start = 10.dp),color = Color.Black
                )

                Row(){Icon(
                    modifier = Modifier
                        .padding(start = 6.dp,top = 18.dp)
                        .width(28.dp)
                        .height(28.dp)
                        .clip(shape = CircleShape)
                        .background(color = Color(android.graphics.Color.parseColor("#000000")))
                        .padding(2.dp),
                    tint = Color.White,
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "Home Icon"
                )
                    Image(
                        painter = painterResource(id = R.drawable.thyroid_test),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 50.dp, bottom = 4.dp)
                            .clickable {


                            }
                    )

                }

            }
        }
    }
}