package com.example.healthcare.screens



import android.os.Build
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.os.LocaleListCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.example.healthcare.R
import com.example.healthcare.navigation.Routes
import com.example.healthcare.utils.SharedPref
import com.example.healthcare.viewModel.AuthViewModel
import java.time.LocalDate


@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Home(navController: NavHostController) {
    val authViewModel:AuthViewModel = viewModel()
    val firebaseUser by authViewModel.firebaseUser.observeAsState(null)
    val context = LocalContext.current
     val day = LocalDate.now().dayOfWeek
    val date = LocalDate.now()

    var showDialog by remember { mutableStateOf(false)}

    if (showDialog){
        language(navController = navController, onDismiss = {showDialog = false})
    }

    /*Calendar rightnow = Calendar.getInstance()
    val dateFormat = DateFormat.getDateInstance(DateFormat.DAY_OF_WEEK_FIELD).format(rightnow)*/
   Image(painter = painterResource(id = R.drawable.back1), contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize())
    Column(
        Modifier

            //.background(color = Color(android.graphics.Color.parseColor("#ede7f8")))
            .padding(top = 32.dp, start = 16.dp, end = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //val(text,logo,username) = createRefs()
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = rememberAsyncImagePainter(model = SharedPref.getImage(context)),
                contentDescription = null,
                modifier = Modifier
                    .width(60.dp)
                    .clip(CircleShape)
                    .height(60.dp)
                    .clickable {}
                    .background(Color.LightGray)


            )


                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                   verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()

                    ) {
                        Text(
                            text = stringResource(id = R.string.hello)+", ",
                            color = androidx.compose.ui.graphics.Color.White,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                        Text(
                            text = SharedPref.getName(context),
                            color = Color(android.graphics.Color.parseColor("#D8E94C")),
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                        
                        Spacer(modifier = Modifier.padding(start = 70.dp))

                        Box(modifier = Modifier
                            .size(35.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#eeeeee")),
                                shape = RoundedCornerShape(2.dp)
                            ))
                        {
                            Image(
                            painter = painterResource(id = R.drawable.language),
                            contentDescription = null,
                            modifier = Modifier
                                .size(35.dp)
                                .padding(end = 6.dp, start = 5.dp)
                                .clickable {
                                  showDialog = true
                                }
                        )}

                    }
                        //  val timeFormat = DateFormat.getTimeInstance(DateFormat.SHORT).format(calendar)
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()

                        ) {
                            Text(
                                text = "$day, ",
                                color = androidx.compose.ui.graphics.Color.Gray,
                                fontSize = 20.sp,
                             //   fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                            Text(
                                text = "$date",
                                color = androidx.compose.ui.graphics.Color.Gray,
                                fontSize = 20.sp,
                               // fontWeight = FontWeight.Bold,
                               // modifier = Modifier.padding(start = 10.dp)
                            )

                    }

                }


        }
        var text by rememberSaveable { mutableStateOf("") }

        TextField(
            value = text, onValueChange = { text = it },
            label = { Text(text = "Searching for...") },
            trailingIcon = {
              /*  Box(
                    modifier = Modifier
                        .padding(end = 6.dp)
                        .height(45.dp)
                        .width(45.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#BFA3EF")),
                            shape = RoundedCornerShape(10.dp)
                        )
                )*/
                Image(
                    painter = painterResource(id = R.drawable.search),
                    contentDescription = null,
                    modifier = Modifier
                        .size(35.dp)
                        .padding(end = 6.dp)
                )
            },
            shape = RoundedCornerShape(10.dp),
            colors = OutlinedTextFieldDefaults.colors(
                //backgroundColor = Color.White,
                focusedBorderColor = androidx.compose.ui.graphics.Color.Black,
                unfocusedBorderColor = androidx.compose.ui.graphics.Color.Black,
                //textColor = Color(android.graphics.Color.parseColor("5e5e5e")),
                unfocusedLabelColor = Color(android.graphics.Color.parseColor("#000000")),
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 38.dp)
                .background(Color(android.graphics.Color.parseColor("#c3c3c3")), CircleShape)
        )

        Row (
            modifier =  Modifier.padding(top = 45.dp),
            horizontalArrangement = Arrangement.Start
        ) {

            Column (modifier = Modifier.padding(start = 10.dp),
                horizontalAlignment = Alignment.Start){


            Box(
                modifier = Modifier
                    .height(55.dp)
                    .width(55.dp)
                    .background(
                        color = Color(android.graphics.Color.parseColor("#eeeeee")),
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {

                Image(
                    painter = painterResource(id = R.drawable.chemist),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(7.dp)
                        .clickable {
                            navController.navigate(Routes.TestLab.routes) {
                                popUpTo(navController.graph.startDestinationId)
                                launchSingleTop = true
                            }
                        }
                )

            }
            Text(
                text = stringResource(id = R.string.test_lab),
                fontSize = 16.sp,
               fontWeight = FontWeight.Bold,
                color = Color(android.graphics.Color.parseColor("#000000")),
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    //----------------------------------------------------------------------------
   // ----------------------------------------------------------------------------

            Column (modifier = Modifier.padding(start = 17.dp),
                horizontalAlignment = Alignment.Start){


                Box(
                    modifier = Modifier
                        .height(55.dp)
                        .width(55.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#eeeeee")),
                            shape = CircleShape
                        ),
                    contentAlignment = Alignment.Center
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.doctor),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {
                                navController.navigate(Routes.Doctor.routes) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }

                            }
                    )

                }
                Text(
                    text = stringResource(id = R.string.doctor),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(android.graphics.Color.parseColor("#000000")),
                    modifier = Modifier.padding(top = 8.dp, start = 2.dp)
                )
            }
            //----------------------------------------------------------------------------
            // ----------------------------------------------------------------------------

            Column (modifier = Modifier.padding(start = 20.dp),
                horizontalAlignment = Alignment.Start){


                Box(
                    modifier = Modifier
                        .height(55.dp)
                        .width(55.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#eeeeee")),
                            shape = CircleShape
                        ),
                    contentAlignment = Alignment.Center
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.aware),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {
                                navController.navigate(Routes.Articels.routes) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }

                            }
                    )

                }
                Text(
                    text = stringResource(id = R.string.articels),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(android.graphics.Color.parseColor("#000000")),
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            //----------------------------------------------------------------------------
            // ----------------------------------------------------------------------------

            Column (modifier = Modifier.padding(start = 14.dp),
                horizontalAlignment = Alignment.CenterHorizontally){


                Box(
                    modifier = Modifier
                        .height(55.dp)
                        .width(55.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#eeeeee")),
                            shape = CircleShape
                        ),
                    contentAlignment = Alignment.CenterEnd
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.phone_call),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {
                                navController.navigate(Routes.Emergency.routes) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }

                            }
                    )

                }
                Text(
                    text = stringResource(id = R.string.emergency),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(android.graphics.Color.parseColor("#000000")),
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }

        

        Row(
            modifier = Modifier
                .height(200.dp)
                .width(150.dp)
                .padding(top = 60.dp)
        ) {

            Column(
                Modifier
                    .weight(0.4f)
                    .padding(end = 12.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(20.dp)
                    )
                    .padding(top = 9.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .height(65.dp)
                        .width(75.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#7868e5")),
                            shape = RoundedCornerShape(20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    LaunchedEffect(firebaseUser) {
                        if (firebaseUser == null) {
                            navController.navigate(Routes.Login.routes) {
                                popUpTo(navController.graph.startDestinationId)
                                launchSingleTop = true
                            }
                        }
                    }
                    Image(
                        painter = painterResource(id = R.drawable.healthcare),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {
                                authViewModel.logout()

                            }
                    )
                }



                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                        .height(30.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                            shape = RoundedCornerShape(bottomEnd = 20.dp, bottomStart = 20.dp)
                        ), contentAlignment = Alignment.Center
                ) {


                    Text(
                        text = stringResource(id = R.string.logout),
                        style = TextStyle(

                            fontSize = 19.sp,

                            )
                        ,
                        fontWeight = FontWeight.Bold,
                        color = Color(android.graphics.Color.parseColor("#7869e5")),
                        modifier = Modifier.clickable {
                            authViewModel.logout()

                        }
                    )
                }

            }

            }
        Row(modifier= Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.End) {


            FloatingActionButton(
                onClick = {
                    navController.navigate(Routes.Chatbot.routes) {
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                    }
                }, modifier = Modifier
                    .height(65.dp)
                    .width(65.dp),
                containerColor = Color.White,
                shape = CircleShape


            ) {
                Image(
                    painter = painterResource(id = R.drawable.chatbot),
                    contentDescription = null,

                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(7.dp)
                        .clickable {
                            navController.navigate(Routes.Chatbot.routes) {
                                popUpTo(navController.graph.startDestinationId)
                                launchSingleTop = true
                            }

                        },

                    )

            }
        }
        }
    }

