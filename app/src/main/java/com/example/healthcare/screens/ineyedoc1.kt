package com.example.healthcare.screens


//import androidx.compose.runtime.getValue

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import com.example.healthcare.data.Tools
import com.example.healthcare.navigation.Routes
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale


@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

@Composable
fun Ineyedoc1(navController: NavController){

    val currentDate = remember { LocalDate.now() }
    val formatter = remember { DateTimeFormatter.ofPattern("MMMM yyyy", Locale.getDefault()) }
    val formattedDate = remember { currentDate.format(formatter) }



    Image(painter = painterResource(id = R.drawable.indoc1), contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize())
    Column {


        Column(
            Modifier

                .padding(top = 8.dp, start = 16.dp, end = 16.dp),
            // horizontalAlignment = Alignment.CenterHorizontally
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
                            navController.navigate(Routes.Eyedoc.routes) {
                                popUpTo(navController.graph.startDestinationId)
                                launchSingleTop = true
                            }

                        }
                )


            }
            Column(
                Modifier

                    .padding(top = 0.dp, start = 16.dp, end = 12.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End
                ) {
                    Box(
                        modifier = Modifier
                            .height(45.dp)
                            .width(45.dp)
                            .background(
                                color = Color.White,
                                shape = CircleShape
                            ),
                        //   contentAlignment = Alignment.TopStart

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.heart),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp)
                                .clickable {
                                    /* navController.navigate(Routes.BottomNav.routes) {
                                popUpTo(navController.graph.startDestinationId)
                                launchSingleTop = true
                            }*/

                                }
                        )


                    }
                }

                Row(
                    modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End,
                    // verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier.width(210.dp),
                        verticalArrangement = Arrangement.Bottom,
                        horizontalAlignment = Alignment.End
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.eyedoc0),
                            contentDescription = null,
                            modifier = Modifier
                                .width(115.dp)
                                .clip(CircleShape)
                                .height(115.dp)
                                .clickable {}
                                .border(
                                    3.dp,
                                    Color(android.graphics.Color.parseColor("#707B7C")),
                                    CircleShape
                                )


                        )
                    }
                    Column(
                        modifier = Modifier
                            .width(110.dp)
                            .height(120.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.End
                    ) {
                        Box(
                            modifier = Modifier
                                .height(45.dp)
                                .width(45.dp)
                                //.padding(start = 10.dp)
                                .background(
                                    color = Color.White,
                                    shape = CircleShape
                                ),
                            //   contentAlignment = Alignment.TopStart

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.video),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(8.dp)
                                    .clickable {
                                        /* navController.navigate(Routes.BottomNav.routes) {
                                  popUpTo(navController.graph.startDestinationId)
                                  launchSingleTop = true
                              }*/

                                    }
                            )


                        }
                    }


                }
                Row(
                    modifier = Modifier.fillMaxWidth()/*.clip(RoundedCornerShape(40.dp)).background(Color.White)*/,
                    horizontalArrangement = Arrangement.End
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "Dr.Antony Ryan",
                            style = TextStyle(

                                fontSize = 20.sp,

                                ),
                            color = Color.Black,
                            textAlign = TextAlign.Start,
                            modifier = Modifier.padding(top = 0.dp, end = 42.dp)

                        )
                        Text(
                            text = "Eye Specialist",
                            style = TextStyle(

                                fontSize = 20.sp,

                                ),
                            color = Color.Gray,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(top = 6.dp, end = 45.dp)

                        )
                    }


                    Box(
                        modifier = Modifier
                            .height(45.dp)
                            .width(45.dp)
                            .background(
                                color = Color.White,
                                shape = CircleShape
                            ),
                        //   contentAlignment = Alignment.TopStart

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.chat),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp)
                                .clickable {
                                    /* navController.navigate(Routes.BottomNav.routes) {
                                popUpTo(navController.graph.startDestinationId)
                                launchSingleTop = true
                            }*/

                                }
                        )


                    }
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(top = 40.dp)
                    .clip(RoundedCornerShape(40.dp))
                    .background(Color(android.graphics.Color.parseColor("#BFC9CA")))
                    .padding(top = 0.dp),// horizontalArrangement = Arrangement.Center
            ) {

                Button(
                    onClick = {
                        //  Datepick()


                    },
                    modifier = Modifier
                        .width(116.dp)
                        .padding(top = 6.dp, start = 8.dp, end = 8.dp),
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color(android.graphics.Color.parseColor("#6BB76E"))
                    )//
                    ,
                    shape = RoundedCornerShape(20.dp),


                    )

                {
                    Text(
                        text = "Schedule", style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,

                            ), modifier = Modifier.padding(vertical = 6.dp), color = Color.White
                    )

                }



                Button(
                    onClick = {

                        navController.navigate(Routes.About.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }

                    },
                    modifier = Modifier
                        .width(110.dp)
                        .padding(top = 7.dp, start = 0.dp, end = 8.dp),
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color(android.graphics.Color.parseColor("#6BB76E"))
                    ),//
                    shape = RoundedCornerShape(20.dp),


                    )

                {
                    Text(
                        text = "About", style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,

                            ), modifier = Modifier.padding(vertical = 6.dp), color = Color.White
                    )

                }


                Button(
                    onClick = {
                        /*navController.navigate(Routes.Eyedoc.routes) {
                    popUpTo(navController.graph.startDestinationId)
                    launchSingleTop = true
                }*/


                    },
                    modifier = Modifier
                        .width(130.dp)
                        .padding(top = 7.dp, start = 0.dp, end = 8.dp),
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color(android.graphics.Color.parseColor("#6BB76E"))
                    )//
                    ,
                    shape = RoundedCornerShape(20.dp),


                    )

                {
                    Text(
                        text = "Review", style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,

                            ), modifier = Modifier.padding(vertical = 6.dp), color = Color.White
                    )

                }


            }

            Text(
                text = formattedDate,
                style = TextStyle(

                    fontSize = 19.sp

                    ),
                color = Color.DarkGray,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 15.dp, start = 10.dp, end = 32.dp)

            )
            Text(
                text = "Days available",
                style = TextStyle(

                    fontSize = 19.sp,

                    ),
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 6.dp, start = 10.dp, end = 32.dp)

            )


            val buttonLabels = listOf("Mon", "Tue", "Wed", "Thu", "Fri")


            LazyRow(
                modifier = Modifier.padding(start = 6.dp, top = 3.dp, end = 10.dp),
                contentPadding = PaddingValues(end = 3.dp)
            ) {
                items(buttonLabels) { label ->
                    Button(
                        onClick = {
                            //  Datepick()


                        },
                        modifier = Modifier
                            .width(90.dp)
                            .padding(top = 7.dp, start = 8.dp, end = 8.dp),
                        colors = ButtonDefaults.outlinedButtonColors(
                            backgroundColor = Color(android.graphics.Color.parseColor("#f5f5f5"))
                        )//
                        ,
                        shape = RoundedCornerShape(20.dp),


                        )

                    {
                        Text(
                            text = label,
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 10.sp,

                                ),
                            modifier = Modifier.padding(vertical = 6.dp),
                            color = Color.DarkGray
                        )

                    }

                }
            }

            Text(
                text = "Hours available",
                style = TextStyle(

                    fontSize = 19.sp,

                    ),
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 20.dp, start = 8.dp, end = 32.dp)

            )


            val Hours =
                listOf("08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00")


            LazyRow(
                modifier = Modifier.padding(start = 6.dp, top = 5.dp, end = 10.dp),
                contentPadding = PaddingValues(end = 3.dp)
            ) {
                items(Hours) { label ->
                    Button(
                        onClick = {
                            //  Datepick()


                        },
                        modifier = Modifier
                            .width(90.dp)
                            .padding(top = 7.dp, start = 8.dp, end = 8.dp),
                        colors = ButtonDefaults.outlinedButtonColors(
                            backgroundColor = Color(android.graphics.Color.parseColor("#f5f5f5"))
                        )//
                        ,
                        shape = RoundedCornerShape(20.dp),


                        )

                    {
                        Text(
                            text = label,
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 10.sp,

                                ),
                            modifier = Modifier.padding(vertical = 6.dp),
                            color = Color.DarkGray
                        )

                    }

                }
            }


        }



            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
                    .padding(top = 20.dp)
                    .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                    .background(Color(android.graphics.Color.parseColor("#e0e0e0")))
                    .padding(top = 0.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = {
                        navController.navigate(Routes.Appointment.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }


                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 7.dp, start = 16.dp, end = 16.dp),
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color(android.graphics.Color.parseColor("#6BB76E"))
                    )//
                    ,
                    shape = RoundedCornerShape(20.dp),


                    )

                {
                    Text(
                        text = "Appointment", style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,

                            ), modifier = Modifier.padding(vertical = 6.dp), color = Color.White
                    )

                }

            }

    }
}

