package com.example.tickets.model.network

import retrofit2.http.GET
import com.example.tickets.model.entity.Offer

interface ApiService {
    @GET("offerList")
    suspend fun getOffers(): List<Offer>
}