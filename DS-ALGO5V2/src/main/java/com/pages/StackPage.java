package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StackPage {

	private WebDriver driver;

	//By locators : Object Repository

	private By Stackele = By.xpath("(//a[@href='stack'])[1]");
	private By OperInStackLink = By.xpath("//a[normalize-space()='Operations in Stack']");
	private By ImplementEle = By.linkText("Implementation");
	private By AppliElem = By.linkText("Applications");
	private By PracQuesEle = By.linkText("Practice Questions");
	
	//private By codeMirror = By.xpath("//form[@id='answer_form']/div/div/div/textarea");

	//Constructor of the page class

	public StackPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void selectStack() {
		driver.findElement(Stackele).click();
	}

	public void clickOperationsLink() {
		driver.findElement(OperInStackLink).click();
	}
	
	public void clickImplementationLink() {
		driver.findElement(ImplementEle).click();
	}

	public void clickApplicationsLink() {
		driver.findElement(AppliElem).click();
	}

	public void clickPracticeQuesLink() {
		driver.findElement(PracQuesEle).click();
	}


}