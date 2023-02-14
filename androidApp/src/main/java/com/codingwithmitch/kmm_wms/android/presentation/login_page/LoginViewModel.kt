package com.codingwithmitch.kmm_wms.android.presentation.login_page

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network.model.login.get.LoginModel
import com.codingwithmitch.kmm_wms.kmm_learning_mitch.interactors.login.LoginUsecase
import com.codingwithmitch.kmm_wms.kmm_learning_mitch.presentation.login_page.LoginEvents
import com.codingwithmitch.kmm_wms.kmm_learning_mitch.presentation.login_page.LoginState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val savedStateHandle:SavedStateHandle,
    private val loginUsecase: LoginUsecase
):ViewModel()
{
    val state:MutableState<LoginState> = mutableStateOf(LoginState())


    fun trigerEvent(event:LoginEvents)
    {
        when(event)
        {
            is LoginEvents.OnUpdateUserName->
            {
                state.value=state.value.copy(username = event.query)
            }
            is LoginEvents.OnUpdatePassword->
            {
                state.value=state.value.copy(password = event.query)
            }
            is LoginEvents.LoginWithUserPass->
            {
                login()
            }

            else->
            {
//                appendToMessageQueue(
//                    GenericMessageInfo.Builder()
//                        .id("RecipeList.Error")
//                        .title("Error")
//                        .uiComponentType(UiComponentType.Dialog)
//                        .description("Invalid Event").build())
            }
        }



    }

    private fun login()
    {
        loginUsecase.excute(userName = state.value.username, password = state.value.password).onEach()
        {dataState ->
            state.value=state.value.copy(isLoading = dataState.isLoading)
            Log.i("mag2851-Login-loading",dataState.isLoading.toString())

            dataState.data?.let()
            {loginData->
                Log.i("mag2851-Login-data",dataState.data.toString())
                handleLoginResult(loginModel = loginData)
            }
            dataState.message?.let()
            {loginMsg->
                appendToMessageQueue(loginMsg)
            }




        }.launchIn(viewModelScope)



    }

    private fun appendToMessageQueue(message: String) {
        Log.i("mag2851-logMsg",message)
    }

    private fun handleLoginResult(loginModel: LoginModel) {
        state.value=state.value.copy(loginData = loginModel)
    }


}
