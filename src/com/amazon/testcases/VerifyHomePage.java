/**
 * 
 */
package com.amazon.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.pages.HomePage;
import com.amazon.pages.Iphone6sPage;
import com.amazon.pages.MainPage;

/**
 * @author Rishma
 *
 */
public class VerifyHomePage 
{
	@Test
	public void verifyHomeSearch()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		HomePage home = new HomePage(driver);
		Iphone6sPage cell = new Iphone6sPage(driver);
		MainPage mainPage = new MainPage(driver);
		
		home.typeSearchText();
		home.clickOnSearchButton();
		
		cell.clickonCellPhones();
		
		String rate = mainPage.hoverMainPage();
		
		 Assert.assertEquals(rate, "4.2 out of 5 stars");
    	 System.out.println("Test Completed");
		
		
		driver.quit();
	}

}
