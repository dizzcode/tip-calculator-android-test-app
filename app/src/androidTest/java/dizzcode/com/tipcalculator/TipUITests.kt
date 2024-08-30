package dizzcode.com.tipcalculator

import androidx.compose.ui.test.junit4.createComposeRule
import dizzcode.com.tipcalculator.ui.theme.TipCalculatorTheme
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat
import java.util.Locale

class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip() {
        composeTestRule.setContent {
            TipCalculatorTheme {
                TipCalculatorLayout()
            }
        }

        composeTestRule.onNodeWithText("Bill Amount")
            .performTextInput("10")

        composeTestRule.onNodeWithText("Tip Percentage")
            .performTextInput("20")

        val expectedTip = NumberFormat.getCurrencyInstance(Locale.US).format(2)

        composeTestRule.onNodeWithText("Tip Amount: $expectedTip")
            .assertExists(
                "No node with this text was found."
            )
    }
}
