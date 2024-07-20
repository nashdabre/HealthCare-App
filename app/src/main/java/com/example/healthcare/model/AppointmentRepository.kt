package com.example.healthcare.model

import com.example.healthcare.data.Appointment
import com.google.firebase.firestore.FirebaseFirestore

class AppointmentRepository {
    private val db = FirebaseFirestore.getInstance()
    private val appointmentCollection = db.collection("appointments")

    fun addAppointment(appointment: Appointment, onSuccess: () -> Unit, onFailure: (Exception) -> Unit) {
        appointmentCollection.add(appointment)
            .addOnSuccessListener { onSuccess() }
            .addOnFailureListener { e -> onFailure(e) }
    }

    fun getAppointments(onSuccess: (List<Appointment>) -> Unit, onFailure: (Exception) -> Unit) {
        appointmentCollection.get()
            .addOnSuccessListener { result ->
                val appointments = result.map { document -> document.toObject(Appointment::class.java) }
                onSuccess(appointments)
            }
            .addOnFailureListener { e -> onFailure(e) }
    }
}