@Composable
fun language(navController: NavHostController,onDismiss:()->Unit){
    val localeOptions = mapOf(
        "English" to "en",
        "हिंदी" to "hi",
        "मराठी" to "mr",

        )

    /*

    }*/

    AlertDialog(onDismissRequest = onDismiss,
        confirmButton = {},
        modifier = Modifier.height(300.dp),

        title = {
            Text(text = "Select Language",  fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(android.graphics.Color.parseColor("#000000")),
                modifier = Modifier.padding(top = 8.dp))
        },
        text = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp)
            ) {
                localeOptions.forEach { (languageName, languageTag) ->
                    OutlinedButton(
                        onClick = {
                            AppCompatDelegate.setApplicationLocales(
                                LocaleListCompat.forLanguageTags(languageTag)
                            )

                            navController.navigate(Routes.BottomNav.routes) {
                                popUpTo(navController.graph.startDestinationId)
                                launchSingleTop = true
                            }
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 7.dp, start = 8.dp, end = 8.dp)
                            .shadow(
                                10.dp,
                                shape = RoundedCornerShape(10.dp),
                                ambientColor = Color.Black
                            ),
                        colors = ButtonDefaults.outlinedButtonColors(
                            backgroundColor = Color(android.graphics.Color.parseColor("#6BB76E"))
                        ),
                        shape = RoundedCornerShape(20.dp),
                    ) {
                        androidx.compose.material.Text(
                            text = languageName, style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,
                            ), modifier = Modifier.padding(vertical = 6.dp), color = Color.White
                        )
                    }
                }
            }
        }

        )
}











