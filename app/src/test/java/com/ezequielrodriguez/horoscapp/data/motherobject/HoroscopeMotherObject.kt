package com.ezequielrodriguez.horoscapp.data.motherobject

import com.ezequielrodriguez.horoscapp.data.network.response.PredictionResponse
import com.ezequielrodriguez.horoscapp.domain.model.HoroscopeInfo
import com.ezequielrodriguez.horoscapp.domain.model.HoroscopeInfo.Aquarius
import com.ezequielrodriguez.horoscapp.domain.model.HoroscopeInfo.Aries
import com.ezequielrodriguez.horoscapp.domain.model.HoroscopeInfo.Cancer
import com.ezequielrodriguez.horoscapp.domain.model.HoroscopeInfo.Capricorn
import com.ezequielrodriguez.horoscapp.domain.model.HoroscopeInfo.Gemini
import com.ezequielrodriguez.horoscapp.domain.model.HoroscopeInfo.Leo
import com.ezequielrodriguez.horoscapp.domain.model.HoroscopeInfo.Libra
import com.ezequielrodriguez.horoscapp.domain.model.HoroscopeInfo.Pisces
import com.ezequielrodriguez.horoscapp.domain.model.HoroscopeInfo.Sagittarius
import com.ezequielrodriguez.horoscapp.domain.model.HoroscopeInfo.Scorpio
import com.ezequielrodriguez.horoscapp.domain.model.HoroscopeInfo.Taurus
import com.ezequielrodriguez.horoscapp.domain.model.HoroscopeInfo.Virgo

object HoroscopeMotherObject {

    val anyResponse = PredictionResponse("date","prediction","taurus")

    val horoscopeInfoList: List<HoroscopeInfo> = listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces,
        )
}