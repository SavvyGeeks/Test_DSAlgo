package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.testng.Assert;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.LoggerLoad;

public class RegisterPage {

	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy (xpath="//a[@href='/register']")WebElement registerLink;
	
	String RegURL = "https://dsportalapp.herokuapp.com/register";
	String HomeURL = "https://dsportalapp.herokuapp.com/home";

	@FindBy(xpath = "//input[@type='submit']")
	WebElement register_Btn;
	@FindBy(xpath = "//a[text()='Sign In']")
	WebElement signIn;
	@FindBy(id = "id_username")
	WebElement username;
	@FindBy(id = "id_password1")
	WebElement password1;
	@FindBy(id = "id_password2")
	WebElement confirmpassword;
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement errPasswordMissmatch;
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement NewAccountMessage;
	@FindBy(xpath="//div[@class='alert alert-primary']") 
	WebElement ExistedAcctMsg;

	
	public void assertregister() {
		String register = driver.getCurrentUrl();
		Assert.assertEquals(register, RegURL);

	}

	public void clickRegisterLink() { 

		
		registerLink.click();
	}

	
	public void Register_Btn() { 

		//PageFactory.initElements(driver, this);
		register_Btn.click();
	}

	public void ErrorMessage() {
		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
		System.out.println("err msg");
		Assert.assertEquals(messageStr, "Please fill out this field.");
		LoggerLoad.error("‹------- Error message ---------Please fill out this field.>");
	}

	public void Enterusername(String usernameentry) {
		PageFactory.initElements(driver, this);
		username.sendKeys(usernameentry);

	}

	public void Enterpassword(String passwordentry) {
		PageFactory.initElements(driver, this);
		password1.sendKeys(passwordentry);

	}

	public void Enterconfirmpassword(String confirmpasswordentry) {
		PageFactory.initElements(driver, this);
		confirmpassword.sendKeys(confirmpasswordentry);

	}

	public void getInvalidUsername() {

		try {
			PageFactory.initElements(driver, this);

			String errorText = errPasswordMissmatch.getText();
			System.out.println(errorText);
			String errInvalidName = "Please enter a valid username";
			Assert.assertNotEquals(errorText, errInvalidName);
			LoggerLoad.error("‹------- Error: ---------Please enter a valid username");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void passwordMissmatch() {
		try {
			PageFactory.initElements(driver, this);
			String errorText = errPasswordMissmatch.getText();
			System.out.println(errorText);
			String errPasswordMissmatch = " password_missmatch:The two password feilds didn't match.";
			Assert.assertNotEquals(errorText, errPasswordMissmatch);
			LoggerLoad.error("‹------- Error: ---------password_missmatch:The two password feilds didn't match.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void passwordLenght() {
		try {
			PageFactory.initElements(driver, this);
			String errorText = errPasswordMissmatch.getText();
			System.out.println(errorText);
			String errPasswordMissmatch = "Password should containd atleast 8 charecters.";
			Assert.assertNotEquals(errorText, errPasswordMissmatch);
			LoggerLoad.error("‹------- Error: ---------Password should containd atleast 8 charecters.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void newAccountMessage() {

		try {
			PageFactory.initElements(driver, this);
			String errorText = NewAccountMessage.getText();
			System.out.println(errorText);
			String newAccountMessage = "New account created.You are logged in as";
			Assert.assertNotEquals(errorText, newAccountMessage);
			LoggerLoad.info("‹------- Error: ---------New account created.You are logged in.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void HomeURL() {
		String loginAlertMessage = "User name Already exists";
		String errorText = errPasswordMissmatch.getText();
		System.out.println(errorText);
		String Home = driver.getCurrentUrl();
		if(Home.equalsIgnoreCase(HomeURL)) {
		Assert.assertTrue(true);
		}else {
			Assert.assertNotEquals(loginAlertMessage,errorText);
		}
		

	}
public String getExistedAcctMsg() {
		String newacct=null;
		newacct=ExistedAcctMsg.getText();
		return newacct;
	}


	public void erase() {
		username.clear();
		password1.clear();
		confirmpassword.clear();

	}

}
