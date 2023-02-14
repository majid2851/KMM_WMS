package com.codingwithmitch.kmm_wms.android.presentation.bank_card

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.rotationMatrix
import com.codingwithmitch.kmm_wms.android.R

@Preview
@Composable
fun BankCard()
{




    Row(modifier = Modifier
        .width(350.dp)
        .height(500.dp)
        .padding(40.dp)
        .background(color = Color.Blue, shape = RoundedCornerShape(15.dp))
        )
    {

    }
    Row(modifier = Modifier
        .width(700.dp)
        .height(600.dp))
    {
        Text(text = "6280231489122696", color = Color.White,
            fontSize = 30.sp,modifier= Modifier
                .vertical()
                .rotate(-90f)
                .padding(end = 40.dp, top = 70.dp,)
                .fillMaxWidth())
    }
//        Icon(painter = painterResource(id =R.drawable.mellat)
//            , contentDescription = "",modifier=Modifier
//                .width(30.dp)
//                .height(30.dp)
//                .background(
//                    color = Color.White,
//                    shape = CircleShape
//                ),)
}
fun Modifier.vertical() =
    layout { measurable, constraints ->
        val placeable = measurable.measure(constraints)
        layout(placeable.height, placeable.width) {
            placeable.place(
                x = -(placeable.width / 2 - placeable.height / 2),
                y = -(placeable.height / 2 - placeable.width / 2)
            )
        }
    }