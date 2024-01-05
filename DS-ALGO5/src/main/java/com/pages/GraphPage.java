package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GraphPage {

	private WebDriver webDriver;

	By graphGetStared = By.xpath("//h5[contains(text(),'Graph')]/..//a");
	By graphRepLink = By.linkText("Graph Representations");

	By graphLink = By.linkText("Graph");

	public GraphPage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
	}

	public void clickGraphGetstarted() {

		webDriver.findElement(graphGetStared).click();
	}

	public void ClickGraphRepLink() {
		webDriver.findElement(graphRepLink).click();
	}

	public void ClickGraphLink() {
		webDriver.findElement(graphLink).click();
	}



}
