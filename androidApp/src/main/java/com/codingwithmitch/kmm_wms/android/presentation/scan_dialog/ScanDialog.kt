package com.codingwithmitch.kmm_wms.android.presentation.scan_dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codingwithmitch.kmm_learning_mitch.android.presentation.navigation.Screen
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.android.presentation.scan_dialog.component.*

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


