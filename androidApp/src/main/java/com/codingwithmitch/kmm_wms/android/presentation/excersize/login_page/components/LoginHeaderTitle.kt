package com.codingwithmitch.kmm_wms.android.presentation.excersize.login_page.components

import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.codingwithmitch.kmm_wms.android.R

@Composable
fun LoginHeaderTitle()
{
    Text(text = stringResource(id = R.string.login),
        color = colorResource(id = R.color.blue),
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
        modifier = Modifier.
        wrapContentHeight(align = Alignment.CenterVertically),
    )
}