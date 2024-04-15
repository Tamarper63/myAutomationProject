package org.example.blocks

import org.example.pages.LandingPage
import org.openqa.selenium.WebElement


class LandingPageBlock {

    val landingPage = LandingPage()

    fun clickOnElement(element: WebElement) {
        element.click()
    }

    fun clickOnWhere(){
        clickOnElement(landingPage.hotelsButton)
    }

    fun inputTextIntoField(element: WebElement, input: String) {
        element.sendKeys(input)
    }

    fun setDestination(){
        inputTextIntoField(landingPage.hotelsButton, "Amsterdam")
    }

}