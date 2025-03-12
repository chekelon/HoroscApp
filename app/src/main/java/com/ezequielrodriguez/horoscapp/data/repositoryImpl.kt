package com.ezequielrodriguez.horoscapp.data

import android.util.Log
import com.ezequielrodriguez.horoscapp.data.network.HoroscopeApiService
import com.ezequielrodriguez.horoscapp.domain.Repository
import com.ezequielrodriguez.horoscapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService):Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure {
                Log.i("Failure","Ha ocurrido un error ${it.message}")


            }
        return null
    }
}