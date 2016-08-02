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
public class Iphone6sPage 
{
  
   WebDriver driver;
	
    By cellPhones= By.xpath(".//*[@id='ref_2335753011']/li[3]/a/span[2]");
    
    public Iphone6sPage(WebDriver driver)
    {
    	this.driver=driver;
    }
    
    public void clickonCellPhones()
    {
    	driver.findElement(cellPhones).click();
    }
    
}
