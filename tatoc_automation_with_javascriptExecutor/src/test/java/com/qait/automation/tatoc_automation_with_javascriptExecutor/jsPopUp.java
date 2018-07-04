package com.qait.automation.tatoc_automation_with_javascriptExecutor;

import java.util.ArrayList;
import java.util.Set;



import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class jsPopUp {
	JavascriptExecutor js;
	WebDriver driver;

public jsPopUp(JavascriptExecutor js)
{
this.js=js;
}

	public void popUp() throws InterruptedException {
		js.executeScript("document.querySelector('a').click();");
		driver=((WebDriver)js);
		Set<String> arritem=driver.getWindowHandles();
		driver.switchTo().window((String) arritem.toArray()[1]);
	
		js=((JavascriptExecutor)driver);
        js.executeScript("document.getElementById('name').value='someValue';");
        Thread.sleep(1000);
        js.executeScript("document.getElementById('submit').click();");
        driver=((WebDriver)js);
        
       driver= driver.switchTo().window((String) arritem.toArray()[0]);       
       driver.findElement(By.linkText("Proceed")).click();
	}

}
