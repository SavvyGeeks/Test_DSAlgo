package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QueuePage{

	//WebDriver driver;

	//@FindBy(xpath="//button[text()='Get Started']") WebElement GetStarted;

	@FindBy (xpath="//a[@href='queue']")WebElement getstarted_queue;
	By getstarted = By.xpath("//h5[contains(text(),'Queue')]/..//a");

	//@FindBy(xpath="//h4[contains(text(),'Queue')]") WebElement tl_queue;

	//@FindBy(linkText="Implementation of Queue in Python") WebElement lnk_Implementation_of_queue_in_Python;
	By lnk_Implementation_of_queue_in_Python= By.linkText("Implementation of Queue in Python");
	@FindBy(xpath="//p[text()='Implementation of Queue in Python']") WebElement tl_qinpython;

	//@FindBy(linkText="Implementation using collections.deque") WebElement lnk_Implementation_using_collections_deque;

	By  lnk_Implementation_using_collections_deque = By.linkText("Implementation using collections.deque");
	//@FindBy(xpath="//p[text()='Implementation using collections.deque']") WebElement tl_queueindeque;
	By tl_queueindeque = By.xpath("//p[text()='Implementation using collections.deque']");


	//@FindBy(linkText="Implementation using array") WebElement lnk_Implementation_using_array;
	By lnk_Implementation_using_array = By.linkText("Implementation using array");
	@FindBy(xpath="//p[text()='Implementation using array']") WebElement tl_qImplementationarray;


	//@FindBy(linkText="Queue Operations") WebElement lnk_Queue_Operations;
	By lnk_Queue_Operations = By.linkText("Queue Operations");
	@FindBy(xpath="//p[text()='Queue Operations']") WebElement tl_qoperations;


	//@FindBy(linkText="Practice Questions") WebElement lnk_Practice_Questions1;
	By lnk_Practice_Questions = By.linkText("Practice Questions");

	//@FindBy(xpath="//body/div[1]/nav[1]") WebElement tl_qpracQ;

	@FindBy(linkText=" //a[contains(text(),'NumpyNinja')]") WebElement tl_NumpyNinja;

	@FindBy(linkText="Try here>>>") WebElement btn_Try_here;
	//	
	//	@FindBy(xpath= "//div[@class='CodeMirror-scroll']") WebElement txt_OIS_Editor;
	//	
	//	@FindBy(xpath=" //button[contains(text(),'Run')]")  WebElement btn_Run;



	private WebDriver webDriver;

	public QueuePage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
	}

	public void clickGetStarted() {

		webDriver.findElement(getstarted).click();

	}


	public void clickImplementationofQueueinPython() {
		webDriver.findElement(lnk_Implementation_of_queue_in_Python).click();
	}
	public String queueinpyTitle() {

		return  tl_qinpython.getText();
	}


	public void clickImplementationusingcollectionsdeque() {
		webDriver.findElement(lnk_Implementation_using_collections_deque).click();
	}



	public void clickImplementationusingarray() {
		webDriver.findElement(lnk_Implementation_using_array).click();
	}
	public String QarrayTitle() {

		return tl_qImplementationarray.getText();
	}


	public void clickQueueOperations() {

		webDriver.findElement(lnk_Queue_Operations).click();

	}	
	public String QoperTitle() {

		return tl_qoperations.getText();
	}

	//	public String queuehomeTitle() {
	//
	//		return ((WebDriver) tl_queue).getTitle();
	//	}

	public void clickpracticeQuestions1() {
		//lnk_Practice_Questions1	.click();
		webDriver.findElement(lnk_Practice_Questions).click();

		webDriver.navigate().back();


	}


}
