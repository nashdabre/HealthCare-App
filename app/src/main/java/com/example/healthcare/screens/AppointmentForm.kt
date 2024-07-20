package com.example.healthcare.screens

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Context
import android.util.Patterns
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.healthcare.R
import com.example.healthcare.navigation.Routes
import com.example.healthcare.viewModel.AppointmentViewModel


@Composable
fun AppointmentFormScreen(viewModel: AppointmentViewModel,navController: NavController) {
    var fullName by remember { mutableStateOf("") }
    var dob = remember { mutableStateOf("") }

    var phone by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var preferredDate = remember { mutableStateOf("") }
    var preferredTimeSlot = remember { mutableStateOf("") }
    var doctor by remember { mutableStateOf("") }
    var reason by remember { mutableStateOf("") }
    var phoneInt : Long by remember { mutableStateOf(0) }
    val appointmentTypes = listOf("Offline", "Virtual/Online")
    val context = LocalContext.current
    var validateEmail by rememberSaveable { mutableStateOf(true) }
    val showTimePicker = remember { mutableStateOf(false) }

    // Your form implementation here

    // Time Picker Dialog
    if (showTimePicker.value) {
        TimePickerDialog(
            context = context,
            onDismiss = { showTimePicker.value = false },
            onTimeSelected = { time ->
                preferredTimeSlot.value = time
                showTimePicker.value = false
            }
        )
    }

    val showDatePicker = remember { mutableStateOf(false) }

    // Your form implementation here

    // Date Picker Dialog
    if (showDatePicker.value) {
        DatePickerDialog(
            context = context,
            onDismiss = { showDatePicker.value = false },
            onDateSelected = { date ->
                preferredDate.value = date
                showDatePicker.value = false
            }
        )
    }

    //date picker for dob
    val showDobPicker = remember { mutableStateOf(false) }
    // Date Picker Dialog for Date of Birth
    if (showDobPicker.value) {
        DatePickerDialog(
            context = context,
            onDismiss = { showDobPicker.value = false },
            onDateSelected = { date ->
                dob.value = date
                showDobPicker.value = false
            }
        )
    }
    var gender by remember { mutableStateOf("Select Gender") }
    var expanded by remember { mutableStateOf(false) }
    var expanded1 by remember { mutableStateOf(false) }

    val genderOptions = listOf("Male", "Female", "Other")
    var appointmentType by remember { mutableStateOf("Select Appointment type") }
    val appointmentOptions = listOf("Online", "Offline")

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
                        navController.navigate(Routes.Ineyedoc1.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }

                    }
            )


        }

        Text(
            text = "Appointment",
            modifier = Modifier.padding(start = 96.dp),
            style = TextStyle(
                fontWeight = FontWeight.ExtraBold,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
            )
        )



        LazyColumn(modifier = Modifier.padding(4.dp)) {
            item {
                OutlinedTextField(
                    value = fullName,
                    onValueChange = { fullName = it },
                    label = { Text(text = "Full Name") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp)
                )
            }

            item {
                OutlinedTextField(
                    value = dob.value,
                    onValueChange = { dob.value = it },
                    label = { Text(text = "Date of birth") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    trailingIcon = {
                        IconButton(onClick = { showDobPicker.value = true }) {
                            Icon(
                                imageVector = Icons.Default.CalendarToday,
                                contentDescription = null
                            )
                        }
                    }
                )
            }

            item {

                    OutlinedTextField(
                        value = gender,
                        onValueChange = {  },
                        label = { Text(text = "Gender") },
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { expanded = true }
                            .padding(top = 4.dp),
                        shape = RoundedCornerShape(20.dp), readOnly = true


                    )

                Column {
                    DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { expanded = false },
                        modifier = Modifier
                            .width(300.dp)
                            .padding(10.dp)
                    ) {
                        genderOptions.forEach { item ->
                            DropdownMenuItem(onClick = {
                                gender = item
                                expanded = false
                            }) {
                                Text(text = item)
                            }
                        }
                    }
                }


                 /*OutlinedTextField(
                    value = gender,
                    onValueChange = { },
                    label = { Text(text = "Gender") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp)
                )*/
            }

            item {
                OutlinedTextField(
                    value = phone,
                    onValueChange = { phone = it },
                    label = { Text(text = "Phone Number") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp)
                )
            }

            validateEmail = Patterns.EMAIL_ADDRESS.matcher(email).matches()
            item {
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text(text = "Email Address") },
                    placeholder = { Text(text = "abc@domain.com") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email,
                        imeAction = ImeAction.Next
                    ),
                    shape = RoundedCornerShape(20.dp),
                    isError = !validateEmail,
                )
            }

            item {
                OutlinedTextField(
                    value = preferredDate.value,
                    onValueChange = { preferredDate.value = it },
                    label = { Text(text = "Preferred Date") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    trailingIcon = {
                        IconButton(onClick = { showDatePicker.value = true }) {
                            Icon(
                                imageVector = Icons.Default.CalendarToday,
                                contentDescription = null
                            )
                        }
                    }
                )
            }

            item {
                OutlinedTextField(
                    value = preferredTimeSlot.value,
                    onValueChange = { preferredTimeSlot.value = it },
                    label = { Text(text = "Preferred Time Slot") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    trailingIcon = {
                        IconButton(onClick = { showTimePicker.value = true }) {
                            Icon(imageVector = Icons.Default.AccessTime, contentDescription = null)
                        }
                    }
                )
            }

            item {
                OutlinedTextField(
                    value = reason,
                    onValueChange = { reason = it },
                    label = { Text(text = "Reason") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp), // Text area
                    shape = RoundedCornerShape(20.dp)
                )
            }

            item {

       /*         OutlinedTextField(
                    value = appointmentType,
                    onValueChange = { appointmentType = it },
                    label = { Text(text = "Appointment Type") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp)
                )*/
                OutlinedTextField(
                    value = appointmentType,
                    onValueChange = {  },
                    label = {Text(text = "Appointment Type") },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { expanded1 = true }
                        .padding(top = 4.dp),
                    shape = RoundedCornerShape(20.dp), readOnly = true


                )

                Column {
                    DropdownMenu(
                        expanded = expanded1,
                        onDismissRequest = { expanded1 = false },
                        modifier = Modifier
                            .width(300.dp)
                            .padding(10.dp)
                    ) {
                        appointmentOptions.forEach { item ->
                            DropdownMenuItem(onClick = {
                                appointmentType = item
                                expanded1 = false
                            }) {
                                Text(text = item)
                            }
                        }
                    }
                }
            }

            item {
                Box(modifier = Modifier.height(30.dp))

                Button(
                    onClick = {
                         if(validateEmail == false){
                        Toast.makeText(context,"Please Enter a valid email", Toast.LENGTH_SHORT).show()
                    }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color(
                            android.graphics.Color.parseColor(
                                "#6C9E81"
                            )
                        )
                    ),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Text(
                        text = "Book Appointment", style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp
                        ), modifier = Modifier.padding(vertical = 6.dp), color = Color.White
                    )
                }
            }
        }
    }
}

// Date Picker Function
@Composable
fun DatePickerDialog(
    context: Context,
    onDismiss: () -> Unit,
    onDateSelected: (String) -> Unit
) {
    val datePickerDialog = remember {
        DatePickerDialog(context, { _, year, month, dayOfMonth ->
            val selectedDate = String.format("%02d/%02d/%d", dayOfMonth, month + 1, year)
            onDateSelected(selectedDate)
        }, 2023, 0, 1) // Set default date as needed
    }

    // Display the dialog when this composable is active
    LaunchedEffect(Unit) {
        datePickerDialog.show()
    }
}

// Time Picker Function
@Composable
fun TimePickerDialog(
    context: Context,
    onDismiss: () -> Unit,
    onTimeSelected: (String) -> Unit
) {
    val timePickerDialog = remember {
        TimePickerDialog(context, { _, hourOfDay, minute ->
            val selectedTime = String.format("%02d:%02d", hourOfDay, minute)
            onTimeSelected(selectedTime)
        }, 12, 0, true) // Default time (12-hour format)
    }

    // Display the dialog when this composable is active
    LaunchedEffect(Unit) {
        timePickerDialog.show()
    }
}

