package com.codingwithmitch.kmm_wms.android.presentation.login_page.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codingwithmitch.kmm_wms.android.R

@Composable
fun ButtonLogin()
{
    Button(onClick = {  }, modifier = Modifier
        .background(
            color = colorResource(id = R.color.blue),
            shape =  RoundedCornerShape(46.dp)
        )
        .fillMaxWidth()
        .height(60.dp) )
    {
        Text(text = "Login", modifier = Modifier
            ,color= colorResource(id = R.color.cardview_light_background)
            , fontSize = 23.sp, fontWeight = FontWeight.Bold
            ,textAlign = TextAlign.Center
        )
    }
}