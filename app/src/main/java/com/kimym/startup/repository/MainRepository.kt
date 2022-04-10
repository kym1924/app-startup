package com.kimym.startup.repository

import android.content.Context
import com.kimym.startup.R

class MainRepository(private val context: Context) {
    fun getStartUpMessage(): String {
        return context.getString(R.string.startup)
    }
}
