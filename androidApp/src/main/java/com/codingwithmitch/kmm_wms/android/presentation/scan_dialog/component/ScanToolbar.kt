package com.codingwithmitch.kmm_wms.android.presentation.scan_dialog.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codingwithmitch.kmm_wms.android.R

@Preview
@Composable
fun ScanToolbar()
{
    Row(modifier= Modifier
        .fillMaxWidth()
        .height(45.dp)
        .background(
            color = Color.Blue,
            shape = RoundedCornerShape(topEnd = 6.dp, topStart = 6.dp)
        )
        , verticalAlignment = Alignment.CenterVertically )
    {
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "Serial Scan", color = Color.White,
            fontSize = 18.sp,)
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .weight(1.0f))
        Icon(painter = painterResource(id = R.drawable.delete),
            contentDescription ="",modifier= Modifier
                .height(20.dp)
                .width(20.dp),
            tint = Color.White)

        Spacer(modifier = Modifier.width(8.dp))
    }
}