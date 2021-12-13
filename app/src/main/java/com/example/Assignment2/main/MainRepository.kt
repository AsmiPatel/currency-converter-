package com.example.Assignment2.main;

import com.example.Assignment2.data.models.CurrencyResponse
import com.example.Assignment2.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}