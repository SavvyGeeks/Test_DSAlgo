package com.pages;



import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qa.util.ExcelReader;

public class SignInPage {
    private WebDriver webDriver;

    By signIn = By.partialLinkText("Sign in");
    By signOut = By.partialLinkText("Sign out");

    By userName = By.xpath("//input[@name=\"username\"]");
    By password = By.xpath("//input[@name=\"password\"]");
    By loginBtn = By.xpath("//input[@value=\"Login\"]");

    By userLoginMessage = By.xpath("//div[@role=\"alert\"]");

    String userNameExcelValue;
    String passwordExcelValue;

    public SignInPage(WebDriver webDriver) {
        super();
        this.webDriver = webDriver;
    }

    public void clickSignIn() {
        webDriver.findElement(signIn).click();
    }
    
    

    public void sendUsername() throws IOException {
    	System.out.println("-----userNameExcelValue: "+userNameExcelValue);
        webDriver.findElement(userName).sendKeys(userNameExcelValue);
    }

    public void readDataFromSheet(String sheetName, Integer rowNumber) throws IOException {
        ExcelReader reader = new ExcelReader();
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/signInTestData.xlsx", sheetName);
        userNameExcelValue = testdata.get(rowNumber).get("userName");
        passwordExcelValue = testdata.get(rowNumber).get("password");
    }

    public void sendPassword() {
    	System.out.println("-----Password: "+passwordExcelValue);
        webDriver.findElement(password).sendKeys(passwordExcelValue);
    }

    public HomePage clickLoginBtn() {
        webDriver.findElement(loginBtn).click();
        return new HomePage(webDriver);

    }

    public void verifyInvalidUserErrorMessage() {
        String text = "Invalid Username and Password";
        String text1 = webDriver.findElement(userLoginMessage).getText();
        Assert.assertEquals(text, text1);
    }

    public void verifyValidUserLoginMessage() {
        String text = "You are logged in";
        String text1 = webDriver.findElement(userLoginMessage).getText();
        Assert.assertEquals(text, text1);
    }

    public void clickSignOut() {
        webDriver.findElement(signOut).click();
    }
  
}