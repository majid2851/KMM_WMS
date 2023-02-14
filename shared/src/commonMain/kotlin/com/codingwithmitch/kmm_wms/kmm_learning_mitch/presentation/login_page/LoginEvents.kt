package com.codingwithmitch.kmm_wms.kmm_learning_mitch.presentation.login_page

sealed class LoginEvents
{

    data class OnUpdateUserName(val query:String):LoginEvents()
    data class OnUpdatePassword(val query: String):LoginEvents()
    data class LoginWithUserPass(val userName:String,val password:String):LoginEvents()


}