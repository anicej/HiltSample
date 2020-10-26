package com.nicej.hiltsample.api

import javax.inject.Inject


class ApiRepo @Inject constructor(val apiService: webService, val emitter : RemoteErrorEmitter) {
    fun getPhoto(id : Int)  = apiCall(emitter){apiService.getPosts()}
}