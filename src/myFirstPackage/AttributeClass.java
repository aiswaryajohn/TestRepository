package myFirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String attribute = driver.findElement(By.name("q")).getAttribute("maxlength");
        System.out.println("attribute : "+attribute);
	}

}
