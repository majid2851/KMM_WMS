package com.codingwithmitch.kmm_learning_mitch.android.di

import com.codingwithmitch.kmm_wms.android.presentation.login_page.LoginServiceImpl
import com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network.LoginService
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network.KtorClientFactory

class NetworkModule
{
    val loginService:LoginService by lazy {
        LoginServiceImpl(
            httpClient = KtorClientFactory().build(),
            baseUrl = LoginServiceImpl.BASE_URL
        )
    }


}