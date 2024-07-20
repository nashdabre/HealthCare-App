package com.example.healthcare.screens

import android.graphics.Bitmap
import com.example.healthcare.data.Chat


data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)