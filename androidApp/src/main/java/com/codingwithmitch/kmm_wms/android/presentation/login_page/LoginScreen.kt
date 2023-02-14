package com.codingwithmitch.kmm_wms.android.presentation.login_page

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codingwithmitch.food2forkcompose.presentation.theme.AppTheme
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.android.presentation.login_page.components.ButtonLogin
import com.codingwithmitch.kmm_wms.android.presentation.login_page.components.LoginHeaderTitle
import com.codingwithmitch.kmm_wms.android.presentation.login_page.components.TextFieldEdi
import com.codingwithmitch.kmm_wms.kmm_learning_mitch.presentation.login_page.LoginEvents
import com.codingwithmitch.kmm_wms.kmm_learning_mitch.presentation.login_page.LoginState

@OptIn(ExperimentalComposeUiApi::class, ExperimentalMaterialApi::class)
@Composable
fun LoginScreen(state: LoginState,
                onTrigerEvent:(LoginEvents)->Unit
                ,)
{
    AppTheme()
    {
        Scaffold()
        {
            Column(modifier = Modifier.padding(dimensionResource(id = R.dimen.paddingAll)))
            {

                LoginHeaderTitle()
                HeaderLoginScreen()

                Spacer(modifier = Modifier.height(150.dp))

                TextFieldEdi(value = state.username, hint = "UserName",
                    KeyboardType.Text,
                    state=state,onEdiChange={
                        onTrigerEvent(LoginEvents.OnUpdateUserName(it))})

                Spacer(modifier = Modifier.height(10.dp))

                TextFieldEdi(value = state.password, hint = "Password",
                    KeyboardType.Password,
                    state = state,onEdiChange={
                        onTrigerEvent(LoginEvents.OnUpdatePassword(it))})

                Spacer(modifier = Modifier.height(10.dp))

                ButtonLogin(onLoginClick={
                    onTrigerEvent(LoginEvents.LoginWithUserPass(userName = state.username,
                        password = state.password))
                })

            }

        }



    }


}

