package com.example.play
import retrofit2.Retrofit
    import retrofit2.converter.gson.GsonConverterFactory

    // Initialize Retrofit
    val retrofit = Retrofit.Builder()
        .baseUrl("https://still-2004.uc.r.appspot.com/")  // Replace with your API base URL
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    // Create an instance of your API service
    val apiService = retrofit.create(MusicAPI::class.java)