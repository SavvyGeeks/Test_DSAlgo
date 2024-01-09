package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.util.LoggerLoad;

public class SignOutPage{
    @FindBy(xpath = "//a[text()='NumpyNinja']")
    WebElement HomePgChk;
    @FindBy(xpath = "//a[@href='/logout']")
    WebElement SignoutBtn;
    @FindBy(xpath = "//div[@role='alert']")
    WebElement SignoutMsg;
     WebDriver webDriver;

    boolean status;
    
    
    public SignOutPage(WebDriver webDriver) {
        super();
        this.webDriver = webDriver;
    }
    
    
    public void HomePgDisp()
    {
    
       
        try {
            status = HomePgChk.isDisplayed();
            Assert.assertTrue(status);
            LoggerLoad.info("Assert True in logout block");

        } catch (AssertionError e) {
            LoggerLoad.error("Assert false in logout block");
            System.out.println(e.getMessage());
        }

    }
    public void SignoutClick() throws InterruptedException {
        PageFactory.initElements(webDriver,this);
        //Thread.sleep(500);
        SignoutBtn.click();

    }
    public void CheckSignoutMsg()

    {

        try {
            status = SignoutMsg.isDisplayed();
            Assert.assertTrue(status);
            LoggerLoad.info("Assert True in logout block");

        } catch (AssertionError e) {
            LoggerLoad.error("Assert false in logout block");
            System.out.println(e.getMessage());
        }

    }
}