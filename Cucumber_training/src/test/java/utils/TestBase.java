package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver WebDriverManager() {
		
		if(driver == null) {
		System.setProperty("webdriver.chrome.driver","/JavaGuru/Soft/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		}
		return driver;
	}
}
