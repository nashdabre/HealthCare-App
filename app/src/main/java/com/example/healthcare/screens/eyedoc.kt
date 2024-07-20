
package com.example.healthcare.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.healthcare.R
import com.example.healthcare.navigation.Routes


@Composable
fun Eyedoc(navController: NavHostController){
    Column(
        Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color(android.graphics.Color.parseColor("#eeeeee")))
            .padding(top = 32.dp, start = 16.dp, end = 16.dp),
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
                        navController.navigate(Routes.Doctor.routes) {
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
                    .padding(top = 4.dp, end = 3.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(20.dp)
                    )
                    .padding(top = 8.dp, start = 8.dp),
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()

                        .padding(top = 0.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .height(85.dp)
                            .width(85.dp)
                            .padding(bottom = 10.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#eeeeee")),
                                shape = CircleShape
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.eyedoc0),
                            contentDescription = null,
                            modifier = Modifier

                                .fillMaxSize()
                                .height(30.dp)
                                // .padding(7.dp)
                                .clip(CircleShape)
                            ,
                            contentScale = ContentScale.Crop

                        )
                    }
                    Column(
                        Modifier.width(175.dp),

                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 6.dp, end = 4.dp)
                                .height(25.dp)
                            // .background(
                            //  color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                            // shape = RoundedCornerShape(20.dp))
                            , contentAlignment = Alignment.TopStart
                        ) {
                            Text(
                                text = "Dr.Rajendra",
                                fontSize = 19.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#000000"))
                            )

                        }

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 6.dp, end = 4.dp)
                                .height(43.dp)
                            // .background(
                            //  color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                            // shape = RoundedCornerShape(20.dp))
                            , contentAlignment = Alignment.TopStart
                        ) {
                            Text(
                                text = "Eye Specialist",
                                fontSize = 14.sp,
                                //  fontWeight = FontWeight.Bold,
                                color = Color.Gray
                            )

                        }
                    }

                    Box(
                        modifier = Modifier
                            .height(40.dp)
                            .width(40.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#A2D9CE")),
                                shape = CircleShape
                            )

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.rightarrow),
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

                }


            }

        }
        //---------------------------------------------------------------------------------
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {

            Column(
                Modifier
                    .weight(0.5f)
                    .padding(top = 4.dp, end = 3.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(20.dp)
                    )
                    .padding(top = 8.dp, start = 8.dp),
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()

                        .padding(top = 0.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .height(85.dp)
                            .width(85.dp)
                            .padding(bottom = 10.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#eeeeee")),
                                shape = CircleShape
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.eyedoc1),
                            contentDescription = null,
                            modifier = Modifier

                                .fillMaxSize()
                                .height(30.dp)
                                // .padding(7.dp)
                                .clip(CircleShape)
                            ,
                            contentScale = ContentScale.Crop

                        )
                    }
                    Column(
                        Modifier.width(175.dp),

                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 6.dp, end = 4.dp)
                                .height(25.dp)
                            // .background(
                            //  color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                            // shape = RoundedCornerShape(20.dp))
                            , contentAlignment = Alignment.TopStart
                        ) {
                            Text(
                                text = "Dr.Netram",
                                fontSize = 19.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#000000"))
                            )

                        }

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 6.dp, end = 4.dp)
                                .height(43.dp)
                            // .background(
                            //  color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                            // shape = RoundedCornerShape(20.dp))
                            , contentAlignment = Alignment.TopStart
                        ) {
                            Text(
                                text = "Eye Specialist",
                                fontSize = 14.sp,
                                //  fontWeight = FontWeight.Bold,
                                color = Color.Gray
                            )

                        }
                    }

                    Box(
                        modifier = Modifier
                            .height(40.dp)
                            .width(40.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#A2D9CE")),
                                shape = CircleShape
                            )

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.rightarrow),
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

                }


            }

        }
        //---------------------------------------------------------------------------------
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {

            Column(
                Modifier
                    .weight(0.5f)
                    .padding(top = 4.dp, end = 3.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(20.dp)
                    )
                    .padding(top = 8.dp, start = 8.dp),
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()

                        .padding(top = 0.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .height(85.dp)
                            .width(85.dp)
                            .padding(bottom = 10.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#eeeeee")),
                                shape = CircleShape
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.eyedoc2),
                            contentDescription = null,
                            modifier = Modifier

                                .fillMaxSize()
                                .height(30.dp)
                                // .padding(7.dp)
                                .clip(CircleShape)
                            ,
                            contentScale = ContentScale.Crop

                        )
                    }
                    Column(
                        Modifier.width(175.dp),

                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 6.dp, end = 4.dp)
                                .height(25.dp)
                            // .background(
                            //  color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                            // shape = RoundedCornerShape(20.dp))
                            , contentAlignment = Alignment.TopStart
                        ) {
                            Text(
                                text = "Dr.Varu ",
                                fontSize = 19.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#000000"))
                            )

                        }

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 6.dp, end = 4.dp)
                                .height(43.dp)
                            // .background(
                            //  color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                            // shape = RoundedCornerShape(20.dp))
                            , contentAlignment = Alignment.TopStart
                        ) {
                            Text(
                                text = "Eye Specialist",
                                fontSize = 14.sp,
                                //  fontWeight = FontWeight.Bold,
                                color = Color.Gray
                            )

                        }
                    }

                    Box(
                        modifier = Modifier
                            .height(40.dp)
                            .width(40.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#A2D9CE")),
                                shape = CircleShape
                            )

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.rightarrow),
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

                }


            }

        }
        //---------------------------------------------------------------------------------
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {

            Column(
                Modifier
                    .weight(0.5f)
                    .padding(top = 4.dp, end = 3.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(20.dp)
                    )
                    .padding(top = 8.dp, start = 8.dp),
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()

                        .padding(top = 0.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .height(85.dp)
                            .width(85.dp)
                            .padding(bottom = 10.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#eeeeee")),
                                shape = CircleShape
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.eyedoc3),
                            contentDescription = null,
                            modifier = Modifier

                                .fillMaxSize()
                                .height(30.dp)
                                // .padding(7.dp)
                                .clip(CircleShape)
                            ,
                            contentScale = ContentScale.Crop

                        )
                    }
                    Column(
                        Modifier.width(175.dp),

                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 6.dp, end = 4.dp)
                                .height(25.dp)
                            // .background(
                            //  color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                            // shape = RoundedCornerShape(20.dp))
                            , contentAlignment = Alignment.TopStart
                        ) {
                            Text(
                                text = "Dr.Gayatri",
                                fontSize = 19.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#000000"))
                            )

                        }

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 6.dp, end = 4.dp)
                                .height(43.dp)
                            // .background(
                            //  color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                            // shape = RoundedCornerShape(20.dp))
                            , contentAlignment = Alignment.TopStart
                        ) {
                            Text(
                                text = "Eye Specialist",
                                fontSize = 14.sp,
                                //  fontWeight = FontWeight.Bold,
                                color = Color.Gray
                            )

                        }
                    }

                    Box(
                        modifier = Modifier
                            .height(40.dp)
                            .width(40.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#A2D9CE")),
                                shape = CircleShape
                            )

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.rightarrow),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp)
                                .clickable {
                                    navController.navigate(Routes.Doctor.routes) {
                                        popUpTo(navController.graph.startDestinationId)
                                        launchSingleTop = true
                                    }

                                }
                        )
                    }

                }


            }

        }
    }
}
