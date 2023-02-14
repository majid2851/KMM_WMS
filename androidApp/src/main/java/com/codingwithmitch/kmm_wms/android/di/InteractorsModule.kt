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
import com.codingwithmitch.kmm_wms.kmm_learning_mitch.interactors.transfer_task.TransferTaskUsecase

@Module
@InstallIn(SingletonComponent::class)
object InteractorsModule
{

    @Singleton
    @Provides
    fun provideLoginUsecase(loginService: LoginService,): LoginUsecase
    {
        return LoginUsecase(loginService)
    }
    @Singleton
    @Provides
    fun provideTransferTask(): TransferTaskUsecase
    {
        return TransferTaskUsecase()
    }






}