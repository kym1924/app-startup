package com.kimym.startup.initializer

import android.content.Context
import androidx.startup.Initializer
import com.kimym.startup.BuildConfig
import com.kimym.startup.R
import timber.log.Timber

class TimberInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
            Timber.d(context.getString(R.string.initialized_timber))
        }
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}
