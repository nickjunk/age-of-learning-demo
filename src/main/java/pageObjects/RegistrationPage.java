package main.java.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

public WebDriver driver;
	
	private By emailInput = By.cssSelector("#email");
	private By submitButton = By.cssSelector("#submit-button");
	
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getEmailInput() {
		return driver.findElement(emailInput);
	}
	
	public WebElement getSubmitButton() {
		return driver.findElement(submitButton);
	}
}
	