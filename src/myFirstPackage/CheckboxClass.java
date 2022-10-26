package myFirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement checkbox1 = driver.findElement(By.id("vfb-6-0"));
		WebElement checkbox2 = driver.findElement(By.id("vfb-6-1"));
		WebElement checkbox3 = driver.findElement(By.id("vfb-6-2"));
		
		checkbox1.click();
		System.out.println("checkbox 1 is selected");
		
		checkbox2.click();
		System.out.println("checkbox 2 is selected");
		
		//checkbox3.click();
		//System.out.println("checkbox 3 is selected");
		if (checkbox3.isSelected()){
			System.out.println("checkbox3 is selected");
		}
		else {
			System.out.println("checkbox3 is not selected");
		}
		Boolean display = driver.findElement(By.id("vfb-6-0")).isDisplayed();
		System.out.println("element displayed" + display);
		
			Boolean enabled = driver.findElement(By.id("vfb-6-2")).isEnabled();
			System.out.println("element enabled " + enabled);
			
			driver.close();
			

	}

}
