package com.codingwithmitch.kmm_wms.android.presentation.transfer_task

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.codingwithmitch.kmm_wms.kmm_learning_mitch.interactors.transfer_task.TransferTaskUsecase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TransferTaskViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val tranferTaskUsecase: TransferTaskUsecase
): ViewModel()
{



}