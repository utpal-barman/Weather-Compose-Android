package io.github.utpal_barman.weatherandroid.data.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetwotkModule {
    @Provides
    @Singleton
    fun provideRetrofit(@Named("baseUrl") baseUrl: String): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
           .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
}