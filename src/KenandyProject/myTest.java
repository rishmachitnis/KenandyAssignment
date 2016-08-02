package KenandyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class myTest {
   
	
	@Test
	public void test1()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("Iphone6s");	
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		driver.findElement(By.xpath(".//*[@id='ref_2335753011']/li[3]/a/span[2]")).click();
		
		
		 Actions actions=new Actions(driver);
         actions.moveToElement(driver.findElement(By.xpath(".//*[@id='result_0']/div/div[6]/span/span/a/i[1]"))).build().perform();
         String rate = driver.findElement(By.xpath(".//*[@id='a-popover-content-1']/div/div/div/div[1]/span")).getText();
         Assert.assertEquals(rate, 4);
 		 System.out.println("Test Completed");
 		 driver.quit();
	}
}
