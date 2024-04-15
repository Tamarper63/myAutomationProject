package org.example.blocks

import org.example.Driver
import org.example.pages.LandingPage
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement
import java.util.concurrent.TimeUnit


class LandingPageBlock {

    val landingPage = LandingPage()

    fun clickOnElement(element: WebElement) {
        element.click()
    }

    fun clickOnWhere() {
        clickOnElement(landingPage.hotelsButton)
    }

    fun inputTextInLocationField(input: String) {
        landingPage.locationFieldInput.sendKeys(input)
        landingPage.locationFieldInput.sendKeys(Keys.ENTER)
    }


    //        val inputField = driver.findElement(By.id("bigsearch-query-location-input"))
//        inputField.sendKeys("amsterdam")
//        inputField.sendKeys(Keys.ENTER)




    fun verifyLandingPage(
        intervalMillis: Long,
        maxTries: Int,
        totalTimeMillis: Long
    ): WebElement? {
        val startTime = System.currentTimeMillis()
        var elapsedTime = 0L
        var tries = 0
        var element: WebElement? = null

        while (element == null && tries < maxTries && elapsedTime < totalTimeMillis) {
            try {
                element = LandingPage().titleLandingPage
            } catch (e: Exception) {
                TimeUnit.MILLISECONDS.sleep(intervalMillis)
                elapsedTime = System.currentTimeMillis() - startTime
                tries++
            }
        }
        return element
    }
}