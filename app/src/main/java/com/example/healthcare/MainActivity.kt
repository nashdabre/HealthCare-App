package com.example.healthcare

import android.os.Build
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.healthcare.model.AppointmentRepository
import com.example.healthcare.navigation.NavGraph
import com.example.healthcare.ui.theme.HealthCareTheme
import com.example.healthcare.viewModel.AppointmentViewModel
import com.example.healthcare.viewModel.AppointmentViewModelFactory


class MainActivity : AppCompatActivity() {

    //@RequiresApi(Build.VERSION_CODES.O)
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HealthCareTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   // val postNotificationService = rememberPermissionState(permission = Manifest.permission.POST_NOTIFICATIONS)

                    val navController = rememberNavController()
                    NavGraph(navController = navController)
                }
            }
        }
    }
}
