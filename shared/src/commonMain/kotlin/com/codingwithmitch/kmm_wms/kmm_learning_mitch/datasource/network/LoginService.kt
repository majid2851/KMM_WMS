package com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network

import com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network.model.LoginModel

interface LoginService
{
    suspend fun login(
        username:String,
        password:String
    ):LoginModel






}