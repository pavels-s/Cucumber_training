package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public WebDriver driver;
	
	public GenericUtils (WebDriver driver) {
		this.driver = driver;
	}
	
	public void SwitchWindowTOChild() {
		Set<String> s1 = driver.getWindowHandles();
		//Setting collection with both opened windows - parent and just opened child
		Iterator<String> i1 = s1.iterator();
		//Autom. retrieve window with index 0
		String parentWindow = i1.next();
		//Retrieve second, child windows ID
		String childWindow = i1.next();
		//Switching to child window thru its ID
		driver.switchTo().window(childWindow);
	}

}
