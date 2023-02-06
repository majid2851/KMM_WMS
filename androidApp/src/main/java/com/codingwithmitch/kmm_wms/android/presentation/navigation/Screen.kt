package com.codingwithmitch.kmm_learning_mitch.android.presentation.navigation

sealed class Screen(val route:String)
{
    object Login:Screen("login")



}