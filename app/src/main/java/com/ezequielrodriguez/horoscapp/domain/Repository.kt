package com.ezequielrodriguez.horoscapp.domain

import com.ezequielrodriguez.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String): PredictionModel?
}