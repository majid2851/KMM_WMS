package com.codingwithmitch.kmm_learning_mitch.android.di

import com.codingwithmitch.kmm_wms.android.presentation.login_page.LoginServiceImpl
import com.codingwithmitch.kmm_wms.android.presentation.login_page.LoginServiceImpl.Companion.BASE_URL
import com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network.LoginService
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network.KtorClientFactory
import dagger.Provides
import io.ktor.client.*
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule
{
    @Singleton
    @Provides
    fun provideHttpClient(): HttpClient
    {
        return KtorClientFactory().build()
    }

    @Singleton
    @Provides
    fun provideLoginService(httpClient: HttpClient): LoginService {
        return LoginServiceImpl(httpClient,BASE_URL)
    }


}