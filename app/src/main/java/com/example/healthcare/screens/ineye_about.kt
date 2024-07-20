package com.example.healthcare.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.VideoCameraBack
import androidx.compose.material.icons.filled.Whatsapp
import androidx.compose.material.icons.filled.WorkspacePremium
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.healthcare.R
import com.example.healthcare.navigation.Routes


@Composable
fun about_doc(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color(android.graphics.Color.parseColor("#eeeeee")))
            .padding(top = 32.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(start = 12.dp)
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
                                  navController.navigate(Routes.Ineyedoc1.routes) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }

                            }
                    )
                }

            Spacer(modifier = Modifier.width(80.dp))

            Text(text = "About", fontSize = 30.sp, fontWeight = FontWeight(700),fontStyle = FontStyle.Italic)
    }

        Spacer(modifier = Modifier.height(40.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.eyedoc0),
                contentDescription = null,
                modifier = Modifier
                    .width(115.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .height(115.dp)

                    .clickable {}


            )

            Spacer(modifier = Modifier.width(20.dp))

            Column {
                Text(text = "Dr. Antony Ryan", fontSize = 26.sp, fontWeight = FontWeight(700),fontStyle = FontStyle.Italic)
                Row (verticalAlignment = Alignment.CenterVertically){
                    Image(
                        painter = painterResource(id = R.drawable.medical),
                        contentDescription = null,
                        modifier = Modifier
                            .width(20.dp)
                            .height(20.dp)
                            .clickable {}


                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(text = "Eye Specialist", fontSize = 18.sp,fontStyle = FontStyle.Italic)

                }
                Row (modifier = Modifier.height(60.dp), verticalAlignment = Alignment.CenterVertically){
                    Icon(
                        modifier = Modifier
                            .width(45.dp)
                            .height(45.dp)
                            .clip(shape = RoundedCornerShape(8.dp))
                            .background(color = Color(android.graphics.Color.parseColor("#00695c")))
                            .padding(5.dp),
                        tint = Color.White,
                        imageVector = Icons.Default.CalendarMonth,
                        contentDescription = "Home Icon"
                    )

                    Spacer(modifier = Modifier.width(17.dp))

                        Icon(
                            modifier = Modifier
                                .width(45.dp)
                                .height(45.dp)
                                .clip(shape = RoundedCornerShape(8.dp))
                                .background(color = Color(android.graphics.Color.parseColor("#00695c")))
                                .padding(5.dp),
                            tint = Color.White,
                            imageVector = Icons.Default.Whatsapp,
                            contentDescription = "Home Icon"
                        )

                    Spacer(modifier = Modifier.width(17.dp))

                    Icon(
                        modifier = Modifier
                            .width(45.dp)
                            .height(45.dp)
                            .clip(shape = RoundedCornerShape(8.dp))
                            .background(color = Color(android.graphics.Color.parseColor("#00695c")))
                            .padding(5.dp),
                        tint = Color.White,
                        imageVector = Icons.Default.VideoCameraBack,
                        contentDescription = "Home Icon"
                    )

                }
            }
        }
     //----------------------------------------------------------------------------------------
     //--------------------------------------------------------------------------------------------
        Row (modifier = Modifier.padding(top = 20.dp, start = 4.dp)){
            Spacer(modifier = Modifier.width(3.dp))
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .width(110.dp)
                    .background(
                        color = Color(android.graphics.Color.parseColor("#ffffff")),
                        shape = RoundedCornerShape(15.dp)
                    ),
                contentAlignment = Alignment.TopCenter

            ) {

                Icon(
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .width(65.dp)
                        .height(65.dp)
                        .clip(shape = CircleShape)
                        .background(color = Color(android.graphics.Color.parseColor("#f5f5f5")))
                        .padding(13.dp),
                    tint =Color(android.graphics.Color.parseColor("#29b6f6")),
                    imageVector = Icons.Default.People,
                    contentDescription = "Home Icon"
                )
                Text(text = "999+",  modifier = Modifier.padding(top = 100.dp), fontWeight = FontWeight(700))
                Text(text = "Patients", modifier = Modifier.padding(top = 115.dp))
            }
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .width(110.dp)
                    .background(
                        color = Color(android.graphics.Color.parseColor("#ffffff")),
                        shape = RoundedCornerShape(15.dp)
                    ),
                contentAlignment = Alignment.TopCenter

            ) {

                Icon(
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .width(65.dp)
                        .height(65.dp)
                        .clip(shape = CircleShape)
                        .background(color = Color(android.graphics.Color.parseColor("#f5f5f5")))
                        .padding(13.dp),
                    tint =Color(android.graphics.Color.parseColor("#f06292")),
                    imageVector = Icons.Default.WorkspacePremium,
                    contentDescription = "Home Icon"
                )
                Text(text = "10+",  modifier = Modifier.padding(top = 100.dp), fontWeight = FontWeight(700))
                Text(text = "Experience", modifier = Modifier.padding(top = 115.dp))
            }

            Spacer(modifier = Modifier.width(8.dp))

            Box(
                modifier = Modifier
                    .height(150.dp)
                    .width(110.dp)
                    .background(
                        color = Color(android.graphics.Color.parseColor("#ffffff")),
                        shape = RoundedCornerShape(15.dp)
                    ),
                contentAlignment = Alignment.TopCenter

            ) {

                Icon(
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .width(65.dp)
                        .height(65.dp)
                        .clip(shape = CircleShape)
                        .background(color = Color(android.graphics.Color.parseColor("#f5f5f5")))
                        .padding(13.dp),
                    tint =Color(android.graphics.Color.parseColor("#ffee58")),
                    imageVector = Icons.Default.Star,
                    contentDescription = "Home Icon"
                )
                Text(text = "4.7",  modifier = Modifier.padding(top = 100.dp), fontWeight = FontWeight(700))
                Text(text = "Ratings", modifier = Modifier.padding(top = 115.dp))
            }
        }
        Row (modifier = Modifier
            .padding(top = 20.dp, start = 10.dp, end = 10.dp, bottom = 10.dp)
            .fillMaxWidth()
            .background(
                color = Color(android.graphics.Color.parseColor("#ffffff")),
                shape = RoundedCornerShape(15.dp))){

            Column(modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth().height(350.dp))
                {
                Text(text = "About", fontWeight = FontWeight(500), fontSize = 20.sp)
                Text(text = "MD from Harvard Medical School, 2010; MBBS from All India Institute of Medical Sciences, 2005." +
                        " Eye specialist.", fontSize = 16.sp)
                Text(text = "Working time",modifier = Modifier.padding(top = 7.dp),
                    fontSize = 20.sp,fontWeight = FontWeight(500))
                Text(text = "Mon - Fri . 09:00 AM - 05:00 PM", fontSize = 16.sp)
                Text(text = "Certifications", modifier = Modifier.padding(top = 7.dp),
                    fontSize = 20.sp,fontWeight = FontWeight(500))
                Text(text = "Board Certified in Cardiology, Fellowship in Interventional Cardiology, Member of American College of Cardiology.", fontSize = 16.sp)

            }


        }

    }
}