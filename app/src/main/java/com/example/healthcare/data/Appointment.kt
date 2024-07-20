package com.example.healthcare.data

data class Appointment(
    val fullName: String = "",
    val dob: String = "",
    val gender: String = "",
    val phone: String = "",
    val email: String = "",
    val preferredDate: String = "",
    val preferredTimeSlot: String = "",
    val doctor: String = "",
    val reason: String = "",
    val appointmentType: String = ""
)

