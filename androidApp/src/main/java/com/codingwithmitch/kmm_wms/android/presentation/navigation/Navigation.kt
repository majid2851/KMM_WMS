package com.codingwithmitch.kmm_learning_mitch.android.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.HiltViewModelFactory
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.codingwithmitch.kmm_wms.android.presentation.login_page.LoginScreen
import com.codingwithmitch.kmm_wms.android.presentation.login_page.LoginViewModel

@Preview
@Composable
fun Navigation()
{
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Login.route)
    {
        composable(route = Screen.Login.route)
        {
            val factory= HiltViewModelFactory(LocalContext.current, navBackStackEntry = it)
            val myViewModel: LoginViewModel = viewModel(key = "LoginViewModel",factory)

            LoginScreen()
        }







    }


}