package com.codingwithmitch.kmm_wms.android.presentation.excersize.scan_dialog.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ScanHeader()
{
    Column(modifier= Modifier.padding(8.dp))
    {
        Text(text = "Panel-HT723")
        Text(text = "41829")
        Text(text = "GoodSet")

        OutlinedTextField(value = "", onValueChange = {},
            modifier= Modifier
                .fillMaxWidth().align(Alignment.Start)
            ,shape = RoundedCornerShape(4.dp),
            label = { Text("Serial...") })
    }
}