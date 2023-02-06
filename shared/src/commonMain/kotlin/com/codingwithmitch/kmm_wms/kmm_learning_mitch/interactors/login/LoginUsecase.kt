package com.codingwithmitch.kmm_wms.kmm_learning_mitch.interactors.login

import com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network.LoginService
import com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network.model.LoginModel
import com.codingwithmitch.kmm_wms.kmm_learning_mitch.domain.util.DataState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class LoginUsecase(private val loginService: LoginService)
{
    fun excute(userName:String,password:String): Flow<DataState<LoginModel>>
    {
        return flow()
        {
            emit(DataState.isLoading())
            try
            {
                val loginData=loginService.login(userName,password)

                emit(DataState.data(message =null , data = loginData))
            }catch (e:Exception)
            {
                emit(DataState.error<LoginModel>(message = e.toString()))
            }
        }
    }
}