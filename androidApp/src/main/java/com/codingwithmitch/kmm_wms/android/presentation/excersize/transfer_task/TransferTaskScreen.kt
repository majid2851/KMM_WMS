package com.codingwithmitch.kmm_wms.android.presentation.excersize.transfer_task

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codingwithmitch.food2forkcompose.presentation.theme.AppTheme
import com.codingwithmitch.kmm_wms.android.presentation.excersize.components.AppToolbar
import com.codingwithmitch.kmm_wms.android.presentation.excersize.components.SearchBar
import com.codingwithmitch.kmm_wms.android.presentation.excersize.transfer_task.component.TransferCard

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