/**
 * 
 */
package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Rishma
 *
 */
public class HomePage 
{
	WebDriver driver;
	
    By searchtext= By.xpath(".//*[@id='twotabsearchtextbox']");
    By searchbutton= By.xpath(".//*[@id='nav-search']/form/div[2]/div/input");
    
    public HomePage(WebDriver driver)
    {
    	this.driver=driver;
    }
    
    public void typeSearchText()
    {
    	driver.findElement(searchtext).sendKeys("IPhone6s");
    }
    
    public void clickOnSearchButton()
    {
    	driver.findElement(searchbutton).click();
    }
	
}
