package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedListPage {
	private WebDriver webDriver;
	By getstarted = By.xpath("//h5[contains(text(),'Linked List')]/..//a");
	
	By introductionLink = By.linkText("Introduction"); 
	
	By creatingLinkedListLink  = By.linkText("Creating Linked LIst");
	By typesofLinkedListLink = By.linkText("Types of Linked List");
	By implLinkedListInPythonLink = By.linkText("Implement Linked List in Python");
	By traversalLink = By.linkText("Traversal");
	By insertionLink = By.linkText("Insertion");
	By deletionLink = By.linkText("Deletion");
	By practiceQLink = By.linkText("Practice Questions");
	
	
	
	
	By runButton = By.xpath("//*[@id='answer_form']/button");
	By editorInput =By.xpath("//textarea[@tabindex='0']");
	By answerform=By.xpath(" //*[@id='answer_form']");
	By submitButton=By.xpath("//*[@class='button']");



	public LinkedListPage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
	}

	public void getStarted() {
		webDriver.findElement(getstarted).click();
	}

	public void clickOnIntroduction() {
		webDriver.findElement(introductionLink).click();
	}
	

	public void clickOnImplLinkedListInPythonLink() {
		webDriver.findElement(implLinkedListInPythonLink).click();
	}
	public void clickOnInsertionLink() {
		webDriver.findElement(insertionLink).click();
	}
	public void clickOnTraversalLink() {
		webDriver.findElement(traversalLink).click();
	}
	public void clickOnTypesofLinkedListLink() {
		webDriver.findElement(typesofLinkedListLink).click();
	}
	public void clickOnDeletionLink() {
		webDriver.findElement(deletionLink).click();
	}
	public void clickOnCreatingLinkedListLink() {
		webDriver.findElement(creatingLinkedListLink).click();
	}

	public void clickOnPracticeQLink() {
		webDriver.findElement(practiceQLink).click();
	}


}