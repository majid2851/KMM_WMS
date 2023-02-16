package com.codingwithmitch.kmm_wms.android.presentation.excersize.scan_dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codingwithmitch.kmm_wms.android.presentation.excersize.scan_dialog.component.*

@Preview
@Composable
fun ScanDialog()
{

    Column(modifier = Modifier
        .padding(
            start = 8.dp, end = 8.dp,
            top = 4.dp, bottom = 4.dp
        )
        .fillMaxWidth()
        .height(500.dp)
        .background(color = Color.White).padding(10.dp))
    {
        ScanToolbar()

        ScanHeader()

        SerialsToolbar()

        SearchField()

        Divider()

        SerialRowsList()


    }

}


