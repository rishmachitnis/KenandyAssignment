/**
 * 
 */
package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

/**
 * @author Rishma
 *
 */
public class MainPage 
{
	WebDriver driver;
	
	By iPhone = By.xpath(".//*[@id='result_0']/div/div[6]/span/span/a/i[1]");
	By ratings = By.xpath(".//*[@id='a-popover-content-1']/div/div/div/div[1]/span");
	
	public MainPage(WebDriver driver)
    {
    	this.driver=driver;
    }
    
    public String hoverMainPage()
    {
    	Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(iPhone)).build().perform();
        String rate = driver.findElement(ratings).getText();
        return rate;
    }
   
	 
}
