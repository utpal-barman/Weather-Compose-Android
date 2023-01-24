package io.github.utpal_barman.weatherandroid.presentation.module

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.github.utpal_barman.weatherandroid.App
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext context: Context): App = context as App

    @Singleton
    @Provides
    fun provideRandomString(): String = "This is the random string from app module"
}