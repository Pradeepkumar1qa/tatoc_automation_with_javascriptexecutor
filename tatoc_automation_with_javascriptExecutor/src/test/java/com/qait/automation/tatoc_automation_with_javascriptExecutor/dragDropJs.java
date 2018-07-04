package com.qait.automation.tatoc_automation_with_javascriptExecutor;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class dragDropJs {
	JavascriptExecutor js;
	WebDriver driver;
	
	public dragDropJs(JavascriptExecutor js)
	{
	this.js=js;
	}

	public void dragBox()
	{
	WebElement from=null,to=null;
	from = (WebElement)js.executeScript("return document.getElementById('dragbox');");
	to = (WebElement)js.executeScript("return document.getElementById('dropbox');");
	Actions act=new Actions((WebDriver)js);
	act.dragAndDrop(from, to).build().perform();
	js.executeScript("document.querySelector('a').click();");
	
	
	}
}


