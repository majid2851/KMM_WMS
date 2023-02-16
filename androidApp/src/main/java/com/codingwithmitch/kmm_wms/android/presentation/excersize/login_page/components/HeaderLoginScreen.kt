package com.codingwithmitch.kmm_wms.android.presentation.excersize.login_page

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.codingwithmitch.kmm_wms.android.R

@Composable
fun HeaderLoginScreen()
{
    Text(
        text = stringResource(R.string.MobilSystemDesc),
        modifier = Modifier
            .fillMaxWidth()
            .padding(dimensionResource(id = R.dimen.mobiSystemPadding))
            .wrapContentWidth(align = Alignment.Start),
        fontSize = 17.sp,
        color = Color.Black
    )
}