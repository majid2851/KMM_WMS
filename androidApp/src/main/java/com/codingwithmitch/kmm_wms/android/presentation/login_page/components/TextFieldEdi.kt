package com.codingwithmitch.kmm_wms.android.presentation.login_page.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.kmm_learning_mitch.presentation.login_page.LoginState

@Composable
fun TextFieldEdi(value:String,hint: String, type: KeyboardType, state: LoginState, onEdiChange: (String)->Unit)
{
    Surface(modifier = Modifier
        .padding(0.dp)
        .fillMaxWidth()
        .height(60.dp)
        .shadow(
            elevation = 3.dp,
            shape = RoundedCornerShape(6.dp)
        )
        .background(
            colorResource(id = R.color.cardview_light_background),
            shape = RectangleShape
        ))
    {

        OutlinedTextField(value = value,
            onValueChange = {onEdiChange(it)},
            label = { Text(hint) },
            keyboardOptions = KeyboardOptions(
                keyboardType = type,
                imeAction = ImeAction.Done
            ),
            colors = TextFieldDefaults.textFieldColors(backgroundColor =
            MaterialTheme.colors.surface),
            modifier= Modifier
                .fillMaxWidth()
                .fillMaxHeight())



    }
}