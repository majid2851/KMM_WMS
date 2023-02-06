package com.codingwithmitch.kmm_learning_mitch.android.di

import com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network.LoginService
import com.codingwithmitch.kmm_wms.kmm_learning_mitch.interactors.login.LoginUsecase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.*
import javax.inject.Singleton
import com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network.KtorClientFactory
@Module
@InstallIn(SingletonComponent::class)
object InteractorsModule
{
    @Singleton
    @Provides
    fun provideHttpClient(): HttpClient
    {
        return KtorClientFactory().build()
    }

    @Singleton
    @Provides
    fun provideSearchRecipe(loginService: LoginService,): LoginUsecase
    {
        return LoginUsecase(loginService)
    }







}