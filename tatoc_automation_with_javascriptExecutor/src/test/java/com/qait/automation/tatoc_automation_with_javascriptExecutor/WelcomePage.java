package com.qait.automation.tatoc_automation_with_javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;

import junit.framework.Assert;

public class WelcomePage {
	JavascriptExecutor jsDriver;

	public WelcomePage(JavascriptExecutor jsDriver) {
		this.jsDriver = jsDriver;
	}

	
	public void clickOnBasic() {
		jsDriver.executeScript("document.querySelector('a').click();");
		String response = (String) jsDriver.executeScript("return document.querySelector(\'div > h1').textContent");
		Assert.assertTrue("unable to proceed after grid gate",response.equals("Grid Gate"));

	}
}
