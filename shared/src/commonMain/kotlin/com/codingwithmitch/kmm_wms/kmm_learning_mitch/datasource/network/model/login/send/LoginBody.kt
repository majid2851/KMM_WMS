package com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network.model.login.send

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LoginBody(
    @SerialName("Password")
    val password: String,
    @SerialName("UserName")
    val userName: String
)