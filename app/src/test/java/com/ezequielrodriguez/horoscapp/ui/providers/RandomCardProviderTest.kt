package com.ezequielrodriguez.horoscapp.ui.providers

import com.ezequielrodriguez.horoscapp.ui.model.LuckyModel
import org.junit.Assert.*
import org.junit.Test

class RandomCardProviderTest{
    
    @Test
    fun `getRandomCard should return a random card`(){
        val randomCard = RandomCardProvider()
        
        val card:LuckyModel? =randomCard.getLucky()

        assertNotNull(card)
    }
}