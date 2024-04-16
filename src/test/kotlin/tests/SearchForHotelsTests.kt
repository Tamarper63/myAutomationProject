package tests

import org.example.Driver.driver
import org.example.blocks.LandingPageBlock
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import tests.SearchForHotelsTestsConst.URL
import kotlin.test.Test

object SearchForHotelsTestsConst {

    const val URL = "https://www.airbnb.com"
}

class SearchForHotelsTests() {
    val landingBlock = LandingPageBlock()

    @Test
    fun searchForVacation() {
        driver.get(URL)
        driver.manage().deleteAllCookies()
        landingBlock.verifyLandingPage(6000, 5,60000)
        landingBlock.clickOnWhere()
        landingBlock.inputTextInLocationField("amsterdam")
        landingBlock.clickOnDateStart()
        val element2: WebElement = driver.findElement(By.cssSelector("[data-testid='calendar-day-04/22/2024']"))
        element2.click()
        val element4: WebElement = driver.findElement(By.cssSelector("#search-tabpanel > div > div.c111bvlt.atm_9s_1txwivl.atm_1eltean_1osqo2v.c1gh7ier.atm_am_1qhqiko.dir.dir-ltr"))
        element4.click()
        val button: WebElement = driver.findElement(By.cssSelector("button[data-testid='stepper-adults-increase-button']"))
        button.click()
        val searchButton: WebElement = driver.findElement(By.cssSelector("button[data-testid='structured-search-input-search-button']"))
        searchButton.click()
        driver.quit()
    }
}