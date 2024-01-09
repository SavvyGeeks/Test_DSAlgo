package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataStructuresPage {

    private WebDriver webDriver;

    //By getstarted = By.xpath("/html/body/div[3]/div[1]/div/div/a");
    By getstarted = By.xpath("//h5[contains(text(),'Data Structures-Introduction')]/..//a");
    
    
    By timecomplex = By.linkText("Time Complexity");
   
    public DataStructuresPage(WebDriver webDriver) {
        super();
        this.webDriver = webDriver;
    }

    public void clickDataStructureGetStarted() {

        webDriver.findElement(getstarted).click();

    }

    public void Clicktime_complex() {

        webDriver.findElement(timecomplex).click();

    }

}