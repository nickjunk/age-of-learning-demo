package test.java.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.java.resources.Base;
import main.java.pageObjects.HomePage;
import main.java.pageObjects.RegistrationPage;
import main.java.pageObjects.SubscriptionPage;

public class AgeOfLearningExample extends Base {
	
	public static  WebDriver driver;
	
	public static void reverseSort(Integer[] array) {
		int index = -1;
		for(int i = 0; i<array.length; i++) {
			index = i;
			for(int j=i; j<array.length; j++) {
				if(array[j]>array[index]) {
					index = j;
				}
			}
			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + ",");
		}
	}

	@Test
	public static void SignUpTest() throws IOException, InterruptedException {
		
		// Response for Part 2
		
		Integer[] arr = {1, 6, 10, 9, 8, 2, 4, 7, 0};
		
		
		reverseSort(arr);
		
		
		// Response for Part 1
		
		driver = initializeDriver();
		
		driver.get(getPropertyValue("baseURL"));
		HomePage homePage = new HomePage(driver);
		RegistrationPage registrationPage = new RegistrationPage(driver);
		SubscriptionPage subscriptionPage = new SubscriptionPage(driver);
		
		homePage.getSignUpButton().click();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.abcmouse.com/abt/register");
		registrationPage.getEmailInput().sendKeys(getPropertyValue("email"));
		registrationPage.getSubmitButton().click();
		currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.abcmouse.com/abc/subsription");
		String header1Text = subscriptionPage.getHeader1Text().getText();
		Assert.assertEquals(header1Text, "Become a Member!");

		Thread.sleep(5000);
		driver.close();
		
	}

}