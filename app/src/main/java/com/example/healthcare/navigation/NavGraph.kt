package com.example.healthcare.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.healthcare.model.AppointmentRepository
import com.example.healthcare.screens.AppointmentFormScreen
import com.example.healthcare.screens.Articels
import com.example.healthcare.screens.BottomNav
import com.example.healthcare.screens.ChatBot
import com.example.healthcare.screens.Doctor
import com.example.healthcare.screens.EmergencyContact
import com.example.healthcare.screens.Eyedoc
import com.example.healthcare.screens.Home
import com.example.healthcare.screens.Ineyedoc1
import com.example.healthcare.screens.Languages
import com.example.healthcare.screens.Login
import com.example.healthcare.screens.Register
import com.example.healthcare.screens.Splash
import com.example.healthcare.screens.StartPage
import com.example.healthcare.screens.TestLab
import com.example.healthcare.screens.about_doc
import com.example.healthcare.screens.language
import com.example.healthcare.screens.youtube.youtube0
import com.example.healthcare.screens.youtube.youtube1
import com.example.healthcare.screens.youtube.youtube2
import com.example.healthcare.screens.youtube.youtube3
import com.example.healthcare.screens.youtube.youtube4
import com.example.healthcare.screens.youtube.youtube5
import com.example.healthcare.viewModel.AppointmentViewModel
import com.example.healthcare.viewModel.AppointmentViewModelFactory


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun NavGraph(navController: NavHostController){
    val viewModel: AppointmentViewModel = viewModel(factory = AppointmentViewModelFactory(
        AppointmentRepository()
    )
    )
    NavHost(navController= navController,
        startDestination = Routes.Splash.routes){


        composable(Routes.Appointment.routes){
        AppointmentFormScreen(viewModel,navController)}

        composable(Routes.Login.routes){
            Login(navController)
        }
        composable(Routes.StartPage.routes){
            StartPage(navController)
        }
        composable(Routes.Splash.routes){
            Splash(navController)
        }
        composable(Routes.BottomNav.routes){
            BottomNav(navController)
        }
        composable(Routes.Languages.routes){
            Languages(navController)
        }
        composable(Routes.Ineyedoc1.routes){
            Ineyedoc1(navController)
        }
        composable(Routes.Lang.routes){
            language(navController, onDismiss = {})
        }

        composable(Routes.Articels.routes){
            Articels(navController)
        }
        composable(Routes.Emergency.routes){
            EmergencyContact(navController)
        }
        composable(Routes.TestLab.routes){
            TestLab(navController)
        }
        composable(Routes.About.routes){
            about_doc(navController)
        }
        composable(Routes.Youtube0.routes){
            youtube0(navController, youtubeVideoId = "eDsfoxje3R8", lifecycleOwner = LocalLifecycleOwner.current)
        }
        composable(Routes.Youtube1.routes){
            youtube1(navController, youtubeVideoId = "gDwt7dD3awc", lifecycleOwner = LocalLifecycleOwner.current )
        }
        composable(Routes.Youtube2.routes){
            youtube2(navController, youtubeVideoId = "cvxBlj1Xx8o", lifecycleOwner = LocalLifecycleOwner.current )
        }
        composable(Routes.Youtube3.routes){
            youtube3(navController, youtubeVideoId = "Oqf2T_SUalo", lifecycleOwner = LocalLifecycleOwner.current )
        }
        composable(Routes.Youtube4.routes){
            youtube4(navController, youtubeVideoId = "FKNRNY5ji_M", lifecycleOwner = LocalLifecycleOwner.current )
        }
        composable(Routes.Youtube5.routes){
            youtube5(navController, youtubeVideoId = "G7dgGxJPd-c", lifecycleOwner = LocalLifecycleOwner.current )
        }

        composable(Routes.Home.routes){
            Home(navController)//navController
        }
        composable(Routes.Doctor.routes){
            Doctor(navController)
        }
        composable(Routes.Eyedoc.routes){
            Eyedoc(navController)
        }

        composable(Routes.Chatbot.routes){
            ChatBot(navController)
        }



        composable(Routes.Register.routes){
            Register(navController)
        }

        }
    }


