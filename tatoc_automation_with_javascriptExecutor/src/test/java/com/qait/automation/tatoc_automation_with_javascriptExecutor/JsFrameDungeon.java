package com.qait.automation.tatoc_automation_with_javascriptExecutor;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class JsFrameDungeon {
	JavascriptExecutor jsDriver;
	WebDriver driver;
	String FirstBoxcolor;
	String SecondBoxColor;
	public JsFrameDungeon(JavascriptExecutor jsDriver)
	{
		driver=(WebDriver)jsDriver;
	    this.jsDriver=jsDriver;
	}
	
	public void repaintAndProceed()
	{
		//driver.switchTo().frame("main");
		//String box1 = driver.findElement(By.id("answer")).getAttribute("class");
		
	    String box1=(String) jsDriver.executeScript("return document.getElementById('main').contentWindow.document.getElementById('answer').className;");
		System.out.println("this is color"+box1);
		 while(true)
		 {      //this is old code for the same task
			/* jsDriver.executeScript("document.querySelector('body > center > a:nth-child(7)').click();");
			 driver.switchTo().frame("child");
			 String box2 = driver.findElement(By.id("answer")).getAttribute("class");
			 driver.switchTo().parentFrame();*/
			 
			 jsDriver.executeScript("document.getElementById('main').contentWindow.document.querySelector('a').click();");
			 String box2=(String) jsDriver.executeScript("return document.getElementById('main').contentWindow.document.getElementById('child').contentWindow.document.getElementById('answer').className; ");
			 System.out.println(box2);
			
			 if(box1.equals(box2))
			 {
				 //jsDriver.executeScript("document.querySelector('body > center > a:nth-child(9)').click();");
				 jsDriver.executeScript("document.getElementById('main').contentWindow.document.querySelectorAll('a')[1].click();");
				 break;
			 }
		 }	
	
	}}