package com.codingwithmitch.kmm_wms.android.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.android.presentation.login_page.components.TextFieldEdi

@Preview
@Composable
fun SearchBar()
{
    Surface(shape = RoundedCornerShape(6.dp),
        elevation = 5.dp, modifier = Modifier
            .height(50.dp)
            .background(
                color = colorResource(id = R.color.cardview_light_background),
                shape = RectangleShape
            ))
    {
        Row()
        {
            Icon(painter =
            painterResource(id = R.drawable.ic_baseline_search_24),
                contentDescription = "",
                tint = colorResource(id = R.color.blue)
                ,modifier= Modifier
                    .width(35.dp)
                    .height(50.dp)
            )
            TextField(value = "",
                onValueChange ={} ,
                label = { Text(text = "Search") },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Done
                ),
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color.Blue,
                    disabledTextColor = Color.Transparent,
                    backgroundColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                ),
                modifier= Modifier
                    .fillMaxWidth()
                    .fillMaxHeight())

        }


    }
}