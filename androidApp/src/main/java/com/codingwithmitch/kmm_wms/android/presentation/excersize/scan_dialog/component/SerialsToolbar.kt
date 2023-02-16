package com.codingwithmitch.kmm_wms.android.presentation.excersize.scan_dialog.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun SerialsToolbar()
{
    Row(modifier= Modifier
        .fillMaxWidth()
        .height(30.dp)
        .background(color = Color.Blue,
            shape = RoundedCornerShape(topStart = 6.dp, topEnd = 6.dp),))
    {
        Text("Serials", Modifier.padding(6.dp),
            fontSize = 13.sp, color = Color.White)
    }

}