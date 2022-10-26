package myFirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstClass {

	public static void main(String[] args) {
		//System.out.println("Hello World");
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driverobject = new ChromeDriver();
		driverobject.get("https://www.google.com");
		driverobject.findElement(By.name("q")).sendKeys("Babypictures");
		driverobject.findElement(By.name("btnK")).click();
		
	}

}
