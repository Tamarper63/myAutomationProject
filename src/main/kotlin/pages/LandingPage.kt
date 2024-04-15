package org.example.pages

import org.example.Driver.driver
import org.openqa.selenium.By
import org.openqa.selenium.WebElement

class LandingPage {

    val HOTEL_BUTTON_ELEMENT_ID = "ikfcax3"

    val hotelsButton: WebElement
        get() = driver.findElement(By.className(HOTEL_BUTTON_ELEMENT_ID))

}