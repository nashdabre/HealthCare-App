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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.healthcare.R
import com.example.healthcare.navigation.Routes

@Composable
fun Doctor(navController: NavHostController){

    Column(
        Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color(android.graphics.Color.parseColor("#eeeeee")))
            .padding(top = 10.dp, start = 16.dp, end = 16.dp),
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
                    .padding(top = 16.dp)
            ) {
                Column(
                    Modifier
                        .weight(0.5f)
                        .height(185.dp)
                        .padding(end = 12.dp)
                        .background(
                            color = androidx.compose.ui.graphics.Color.White,
                            shape = RoundedCornerShape(10.dp)
                        )
                        .padding(top = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .height(95.dp)
                            .width(105.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                shape = RoundedCornerShape(20.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.eyedoc),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(7.dp)
                                .clickable {
                                   navController.navigate(Routes.Eyedoc.routes) {
                                        popUpTo(navController.graph.startDestinationId)
                                        launchSingleTop = true
                                    }

                                }
                        )
                    }
                    Button(onClick = {
                        navController.navigate(Routes.Eyedoc.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }


                    }, modifier = Modifier.fillMaxWidth().padding(top = 7.dp,start = 5.dp, end = 5.dp),
                        colors =  ButtonDefaults.outlinedButtonColors(
                            backgroundColor = Color(android.graphics.Color.parseColor("#6BB76E")))//
                        , shape = RoundedCornerShape(20.dp),


                        )

                    {
                        androidx.compose.material.Text(
                            text = stringResource(id = R.string.eye_special), style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,

                                ), modifier = Modifier.padding(vertical = 6.dp),color = Color.White
                        )

                    }

                }
//---------------------------------------------------------------------------------------------------
                Column(
                    Modifier
                        .weight(0.5f)
                        .height(185.dp)
                        .padding(end = 12.dp)
                        .background(
                            color = androidx.compose.ui.graphics.Color.White,
                            shape = RoundedCornerShape(10.dp)
                        )
                        .padding(top = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .height(95.dp)
                            .width(105.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                shape = RoundedCornerShape(20.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.childspec),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(7.dp)
                                .clickable {
                                    /*navController.navigate(Routes.Childdoc.routes) {
                                        popUpTo(navController.graph.startDestinationId)
                                        launchSingleTop = true
                                    }
*/
                                }
                        )
                    }
                    Button(onClick = {
                        navController.navigate(Routes.Eyedoc.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }


                    }, modifier = Modifier.fillMaxWidth().padding(top = 7.dp,start = 10.dp, end = 10.dp),
                        colors =  ButtonDefaults.outlinedButtonColors(
                            backgroundColor = Color(android.graphics.Color.parseColor("#6BB76E")))//
                        , shape = RoundedCornerShape(20.dp),


                        )

                    {
                        androidx.compose.material.Text(
                            text = stringResource(id = R.string.child_special), style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,

                                ), modifier = Modifier.padding(vertical = 6.dp),color = Color.White
                        )

                    }
                }
            }
 //--------------------------------------------------------------------------------------
 //-------------------------------------------------------------------------------
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 18.dp)
            ) {

                Column(
                    Modifier
                        .weight(0.5f)
                        .height(185.dp)
                        .padding(end = 12.dp)
                        .background(
                            color = androidx.compose.ui.graphics.Color.White,
                            shape = RoundedCornerShape(10.dp)
                        )
                        .padding(top = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .height(95.dp)
                            .width(105.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                shape = RoundedCornerShape(20.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.heattsurgen),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(7.dp)
                                .clickable {
                                    /*navController.navigate(Routes.Heartdoc.routes) {
                                        popUpTo(navController.graph.startDestinationId)
                                        launchSingleTop = true
                                    }*/

                                }
                        )
                    }
                    Button(onClick = {
                        navController.navigate(Routes.Eyedoc.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }


                    }, modifier = Modifier.fillMaxWidth().padding(top = 7.dp,start = 10.dp, end = 10.dp),
                        colors =  ButtonDefaults.outlinedButtonColors(
                            backgroundColor = Color(android.graphics.Color.parseColor("#6BB76E")))//
                        , shape = RoundedCornerShape(20.dp),


                        )

                    {
                        androidx.compose.material.Text(
                            text = stringResource(id = R.string.heart_surgen), style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,

                                ), modifier = Modifier.padding(vertical = 6.dp),color = Color.White
                        )

                    }
                }
