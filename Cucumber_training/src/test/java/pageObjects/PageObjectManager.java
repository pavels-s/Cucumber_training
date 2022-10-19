package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public OffersPage offersPage;
	public LandingPage landingPage;
	public CheckoutPage checkoutPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public LandingPage getLandingPage() {
		landingPage = new LandingPage(driver);
		return landingPage;
	}
	
	public OffersPage offersPage() {
		offersPage = new OffersPage(driver);
		return offersPage;
	}
	
	public CheckoutPage getCheckoutPage() {
		checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
	}

}
