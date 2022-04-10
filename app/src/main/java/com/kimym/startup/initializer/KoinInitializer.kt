package com.kimym.startup.initializer

import android.content.Context
import androidx.startup.Initializer
import com.kimym.startup.R
import com.kimym.startup.di.repositoryModule
import com.kimym.startup.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class KoinInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        startKoin {
            androidContext(context)
            modules(repositoryModule)
            modules(viewModelModule)
            Timber.d(context.getString(R.string.initialized_koin))
        }
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return listOf(TimberInitializer::class.java)
    }
}
