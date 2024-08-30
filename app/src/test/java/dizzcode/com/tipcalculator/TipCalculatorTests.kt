package dizzcode.com.tipcalculator

import org.junit.Test
import java.text.NumberFormat

import org.junit.Assert.assertEquals
/*
* common assertions that you might encounter are:
assertEquals()
assertNotEquals()
assertTrue()
assertFalse()
assertNull()
assertNotNull()
assertThat()
* */

class TipCalculatorTests {

    @Test
    fun calculateTip_20PercentNoRoundUp(){
        val amount = 10.0
        val tipPercent = 20.0
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent,  roundUp = false)

        assertEquals(expectedTip, actualTip)
    }
}
