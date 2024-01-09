package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArrayPage {
	private WebDriver webDriver;
	By getstarted = By.xpath("//h5[contains(text(),'Array')]/..//a");
	By arraysinPython = By.linkText("Arrays in Python");
	By arraysusingList = By.linkText("Arrays Using List");
	// By arraysusingList = By.linkText("/html/body/div[2]/ul[2]/a");
	By basicoperation = By.linkText("Basic Operations in Lists");
	By applicationsofarray = By.linkText("Applications of Array");
	By tryhere = By.linkText("Try here>>>");
	By writeintexbox = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By runbutton = By.xpath("//button[contains(text(),'Run')]");
	By Output = By.id("output");
	By practiceQuestions = By.linkText("Practice Questions");
	By searchTheArray = By.linkText("Search the array");
	By SubmitBtn = By.xpath("//*[@type='submit']");
	By ErrorMessage = By.xpath("//pre[@id='output']");
	By maxConsecutiveOnes = By.linkText("Max Consecutive Ones");
	By EvnNumOfDigits = By.linkText("Find Numbers with Even Number of Digits");
	By SquaresOfSortedArray = By.linkText("Squares of a Sorted Array");
	By runButton = By.xpath("//*[@id='answer_form']/button");
	By editorInput =By.xpath("//textarea[@tabindex='0']");
	By answerform=By.xpath(" //*[@id='answer_form']");
	By submitButton=By.xpath("//*[@class='button']");



	public ArrayPage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
	}

	public void getStarted() {
		webDriver.findElement(getstarted).click();
	}

	public void ClickonArrayinPython() {
		webDriver.findElement(arraysinPython).click();
	}

	public void ClickonArrayusingList() throws InterruptedException {
		webDriver.findElement(arraysusingList).click();
	}

	public void ClickonBasicOperation() {
		webDriver.findElement(basicoperation).click();
	}

	public void ClickonApplication() {
		webDriver.findElement(applicationsofarray).click();
	}
	
     public void clickPracticeQuestions()
     {
    	 webDriver.findElement(practiceQuestions).click();
     }
     public void clicksearchTheArray()
     {
    	 webDriver.findElement( searchTheArray).click();
     }	
     public void clickmaxConsecutiveOnes()
     {
    	 webDriver.findElement( maxConsecutiveOnes).click();
     }	
     public void ClickFindNumberWithEvnNumOfDigits()
     {
    	 webDriver.findElement(EvnNumOfDigits).click();
     }	
     public void ClickSquaresOfSortedArray()
     {
    	 webDriver.findElement(SquaresOfSortedArray).click();
     }	

	public void Txtarea() throws InterruptedException {
		webDriver.findElement(writeintexbox).sendKeys("print 'hello'");
		System.out.println("enter here");

	}

	public void runButtton() {
		webDriver.findElement(runbutton).click();

	}
	public void checkOutput() throws InterruptedException {
		webDriver.findElement(Output);
		webDriver.navigate().back();
	}
	public void Geterrormessage() throws InterruptedException {

		webDriver.findElement(writeintexbox).sendKeys(Keys.ENTER);
		webDriver.findElement(writeintexbox).sendKeys("'hello'");
		webDriver.findElement(writeintexbox).sendKeys(Keys.ENTER);
		System.out.println("check this step");
	}

	public String getErrorText() {
		Alert alert = webDriver.switchTo().alert();
		String message = alert.getText();
		System.out.println(message);
		alert.accept();
		return message;
	}
	
	


}