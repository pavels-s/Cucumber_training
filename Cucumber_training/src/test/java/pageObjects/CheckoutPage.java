package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	public WebDriver driver;
	
	public CheckoutPage (WebDriver driver) {
		this.driver = driver;
	}
	
	private By cartBag = By.xpath("//img[@alt='Cart']");
	private By checkOutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	private By promoBtn = By.cssSelector(".promoBtn");
	private By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");
	
	public void checkOutItems() {
		driver.findElement(cartBag).click();
		driver.findElement(checkOutButton).click();		
	}
	
	public Boolean verifyPromoBtn() {
		return driver.findElement(promoBtn).isDisplayed();
	}
	
	public Boolean verifyPlaceOrder() {
		return driver.findElement(placeOrder).isDisplayed();
	}

}
