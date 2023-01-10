package main.java.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubscriptionPage {

public WebDriver driver;
	
	private By header1Text = By.cssSelector("#become-member");
	
	public SubscriptionPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getHeader1Text() {
		return driver.findElement(header1Text);
	}

}
