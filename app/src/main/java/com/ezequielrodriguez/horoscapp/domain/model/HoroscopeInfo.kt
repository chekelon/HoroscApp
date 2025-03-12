package com.ezequielrodriguez.horoscapp.domain.model


import com.ezequielrodriguez.horoscapp.R

sealed class HoroscopeInfo(val img:Int, val name:Int,horoscopeModel: HoroscopeModel) {
    data object Aries:HoroscopeInfo(R.drawable.aries, R.string.aries, HoroscopeModel.Aries)
    data object Taurus: HoroscopeInfo(R.drawable.tauro, R.string.taurus,HoroscopeModel.Taurus)
    data object Gemini: HoroscopeInfo(R.drawable.geminis, R.string.gemini,HoroscopeModel.Gemini)
    data object Cancer: HoroscopeInfo(R.drawable.cancer, R.string.cancer,HoroscopeModel.Cancer)
    data object Leo: HoroscopeInfo(R.drawable.leo, R.string.leo,HoroscopeModel.Leo)
    data object Virgo: HoroscopeInfo(R.drawable.virgo, R.string.virgo,HoroscopeModel.Virgo)
    data object Libra: HoroscopeInfo(R.drawable.libra, R.string.libra,HoroscopeModel.Libra)
    data object Scorpio: HoroscopeInfo(R.drawable.escorpio, R.string.scorpio,HoroscopeModel.Scorpio)
    data object Sagittarius: HoroscopeInfo(R.drawable.sagitario, R.string.sagittarius,HoroscopeModel.Sagittarius)
    data object Capricorn: HoroscopeInfo(R.drawable.capricornio, R.string.capricorn,HoroscopeModel.Capricorn)
    data object Aquarius: HoroscopeInfo(R.drawable.aquario, R.string.aquarius,HoroscopeModel.Aquarius)
    data object Pisces: HoroscopeInfo(R.drawable.piscis, R.string.pisces,HoroscopeModel.Pisces)
}