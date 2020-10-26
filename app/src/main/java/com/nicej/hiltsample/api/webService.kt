package com.nicej.hiltsample.api

import com.nicej.hiltsample.model.Post
import retrofit2.http.GET

interface webService {
    @GET("posts")
    suspend fun getPosts() : MutableList<Post>
}