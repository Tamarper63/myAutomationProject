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

    fun clickOnDateStart() {
        clickOnElement(landingPage.dateStart)
    }

    fun clickOnDateEnd() {
        clickOnElement(landingPage.dateEnd)
    }

    fun clickOnWho() {
        clickOnElement(landingPage.whoButton)
    }

    fun clickOnSearch() {
        clickOnElement(landingPage.clickOnSearch)
    }

    fun clickOnMenu() {
        clickOnElement(landingPage.clickOnMenu)
    }

    fun clickOnLogIn() {
        clickOnElement(landingPage.clickOnLogIn)
    }

    fun clickOnAddAdult() {
        clickOnElement(landingPage.addAdult)
    }

    fun inputTextInLocationField(locationInput: String ) {
        val searchElement = landingPage.locationFieldInput
        searchElement.sendKeys(locationInput)
        searchElement.sendKeys(Keys.ENTER)
    }

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