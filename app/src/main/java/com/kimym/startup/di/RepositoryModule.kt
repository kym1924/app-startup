package com.kimym.startup.di

import com.kimym.startup.repository.MainRepository
import org.koin.dsl.module

val repositoryModule = module {
    factory { MainRepository(get()) }
}
