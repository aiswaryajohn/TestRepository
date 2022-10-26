package myFirstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.facebook.com";
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = "";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		System.out.println("Actual Title : "+actualTitle);
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
	}

}
