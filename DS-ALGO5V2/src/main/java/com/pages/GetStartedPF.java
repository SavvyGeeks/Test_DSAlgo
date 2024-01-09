package com.pages;

import org.apache.logging.log4j.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetStartedPF {
    private WebDriver webDriver;

    By getstared = By.className("btn");

    By numpyNinjaTitle = By.className("navbar-brand");

    public GetStartedPF(WebDriver webDriver) {
        super();
        this.webDriver = webDriver;
    }

    public void clickGetstartedButton() {
        webDriver.findElement(getstared).click();
    }

    public void checkForNumpyNinjaTitle() {
        Assert.isNonEmpty(webDriver.findElement(numpyNinjaTitle));
    }
    
    
}