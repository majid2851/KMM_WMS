package com.codingwithmitch.kmm_wms.android.presentation.transfer_task

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codingwithmitch.food2forkcompose.presentation.theme.AppTheme
import com.codingwithmitch.kmm_wms.android.R
import com.codingwithmitch.kmm_wms.android.presentation.components.AppToolbar
import com.codingwithmitch.kmm_wms.android.presentation.components.SearchBar
import com.codingwithmitch.kmm_wms.android.presentation.transfer_task.component.TransferCard

@OptIn(ExperimentalComposeUiApi::class, ExperimentalMaterialApi::class)
@Preview
@Composable
fun TransferTaskScreen()
{
    AppTheme()
    {
        Column()
        {
            AppToolbar(title = "TransferTask")
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(10.dp))
            SearchBar()
            Spacer(modifier = Modifier.height(10.dp))

            LazyColumn()
            {
                items(50)
                {
                    TransferCard()
                    Spacer(modifier = Modifier.height(10.dp))
                }
            }


        }



    }




}