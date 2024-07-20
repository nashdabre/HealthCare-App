package com.example.healthcare.viewModel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.healthcare.data.Appointment
import com.example.healthcare.model.AppointmentRepository

class AppointmentViewModel(private val repository: AppointmentRepository) : ViewModel() {
    var appointments = mutableStateListOf<Appointment>()

    init {
        loadAppointments()
    }

    private fun loadAppointments() {
        repository.getAppointments(
            onSuccess = { appointments.addAll(it) },
            onFailure = { /* Handle error */ }
        )
    }

    fun addAppointment(appointment: Appointment) {
        repository.addAppointment(appointment,
            onSuccess = { appointments.add(appointment) },
            onFailure = { /* Handle error */ }
        )
    }
}
