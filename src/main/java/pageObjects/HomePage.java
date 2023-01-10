package main.java.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

public WebDriver driver;
	
	private By signUpButton = By.cssSelector("signup-button");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getSignUpButton() {
		return driver.findElement(signUpButton);
	}
	
}
