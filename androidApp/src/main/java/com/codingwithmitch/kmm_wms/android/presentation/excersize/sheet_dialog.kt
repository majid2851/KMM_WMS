package com.codingwithmitch.kmm_wms.android.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codingwithmitch.kmm_wms.android.R
import io.ktor.http.cio.websocket.*

@Preview
@Composable
fun SheetDialog()
{
    Column(modifier = Modifier
        .height(180.dp)
        .background(color = colorResource(id = R.color.lightBlue)))
    {
        Row(modifier= Modifier
            .height(50.dp)
            .background(color = Color.Blue),
            verticalAlignment = Alignment.CenterVertically,)
        {
            Spacer(modifier = Modifier.width(10.dp))
            Text("Confirm", fontSize = 16.sp,
                color = Color.White)
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .weight(1.0f))
            Icon(painter = painterResource(id = R.drawable.delete)
                , contentDescription ="", tint = Color.Red,
                modifier = Modifier
                    .width(20.dp)
                    .height(20.dp))
            Spacer(modifier = Modifier.width(10.dp))

        }
        Text("Are you sure to transfer [47LV35A-5B] from\n" +
                "[A-01-01-1] to [B-02-02-02] ?", color = Color.Black,
                fontSize = 16.sp,modifier=Modifier.padding(13.dp))
        Spacer(modifier = Modifier
            .fillMaxHeight()
            .weight(1.0f))

        Row(modifier=Modifier.align(Alignment.Start))
        {

            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "Cancel", modifier = Modifier.align(Alignment.CenterVertically)
                .width(70.dp)
                .height(30.dp), fontSize = 17.sp, color = Color.Black,
                textAlign = TextAlign.Center
                )
            Spacer(modifier = Modifier.width(10.dp))

            Text(text = "Confirm", modifier = Modifier.
            align(Alignment.CenterVertically)
                .width(90.dp)
                .height(34.dp)
                .background(
                    color = Color.Black,
                    shape = RoundedCornerShape(4.dp)
                ),
                fontSize = 17.sp, color = Color.White,
                textAlign = TextAlign.Center)

        }
        Spacer(modifier = Modifier.height(10.dp))





    }






}