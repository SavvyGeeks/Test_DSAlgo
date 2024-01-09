package com.pages;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
import org.testng.Assert;

import com.qa.util.ExcelReader;

public class TryHerePage {
	
	By tryhere = By.linkText("Try here>>>");
	By writeintexbox = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By runbutton = By.xpath("//button[contains(text(),'Run')]");
	By Output = By.id("output");
	
	By runButton = By.xpath("//*[@id='answer_form']/button");
	By editorInput =By.xpath("//textarea[@tabindex='0']");
	By answerform=By.xpath(" //*[@id='answer_form']");
	By submitButton=By.xpath("//*[@class='button']");
	private WebDriver webDriver;
	
	
	String pyCode;
	String expectedResult;
	
	

	
	 public TryHerePage(WebDriver webDriver) {
	        super();
	        this.webDriver = webDriver;
	    }

	  
	    public void readValidDataFromSheet(String sheetName, Integer rowNumber) throws IOException {
	        ExcelReader reader = new ExcelReader();
	        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/signInTestData.xlsx", sheetName);
	        pyCode = testdata.get(rowNumber).get("pythonCode");
	        expectedResult = testdata.get(rowNumber).get("Result");
	        System.out.println("PyCode -----"+pyCode);
//	        try {
//				//Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	        
	    }
	   
	    public void readInValidDataFromSheet(String sheetName, Integer rowNumber) throws IOException {
	        ExcelReader reader = new ExcelReader();
	        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/signInTestData.xlsx", sheetName);
	        pyCode = testdata.get(rowNumber).get("pythonCode");
	        System.out.println("ZZZZZZ PyCode -----"+pyCode);

	        expectedResult = testdata.get(rowNumber).get("Result");
	        System.out.println("PyCode -----"+pyCode);
	        
	        
	    }
	   
	   
	 public void tryhere() {
	        webDriver.findElement(tryhere).click();
	    }

	    public void Txtarea() throws InterruptedException {

	       enterCodePractice(pyCode,  webDriver.findElement(writeintexbox));
	       //webDriver.findElement(writeintexbox).sendKeys("Hello");
	        System.out.println("enter here");

	    }
	    
	    public void enterCode(String code, WebElement element) {

			new Actions(webDriver).sendKeys(element, code).perform();
		}

		public void enterCodePractice(String code, WebElement element) {
			new Actions(webDriver)
			.keyDown(Keys.CONTROL)
			.sendKeys("a")
			.sendKeys(Keys.DELETE)
			.keyUp(Keys.CONTROL)
			.perform();
			String[] str1 = code.split("\n");
			for (int i = 0; i < str1.length; i++) {
				if (str1[i].equalsIgnoreCase("\\b")) {
					element.sendKeys(Keys.BACK_SPACE);
				} else {
					element.sendKeys(str1[i]);
					element.sendKeys(Keys.RETURN);
				}
			}
		}

	    public void runButtton() {
	        webDriver.findElement(runbutton).click();
	        
	    }
		public void checkOutput() throws InterruptedException {
			WebElement eleOutput = webDriver.findElement(Output);
			String actualResult = eleOutput.getText();
			System.out.println("checkOutput -----actualResult: "+actualResult +"-----zzzzz - actualResult");
			System.out.println("checkOutput -----expectedResult : "+expectedResult +"----zzzzz - expectedResult");
			Assert.assertEquals(actualResult, expectedResult);
			//Thread.sleep(2000);
			webDriver.navigate().back();
		}
//	    public void Geterrormessage() throws InterruptedException {
//
//	        webDriver.findElement(writeintexbox).sendKeys(Keys.ENTER);
//	        webDriver.findElement(writeintexbox).sendKeys("'hello'");
//	        webDriver.findElement(writeintexbox).sendKeys(Keys.ENTER);
//	        System.out.println("check this step");
//	    }

	    public String getErrorText() throws InterruptedException {
	        Alert alert = webDriver.switchTo().alert();
	        String message = alert.getText();
	        System.out.println("" + message);
	        alert.accept();
	        //Thread.sleep(2000);
			
			webDriver.navigate().back();
	        return message;
	 
	    }
	
}
