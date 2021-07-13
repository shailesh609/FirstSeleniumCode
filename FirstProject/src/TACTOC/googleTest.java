package TACTOC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class googleTest {
	
	public static WebDriver driver;
	
 
  @BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Files\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
  }

  
  @Test
  public void tittletest() {
	  String title=driver.getTitle();
	  System.out.println(title);
  }
  
  @Test
  public void googlelogotest() {
	boolean logo=  driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
	if(logo==true) System.out.println("Logo displayed");
  }
  
  
  @Test
  public void mailLinktest() {
	boolean mail=  driver.findElement(By.linkText("Gmail")).isDisplayed();
	if(mail==true) System.out.println("Mail is available");
  }
  
  
  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }
  
}
