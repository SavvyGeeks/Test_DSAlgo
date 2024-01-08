package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ConfigReader1;

public class HomePage {
	
	  private WebDriver webDriver;

	String home=ConfigReader1.getHomePage();
	
	
	//webelements for modules
	//@FindBy(xpath = "//button[text()='Get Started']") WebElement getStarted;
	By getStarted=By.xpath("//button[text()='Get Started']");
	@FindBy (xpath="//a[@href='data-structures-introduction']")WebElement getstarted_DS;
	@FindBy (xpath="//a[@href='array']")WebElement getstarted_Array;
	@FindBy (xpath="//a[@href='linked-list']")WebElement getstarted_LL;
	@FindBy (xpath="//a[@href='stack']")WebElement getstarted_stack;
	@FindBy (xpath="//a[@href='queue']")WebElement getstarted_queue;
	@FindBy (xpath="//a[@href='tree']")WebElement getstarted_tree;
	@FindBy (xpath="//a[@href='graph']")WebElement getstarted_graph;
	
	//webelement for user not logged in alert msg
	@FindBy (xpath="//div[@class='alert alert-primary']")WebElement alertmsg;
	
	//webelements for dropdown
	@FindBy (xpath="//a[text()='Data Structures']")WebElement dropdown_DS;
	@FindBy (xpath="//a[text()='Arrays']")WebElement dropdown_array;
	@FindBy (xpath="//a[text()='Linked List']")WebElement dropdown_linkedlist;
	@FindBy (xpath="//a[text()='Stack']")WebElement dropdown_stack;
	@FindBy (xpath="//a[text()='Queue']")WebElement dropdown_queue;
	@FindBy (xpath="//a[text()='Tree']")WebElement dropdown_tree;
	@FindBy (xpath="//a[text()='Graph']")WebElement dropdown_graph;
	
	//Webelement for register
	@FindBy (xpath="//a[@href='/register']")WebElement register;
	@FindBy (xpath="//a[@href='/login']")WebElement login;
	
	
	

	 public HomePage(WebDriver webDriver) {
	        super();
	        this.webDriver = webDriver;
	        PageFactory.initElements(webDriver, this);
	    }



	public void getStarted() {

		webDriver.findElement(getStarted).click();

	}

	public String getPageTitle() {
		

	String title = webDriver.getTitle();
		return title;
	}
	
	public void dsalgopage() {

		webDriver.get("");

	}
	
	public void homePg() {
		webDriver.get(home);
	}

	public void getStartedForModule(String string) {
		switch(string){
		case "Datastructures":
			getstarted_DS.click();
			break;
		case "Arrays":
			
			getstarted_Array.click();
			break;
		case "Linkedlist":
			
			getstarted_LL.click();
			break;
		case "Stack":
			
			getstarted_stack.click();
			break;
		case "Queue":
			
			getstarted_queue.click();
			break;
		case "Tree":
			
			getstarted_tree.click();
			break;
		case "Graph":
			
			getstarted_graph.click();
			break;
		}
		}
	
	public String alertmsg() {
		String msg=alertmsg.getText();
		return msg;
	}
	
	
	//dropdown options
	public void dropdown(String string) {

		dropdown_DS.click();
		switch (string) {
		case "Arrays":
			
			dropdown_array.click();
			break;
		case "Linkedlist":
			
			dropdown_linkedlist.click();
			break;
		case "Stack":
			
			dropdown_stack.click();
			break;
		case "Queue":
			
			dropdown_queue.click();
			break;
		case "Tree":
			
			dropdown_tree.click();
			break;
		case "Graph":
			
			dropdown_graph.click();
			break;
		}

	}
	
	//register page
	public void click_register() {
		register.click();
	}
	
	public String reg_url() {
		String regurl=webDriver.getCurrentUrl();
		return regurl;
		
	}
	//login page
	public void click_login() {
		login.click();
	}
	
	public String login_url() {
		String loginurl=webDriver.getCurrentUrl();
		return loginurl;
		
	}
	
}