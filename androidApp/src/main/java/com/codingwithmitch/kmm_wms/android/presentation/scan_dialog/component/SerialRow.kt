package com.codingwithmitch.kmm_wms.android.presentation.scan_dialog.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
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
fun SerialRow()
{
    Column()
    {
        Row(modifier= Modifier
            .fillMaxWidth()
            .height(35.dp)
            , verticalAlignment = Alignment.CenterVertically)
        {
            Spacer(modifier = Modifier
                .width(10.dp) )

            Text(text = "asdlkjeirwl", fontSize = 12.sp,)

            Spacer(modifier = Modifier
                .fillMaxWidth()
                .weight(1.0f))

            Icon(painter = painterResource(id = R.drawable.word)
                , contentDescription ="",
            modifier=Modifier.width(20.dp).height(20.dp), tint = Color.Green)

            Spacer(modifier = Modifier
                .width(10.dp) )

            Icon(painter = painterResource(id = R.drawable.delete)
                , contentDescription ="",
                modifier=Modifier.width(20.dp).height(20.dp),
            tint = Color.Red)

            Spacer(modifier = Modifier
                .width(10.dp) )

        }
        Divider()
    }




}