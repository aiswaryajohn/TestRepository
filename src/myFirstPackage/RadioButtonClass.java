package myFirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		WebElement radio3 = driver.findElement(By.id("vfb-7-3"));
		
		radio1.click();
		System.out.println("radio button 1 selected");
		
		radio2.click();
		System.out.println("radio button 2 selected");
		
		radio3.click();
		System.out.println("radio button 3 selected");
		

	}

}
