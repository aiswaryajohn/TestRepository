package myFirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Dimension dimensionobject = driver.findElement(By.name("email")).getSize();
		System.out.println("height : " + dimensionobject.height);
		System.out.println("width : " + dimensionobject.width);
	}

}
