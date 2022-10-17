package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage (WebDriver driver) {
		this.driver = driver;
	}
	
	private By search = By.xpath("//input[@type='search']");
	private By productName = By.cssSelector("h4.product-name");
	private By topDeals = By.linkText("Top Deals");
	
	public void searchItem(String shortName) {
		driver.findElement(search).sendKeys(shortName);
	}
	
	public void getSearchText() {
		driver.findElement(search).getText();
	}
	
	public String getProductName() {
		return driver.findElement(search).getText().split("-")[0].trim();
	}
	
	public void selectTopDealsPage() {
		driver.findElement(topDeals).click();
	}

}