//-----------------------------------------------------------------------------------------
                Column(
                    Modifier
                        .weight(0.5f)
                        .height(185.dp)
                        .padding(end = 12.dp)

                        .background(
                            color = androidx.compose.ui.graphics.Color.White,
                            shape = RoundedCornerShape(10.dp)
                        )
                        .padding(top = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .height(95.dp)
                            .width(105.dp)

                            .background(
                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                shape = RoundedCornerShape(20.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.dentist),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(7.dp)
                                .clickable {
                                    /*navController.navigate(Routes.Dentaldoc.routes) {
                                        popUpTo(navController.graph.startDestinationId)
                                        launchSingleTop = true
                                    }*/

                                }
                        )
                    }
                    Button(onClick = {
                        navController.navigate(Routes.Eyedoc.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }


                    }, modifier = Modifier.fillMaxWidth().padding(top = 7.dp, start = 10.dp, end = 10.dp),
                    colors =  ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color(android.graphics.Color.parseColor("#6BB76E")))//
                    , shape = RoundedCornerShape(20.dp),


                    )

                    {
                        androidx.compose.material.Text(
                            text = stringResource(id = R.string.dentist), style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,

                                ), modifier = Modifier.padding(vertical = 6.dp),color = Color.White
                        )

                    }
                }
            }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 18.dp)
        ) {
            Column(
                Modifier
                    .weight(0.5f)
                    .height(185.dp)
                    .padding(end = 12.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .height(95.dp)
                        .width(105.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#ffffff")),
                            shape = RoundedCornerShape(20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.capsule),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {
                                /* navController.navigate(Routes.Eyedoc.routes) {
                                     popUpTo(navController.graph.startDestinationId)
                                     launchSingleTop = true
                                 }*/

                            }
                    )
                }
                Button(onClick = {
                    navController.navigate(Routes.Eyedoc.routes) {
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                    }


                }, modifier = Modifier.fillMaxWidth().padding(top = 7.dp,start = 10.dp, end = 10.dp),
                    colors =  ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color(android.graphics.Color.parseColor("#6BB76E")))//
                    , shape = RoundedCornerShape(20.dp),


                    )

                {
                    androidx.compose.material.Text(
                        text = stringResource(id = R.string.pharmacist), style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,

                            ), modifier = Modifier.padding(vertical = 6.dp),color = Color.White
                    )

                }
                /*Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                        .height(40.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                            shape = RoundedCornerShape(bottomEnd = 20.dp, bottomStart = 20.dp)
                        ), contentAlignment = Alignment.Center
                ) {

                    Text(
                        text = "Eye Specialist",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(android.graphics.Color.parseColor("#7869e5"))
                    )
                }*/
            }
//---------------------------------------------------------------------------------------------------
            Column(
                Modifier
                    .weight(0.5f)
                    .height(185.dp)
                    .padding(end = 12.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .height(85.dp)
                        .width(95.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#ffffff")),
                            shape = RoundedCornerShape(20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.orthopedic),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {
                                /*navController.navigate(Routes.Childdoc.routes) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }
*/
                            }
                    )
                }
                Button(onClick = {
                    navController.navigate(Routes.Eyedoc.routes) {
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                    }


                }, modifier = Modifier.fillMaxWidth().padding(top = 7.dp,start = 10.dp, end = 10.dp),
                    colors =  ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color(android.graphics.Color.parseColor("#6BB76E")))//
                    , shape = RoundedCornerShape(20.dp),


                    )

                {
                    androidx.compose.material.Text(
                        text = stringResource(id = R.string.orthopedic), style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,

                            ), modifier = Modifier.padding(vertical = 6.dp),color = Color.White, textAlign = TextAlign.Center
                    )

                }
            }
        }

        }
    }
