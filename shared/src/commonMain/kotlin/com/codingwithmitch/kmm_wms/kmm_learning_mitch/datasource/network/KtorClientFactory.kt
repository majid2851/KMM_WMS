package com.codingwithmitch.kmm_wms.kmm_learning_mitch.datasource.network

import io.ktor.client.*

expect class KtorClientFactory() {
    fun build(): HttpClient
}






