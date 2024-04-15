package org.example

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.support.ui.WebDriverWait
import java.lang.reflect.Proxy
import java.time.Duration

object DriverConst {
    const val DRIVER_NAME = "chromedriver"
    const val DRIVER_PATH = "/Users/tamarperetz/Downloads/chromedriver_mac_arm64/chromedriver"
}


object Driver {
    val driver: WebDriver by lazy { setUp() }
    val wait = WebDriverWait(driver, Duration.ofSeconds(10))

    private fun setUp(): WebDriver {
        System.setProperty(DriverConst.DRIVER_NAME, DriverConst.DRIVER_PATH)
        val options = ChromeOptions()
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.9999.999 Safari/537.36")
        return ChromeDriver(options)
    }
}