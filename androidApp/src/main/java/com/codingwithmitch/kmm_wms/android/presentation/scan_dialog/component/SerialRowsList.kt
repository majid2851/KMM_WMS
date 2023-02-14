package com.codingwithmitch.kmm_wms.android.presentation.scan_dialog.component

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codingwithmitch.kmm_wms.android.presentation.transfer_task.component.TransferCard

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