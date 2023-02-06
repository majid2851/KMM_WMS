package com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network.model

import kotlinx.serialization.SerialName

data class Permissions(
    @SerialName("InsertSerial")
    val insertSerial: Boolean,
    @SerialName("InventoryTypeModifyTask")
    val inventoryTypeModifyTask: Boolean,
    @SerialName("LocationInventory")
    val locationInventory: Boolean,
    @SerialName("LocationTransfer")
    val locationTransfer: Boolean,
    @SerialName("OfflineSerial")
    val offlineSerial: Boolean,
    @SerialName("PickPutReport")
    val pickPutReport: Boolean,
    @SerialName("Picking")
    val picking: Boolean,
    @SerialName("ProductWithoutMaster")
    val productWithoutMaster: Boolean,
    @SerialName("Putaway")
    val putaway: Boolean,
    @SerialName("Receiving")
    val receiving: Boolean,
    @SerialName("SerialReport")
    val serialReport: Boolean,
    @SerialName("Shipping")
    val shipping: Boolean,
    @SerialName("ShippingCancel")
    val shippingCancel: Boolean,
    @SerialName("TrackingSerial")
    val trackingSerial: Boolean,
    @SerialName("TransferTask")
    val transferTask: Boolean,
    @SerialName("WaitForLoading")
    val waitForLoading: Boolean
)