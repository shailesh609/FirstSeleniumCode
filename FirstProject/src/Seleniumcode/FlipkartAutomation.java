package Seleniumcode;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.CSS;

import org.apache.commons.exec.LogOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class FlipkartAutomation {
	
	static WebDriver driver;
	
	public static void Login() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.className("_2IX_2-")).sendKeys("*****Username*******");
		driver.findElement(By.cssSelector("input._3mctLh")).sendKeys("******Password********");
		driver.findElement(By.cssSelector("button._3AWRsL")).click();
	}

	public static void search() {
		WebElement search= driver.findElement(By.cssSelector("input._3704LK"));
		search.sendKeys("One plus z bullets");
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.className("s1Q9rs")).click();
	}
	
	public static void addtocart() {
		String MainWindow=driver.getWindowHandle();
		 
		 Set<String> s1=driver.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	            	  
	                    driver.switchTo().window(ChildWindow);
	                    driver.manage().getCookies();
	                    
	                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	                    
	                    driver.findElement(By.className("_3v1-ww")).click();
	                
	            }
	        }
	        
	        driver.switchTo().window(MainWindow);
	        driver.navigate().refresh();
	}
	
	public static void validatecartitem() {
		 String expectedproduct= "OnePlus Bullets Wireless Z Bass Edition Bluetooth Headset";
		   String actual="";
		   driver.findElement(By.className("_3SkBxJ")).click();
		   actual=driver.findElement(By.className("_2Kn22P")).getText();
		   
		   if(actual.equals(expectedproduct)) {
			 System.out.println("True Both product Same");
			 driver.findElement(By.cssSelector("img._2xm1JU")).click();
			 
		     logout();
		   
		   }
		 
	}
	public static void logout()  {
		
		 Actions action = new Actions(driver);
		 
	action.moveToElement(driver.findElement(By.xpath("//div[@class='_28p97w']/div[1]/div[1]/div[contains(text(),'Shailesh')]"))).build().perform();
    	
	//action.moveToElement(driver.findElement(By.xpath("//div[@class='_28p97w']/div[1]/div[1]/div[text()='Shailesh']"))).build().perform();
	   
	
		  WebElement logOut= driver.findElement(By.cssSelector("ul.pO9syL>li:nth-child(10)>a"));
		  action.moveToElement(logOut).click().build().perform();
		  
			 System.out.print("Successfully logout");
	}
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Files\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		String baseUrl = "https://www.flipkart.com/";
		
		driver.get(baseUrl);
		
		
		
		Login();
	 
		driver.manage().addCookie(new Cookie("Username", "9917447545"));
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		 search();
		
		 addtocart();
		
		 validatecartitem();
		     
            
	}

}

