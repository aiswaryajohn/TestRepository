package myFirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://43.225.54.129/medlab/demo/");
		driver.findElement(By.name("userid")).sendKeys("demo");
		WebElement elementUser = driver.findElement(By.name("userid"));
		elementUser.sendKeys(Keys.TAB);
		driver.findElement(By.name("password")).sendKeys("demo1212");
		WebElement elementPass = driver.findElement(By.name("password"));
		elementPass.sendKeys(Keys.TAB);
		driver.findElement(By.name("Login")).click();
		WebElement elementClick = driver.findElement(By.name("Login"));
		elementClick.sendKeys(Keys.TAB);

	}

}
