package Seleniumcode;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movetoelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Files\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.flipkart.com/";
	
		
		driver.get(baseUrl);
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.className("_2IX_2-")).sendKeys("9917447545");
		driver.findElement(By.cssSelector("input._3mctLh")).sendKeys("shailesh123");
		driver.findElement(By.cssSelector("button._3AWRsL")).click();
		
		Actions action = new Actions(driver);
		 	
		action.moveToElement(driver.findElement(By.xpath("//div[@class='_28p97w']/div[1]/div[1]/div[contains(text(),'Shailesh')]"))).build().perform();

		 WebElement logOut= driver.findElement(By.cssSelector("ul.pO9syL>li:nth-child(10)>a"));
		  action.moveToElement(logOut).click().build().perform();
		  
			 System.out.print("Successfully logout");
	}

}
