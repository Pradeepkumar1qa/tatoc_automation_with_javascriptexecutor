package com.qait.automation.tatoc_automation_with_javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

import junit.framework.Assert;

public class testFileJs {

	WelcomePage w;
	JsGridGate g; 
	WebDriver driver;
	JsFrameDungeon f;
	dragDropJs d;
	JavascriptExecutor jsDriver;
	jsPopUp j;
	jsCookie c;
	@Test
	public void launchBrowser() {
		System.setProperty( "webdriver.chrome.driver","C:\\Users\\pradeepkumar1\\Downloads\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        String url="http://10.0.1.86/tatoc";
		this.jsDriver = (JavascriptExecutor) driver;
		driver.get("http://10.0.1.86/tatoc");

	}

	@Test(dependsOnMethods= {"launchBrowser"})
	public void checkBasicCourseLink() {
		w = new WelcomePage((jsDriver));
		w.clickOnBasic();
	}

	@Test(dependsOnMethods= {"checkBasicCourseLink"})
	public void checkGridGate() {
		g = new JsGridGate(jsDriver);
		g.clickOnGreen();
	}

	@Test(dependsOnMethods= {"checkGridGate"})
	public void checkRepaintAndProceed() {
		f = new JsFrameDungeon(jsDriver);
		f.repaintAndProceed();
	}
	
	@Test(dependsOnMethods= {"checkRepaintAndProceed"})
	public void checkdragBox() {
		d= new dragDropJs(jsDriver);
		d.dragBox();
	}	
	@Test(dependsOnMethods= {"checkdragBox"})
	public void checkpopup() throws InterruptedException {
		j= new jsPopUp(jsDriver);
		j.popUp();
		}
		
	@Test(dependsOnMethods= {"checkpopup"})
		public void checkCookie() throws InterruptedException {
			c= new jsCookie(jsDriver);
			c.cookieHandle();
	}
}
