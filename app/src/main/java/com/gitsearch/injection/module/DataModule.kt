package com.gitsearch.injection.module

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import java.util.concurrent.Executor
import java.util.concurrent.Executors

import javax.inject.Singleton

@Module
class DataModule {

    @Provides
    @Singleton
    fun executor(): Executor = Executors.newFixedThreadPool(5)

    @Provides
    @Singleton
    fun provideGson(): Gson = GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .disableHtmlEscaping()
            .setPrettyPrinting()
            .create()

}
