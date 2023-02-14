package com.codingwithmitch.kmm_wms.android.presentation.scan_dialog.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codingwithmitch.kmm_wms.android.R

@Preview
@Composable
fun SearchField()
{

    Row(modifier = Modifier
        .fillMaxWidth() ,
        verticalAlignment = Alignment.CenterVertically)
    {
        TextField(value = "asfasfasfasf",
            onValueChange ={} ,
            label = { null },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            textStyle = TextStyle.Default.copy(fontSize = 28.sp),
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.Blue,
                disabledTextColor = Color.Transparent,
                backgroundColor = colorResource(id = R.color.lightBlue),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
            ),
            modifier= Modifier
                .fillMaxWidth()

        )

        Spacer(modifier = Modifier
            .fillMaxWidth()
            .weight(1.0f))

        Icon(painter = painterResource(id = R.drawable.ic_baseline_search_24)
            , contentDescription ="",modifier = Modifier
                .width(25.dp)
                .height(25.dp))
    }
}