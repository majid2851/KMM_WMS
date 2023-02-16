package com.codingwithmitch.kmm_wms.android.presentation.excersize.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codingwithmitch.kmm_wms.android.R

@Preview
@Composable
fun AppToolbar(title:String="")
{
    Row(modifier = Modifier
        .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start)
    {
        Icon(painter = painterResource(id = R.drawable.ic_back)
            , contentDescription ="", tint = colorResource(id = R.color.blue),
        )

        Text(text = title, fontSize = 30.sp,
            color = colorResource(id = R.color.blue),
        )
        Spacer(modifier = Modifier.fillMaxWidth().weight(1f))

        Icon(painter = painterResource(id = R.drawable.ic_menu)
            , contentDescription ="", tint = colorResource(id = R.color.blue),
            modifier = Modifier.width(30.dp).height(25.dp)
        )
    }

}