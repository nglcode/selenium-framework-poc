package com.nglcode.conf;

import com.nglcode.enums.Browser;
import com.nglcode.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.time.Duration;

@Configuration
@ComponentScan(basePackages = "com.nglcode")
@PropertySource("classpath:/application.properties")
public class DriverConfig {

    @Value("${driver.type}")
    private Browser driverType;

    @Value("${element.wait.timeout.seconds}")
    private int webDriverWaitTimeout;

    @Bean
    public WebDriver webDriver(){
        System.out.println("DriverType: " + driverType);
        return DriverFactory.get(driverType);
    }
    @Bean
    public WebDriverWait waitFor() {
        System.out.println("webDriverWaitTimeout: " + webDriverWaitTimeout);
        return new WebDriverWait(webDriver(), Duration.ofSeconds(webDriverWaitTimeout));
    }
}
