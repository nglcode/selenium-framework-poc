package com.nglcode.utils;


import com.nglcode.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

    private static String pathFormat = "src/test/resources/drivers/%s";
    public static WebDriver get(Browser browser) {

        if(Browser.chrome == browser) {
            System.setProperty("webdriver.chrome.driver", String.format(pathFormat, "chromedriver.exe"));
            return new ChromeDriver();
        }

        if (Browser.firefox == browser) {
            System.setProperty("webdriver.gecko.driver", String.format(pathFormat, "geckodriver.exe"));
            return new FirefoxDriver();
        }

        if (Browser.ie == browser) {
            System.setProperty("webdriver.chrome.driver", String.format(pathFormat, "IEDriverServer.exe"));
            return new InternetExplorerDriver();
        }

        throw new IllegalArgumentException("Driver not found for browser " + browser);
    }
}
