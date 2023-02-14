package com.codingwithmitch.kmm_wms.kmm_learning_mitch.presentation.login_page

import com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network.model.login.get.LoginModel

data class LoginState(
    val isLoading:Boolean=false,
    val username:String="",
    val password:String="",
    val loginData: LoginModel?=null,
)