@SuppressLint("UnrememberedMutableState")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Datepick() {
    var dateResult by remember { mutableStateOf("Date Picker") }
    val openDialog = remember { mutableStateOf(true) }
    Scaffold(content = { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 100.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {
                    openDialog.value = true

                },
                modifier = Modifier
                    .width(130.dp)
                    .padding(top = 7.dp, start = 8.dp, end = 8.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    backgroundColor = Color(android.graphics.Color.parseColor("#6BB76E"))
                )//
                ,
                shape = RoundedCornerShape(20.dp),


                )

            {
                //(text = dateResult)
                Text(
                    text = dateResult, style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,

                        ), modifier = Modifier.padding(vertical = 6.dp), color = Color.White
                )

            }
        }

        if (openDialog.value) {
            val datePickerState = rememberDatePickerState()
            val confirmEnabled =
                derivedStateOf { datePickerState.selectedDateMillis != null }

            DatePickerDialog(onDismissRequest = { openDialog.value = false },
                confirmButton = {
                    TextButton(
                        onClick = {
                            openDialog.value = false
                            var date = "No selection"
                            if (datePickerState.selectedDateMillis != null) {
                                date =
                                    Tools.convertLongToTime(datePickerState.selectedDateMillis!!)
                            }
                            dateResult = date
                        },
                        enabled = confirmEnabled.value
                    ) {
                        Text(text = "Okay")
                    }
                }) {
                DatePicker(state = datePickerState)
            }
        }
    })
}
