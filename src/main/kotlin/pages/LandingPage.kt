package org.example.pages

import org.example.Driver.driver
import org.openqa.selenium.By
import org.openqa.selenium.WebElement

class LandingPage {

    val HOTEL_BUTTON_ELEMENT_ID = "ikfcax3"
    val TITLE_LANDING_PAGE_TITLE_XPATH = "//a[@href='/host/homes']"
    val LOCATION_FIELD_ID = "bigsearch-query-location-input"

    val hotelsButton: WebElement
        get() = driver.findElement(By.className(HOTEL_BUTTON_ELEMENT_ID))

    val titleLandingPage: WebElement
        get() = driver.findElement(By.xpath(TITLE_LANDING_PAGE_TITLE_XPATH))

    val locationFieldInput: WebElement
        get() = driver.findElement(By.id("bigsearch-query-location-input"))

    val dateStart: WebElement
        get() = driver.findElement(By.cssSelector("[data-testid='calendar-day-04/18/2024']"))

    val dateEnd: WebElement
        get() = driver.findElement(By.cssSelector("[data-testid='calendar-day-04/22/2024']"))

    val whoButton: WebElement
        get() = driver.findElement(By.cssSelector("#search-tabpanel > div > div.c111bvlt.atm_9s_1txwivl.atm_1eltean_1osqo2v.c1gh7ier.atm_am_1qhqiko.dir.dir-ltr"))

    val addAdult: WebElement
        get() = driver.findElement(By.cssSelector("button[data-testid='stepper-adults-increase-button']"))

    val clickOnSearch: WebElement
        get() = driver.findElement(By.cssSelector("button[data-testid='structured-search-input-search-button']"))

}



