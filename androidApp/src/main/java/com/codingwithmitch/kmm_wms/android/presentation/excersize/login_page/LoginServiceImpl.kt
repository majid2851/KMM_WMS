package com.codingwithmitch.kmm_wms.android.presentation.excersize.login_page

import com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network.LoginService
import com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network.model.login.get.LoginModel
import com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network.model.login.send.LoginBody
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*

class LoginServiceImpl(
    private val httpClient: HttpClient,
    private val baseUrl:String
):LoginService
{
    companion object{
        const val BASE_URL = "http://gi.bitfinity.ir/mobile/v1/"
    }
    override suspend fun login(userName: String , password: String): LoginModel
    {
        return httpClient.post<LoginModel>()
        {
            url("$baseUrl/login")
            contentType(ContentType.Application.Json)
            val loginBody=LoginBody(userName = userName, password = password)
            body=loginBody
        }
    }




}