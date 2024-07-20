package com.example.healthcare.model

import java.time.LocalDate
import java.time.LocalTime

data class Appointment(
    val fullname: String = "",
    val dateofbirth: LocalDate,
    val gender: String = "",
    val phoneno: Long = 0,
    val address: String = "",
    val email: String = "",
    val preferreddate: LocalDate,
    val preferredtimeslot : LocalTime,
    val reason : String = "",
    val appointtype: String = "",
    val uid: String = ""
)