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
        landingBlock.verifyLandingPage(6000, 5, 60000)
        landingBlock.clickOnWhere()
        landingBlock.inputTextInLocationField("amsterdam")
        landingBlock.clickOnDateStart()
        landingBlock.clickOnDateEnd()
        landingBlock.clickOnWho()
        landingBlock.clickOnAddAdult()
        landingBlock.clickOnSearch()
        driver.quit()
    }
}