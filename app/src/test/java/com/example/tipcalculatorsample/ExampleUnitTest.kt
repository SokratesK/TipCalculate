package com.example.tipcalculatorsample

import android.icu.text.NumberFormat
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun calculateTip_20PercentNoRoundUp() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = "$2.00"
        val actualTip = calculateTip(amount,tipPercent,false)
        assertEquals(expectedTip,actualTip)
    }

    @Test
    fun calculateTip_25PercentRoundUp(){
        val amount = 10.00
        val tipPercent = 25.00
        val expectedTip = "$3.00"
        val actualTip = calculateTip(amount,tipPercent,true)
        assertEquals(actualTip,expectedTip)
    }
}