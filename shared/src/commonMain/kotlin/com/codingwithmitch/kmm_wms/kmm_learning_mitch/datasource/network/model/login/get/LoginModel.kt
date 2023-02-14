package com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network.model.login.get

import kotlinx.serialization.SerialName


data class LoginModel(
    @SerialName("FullName")
    val fullName: String,
    @SerialName("Permissions")
    val permissions: Permissions,
    @SerialName("TokenID")
    val tokenID: String,
    @SerialName("UserName")
    val userName: String
)