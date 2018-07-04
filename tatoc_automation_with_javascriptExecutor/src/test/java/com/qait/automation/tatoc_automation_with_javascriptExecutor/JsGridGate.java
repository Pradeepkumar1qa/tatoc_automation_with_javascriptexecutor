package com.qait.automation.tatoc_automation_with_javascriptExecutor;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class JsGridGate {
	JavascriptExecutor jsDriver;

	public JsGridGate(JavascriptExecutor jsDriver)
	{
	this.jsDriver=jsDriver;
	}
	
	



	public void clickOnGreen() {
		
		jsDriver.executeScript("document.querySelector('div.greenbox').click();");
		String response=(String) jsDriver.executeScript("return document.querySelector(\'div > h1').textContent");
		Assert.assertEquals(response, "Frame Dungeon");
		
	}



}
