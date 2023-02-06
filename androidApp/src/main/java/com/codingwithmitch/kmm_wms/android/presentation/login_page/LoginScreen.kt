package com.codingwithmitch.kmm_wms.android.presentation.login_page

import android.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codingwithmitch.food2forkcompose.presentation.theme.AppTheme
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.android.presentation.login_page.components.ButtonLogin
import com.codingwithmitch.kmm_wms.android.presentation.login_page.components.LoginHeaderTitle
import com.codingwithmitch.kmm_wms.android.presentation.login_page.components.TextFieldEdi


@Preview
@OptIn(ExperimentalComposeUiApi::class, ExperimentalMaterialApi::class)
@Composable
fun LoginScreen()
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

                TextFieldEdi(hint = "UserName", KeyboardType.Text)

                Spacer(modifier = Modifier.height(10.dp))

                TextFieldEdi(hint = "Password", KeyboardType.Text)

                Spacer(modifier = Modifier.height(10.dp))

                ButtonLogin()

            }

        }



    }


}

