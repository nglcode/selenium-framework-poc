package com.nglcode.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PageBase {

    protected WebDriver webDriver;

    @Autowired
    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}
