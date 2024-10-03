package com.example.play

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface MusicAPI  {   @GET("/song/{id}")
suspend fun getSongUrl(@Path("id") songId: String): Response<SongUrlResponse>
}

data class SongUrlResponse(val url: String)