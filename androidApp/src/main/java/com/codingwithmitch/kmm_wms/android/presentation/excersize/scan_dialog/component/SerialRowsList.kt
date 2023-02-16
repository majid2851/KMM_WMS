package com.codingwithmitch.kmm_wms.android.presentation.excersize.scan_dialog.component

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun SerialRowsList()
{
    LazyColumn()
    {
        items(10)
        {
             SerialRow()
        }
    }
}