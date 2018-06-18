package automationframework;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.Cookie;

public class First_testcase {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Basic Course")).click();
		
		driver.findElement(By.className("greenbox")).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

		String firstbox_color = driver.switchTo().frame("main").findElement(By.id("answer")).getAttribute("class");
		String secondbox_color = driver.switchTo().frame("child").findElement(By.id("answer")).getAttribute("class");

		// System.out.println(firstbox_color);
		// System.out.println(secondbox_color);
		// driver.switchTo().parentFrame();

		while (!firstbox_color.equals(secondbox_color)) {
			driver.switchTo().parentFrame().findElement(By.linkText("Repaint Box 2")).click();
			secondbox_color = driver.switchTo().frame("child").findElement(By.id("answer")).getAttribute("class");
			// System.out.println(firstbox_color+" "+secondbox_color);

		}
		
		driver.switchTo().parentFrame().findElement(By.linkText("Proceed")).click();

		
		
		WebElement from = driver.findElement(By.id("dragbox"));
		WebElement to = driver.findElement(By.id("dropbox"));
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();

		driver.findElement(By.linkText("Proceed")).click();
		driver.findElement(By.partialLinkText("Launch")).click();

		ArrayList tabs = new ArrayList(driver.getWindowHandles());
		//System.out.println(tabs.size());

		driver.switchTo().window((String) tabs.get(1));
		// driver.manage().deleteAllCookies();
		driver.findElement(By.id("name")).sendKeys("pradeep");

		driver.findElement(By.id("submit")).click();
		driver.switchTo().window((String) tabs.get(0));
		driver.findElement(By.linkText("Proceed")).click();
		driver.findElement(By.linkText("Generate Token")).click();
		String Token = driver.findElement(By.id("token")).getText();
		String value = Token.replace("Token: ", "");
		// String value=Token.substring(7);

		// System.out.println(value);

		Cookie ck = new Cookie("Token", value);
		driver.manage().addCookie(ck);
		driver.findElement(By.linkText("Proceed")).click();

		Thread.sleep(5000);
		driver.close();
	}

}
