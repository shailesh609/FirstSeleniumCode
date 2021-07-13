package Seleniumcode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\Files\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://hris.qainfotech.com/login.php";
		
		driver.get(baseUrl);
		
		driver.findElement(By.id("txtUserName")).sendKeys("Email Address");
		driver.findElement(By.name("txtPassword")).sendKeys("Password");
		driver.findElement( By.name("Submit")).click();
		driver.findElement( By.xpath("//div[@id='page']/div/div/div[2]/ul/li/a/span")).click();
		
	//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		
	//	driver.findElement( By.cssSelector(".user-profile-option > li:nth-child(3) a")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		driver.findElement( By.cssSelector(".user-profile-option > li a")).click();
		
	
}
}
