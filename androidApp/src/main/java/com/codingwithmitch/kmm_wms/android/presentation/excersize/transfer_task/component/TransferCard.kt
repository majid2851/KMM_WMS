package com.codingwithmitch.kmm_wms.android.presentation.excersize.transfer_task.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun TransferCard()
{
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(250.dp)
        .background(
            color = Color.White,
            shape = RoundedCornerShape(4.dp)
        ), elevation = 5.dp)
    {
        Row()
        {
            Column()
            {
                Column(modifier= Modifier
                    .height(200.dp)
                    .padding(start = 6.dp) )
                {
                    Text(text="A-01-01-01", color = Color.Blue,
                        fontSize = 20.sp,)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(text="47A9GD946", color = Color.Black,
                        fontSize = 20.sp,)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(text="GoodSet", color = Color.Black,
                        fontSize = 20.sp,)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(text="Gin", color = Color.Black,
                        fontSize = 20.sp,)
                }
                Spacer(modifier = Modifier.fillMaxHeight().weight(1.0F))

                Text(text = "5", modifier = Modifier
                    .align(alignment = Alignment.Start)
                    .width(60.dp)
                    .height(40.dp)
                    .background(
                        color = Color.Red,
                        shape = RoundedCornerShape(bottomStart = 4.dp)
                    ),
                    color= Color.White, fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                )
            }

            Spacer(modifier = Modifier
                .fillMaxWidth()
                .weight(1.0F))

            Column()
            {
                Column(modifier=Modifier.padding(end = 6.dp)
                    .height(200.dp))
                {
                    Text(text="A-01-01-02", color = Color.Green,
                        fontSize = 20.sp,)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(text="09195498265", color = Color.Black,
                        fontSize = 20.sp,)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(text="PA", color = Color.Blue,
                        fontSize = 20.sp,)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(text="PackDamaged", color = Color.Black,
                        fontSize = 20.sp,)

                }


                Spacer(modifier = Modifier.fillMaxHeight().weight(1.0F))

                Row(modifier = Modifier.align(alignment = Alignment.End))
                {
                    Text(text = "3", modifier = Modifier
                        .width(60.dp)
                        .height(38.dp)
                        .background(
                            color = Color.Blue,
                            shape = RoundedCornerShape(topStart = 4.dp)
                        ),
                        color= Color.White, fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                    )
                    Text(text = "2", modifier = Modifier
                        .width(60.dp)
                        .height(38.dp)
                        .background(
                            color = Color.Magenta,
                            shape = RoundedCornerShape(bottomEnd = 4.dp)
                        ),
                        color= Color.White, fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                    )

                }





            }


        }



    }





}