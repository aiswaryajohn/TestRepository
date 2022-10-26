package myFirstPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollClass {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor javaobject = (JavascriptExecutor) driver;
		javaobject.executeScript("window.scrollBy (0,9000)", "");
		Thread.sleep(1000);
		
		javaobject.executeScript("window.scrollBy (0,-9000)", "");
		Thread.sleep(1000);
	}

}
