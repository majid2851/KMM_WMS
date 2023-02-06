package com.codingwithmitch.kmm_wms.android.presentation.login_page

import com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network.LoginService
import com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network.model.LoginModel
import io.ktor.client.*
import io.ktor.client.request.*
import kotlin.collections.get

class LoginServiceImpl(
    private val httpClient: HttpClient,
    private val baseUrl:String
):LoginService
{
    companion object{
        const val TOKEN = "Token 9c8b06d329136da358c2d00e76946b0111ce2c48"
        const val BASE_URL = "http://gi.bitfinity.ir/mobile/v1/"
        const val RECIPE_PAGINATION_PAGE_SIZE=30
    }
    override suspend fun login(userName: String, password: String): LoginModel
    {
        return httpClient.get<LoginModel>()
        {
            url("$baseUrl/login")
            header("Authorization", TOKEN)
        }
    }




}