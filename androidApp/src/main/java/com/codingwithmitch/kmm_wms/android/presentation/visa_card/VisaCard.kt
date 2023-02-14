package com.codingwithmitch.kmm_wms.android.presentation.visa_card

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.codingwithmitch.kmm_wms.android.R

@Preview
@Composable
fun VisaCard()
{
    Card(elevation = 10.dp, modifier = Modifier
        .width(300.dp)
        .height(300.dp)
        .padding(30.dp)
        .shadow(5.dp, shape = RoundedCornerShape(10.dp),))
    {

        Column(modifier= Modifier
            .fillMaxWidth()
        )
        {
            Icon(
                painter = painterResource(id = R.drawable.mellat)
                , contentDescription = "",
                modifier = Modifier
                    .width(120.dp)
                    .height(180.dp)
                    .align(Alignment.CenterHorizontally),
                tint = Color.Red
            )


        }



        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().
        padding(top = 70.dp, bottom = 10.dp, start = 10.dp, end = 10.dp)
            .background(shape = RoundedCornerShape(10.dp)
                , color = colorResource(id = R.color.lightBlue),)
        )
        {



        }




    }







}