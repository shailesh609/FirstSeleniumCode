package TACTOC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class titlecheck {
	public static WebDriver driver;
	@BeforeSuite
	  public void getConnection() {
		 System.setProperty("webdriver.chrome.driver", "D:\\Files\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	  }

	  @BeforeTest
	  public void Launchbrowser() {
		  
		  String baseUrl = "http://demo.guru99.com/test/newtours/";
		    
			driver.get(baseUrl); 
	  }
	
	
	
  @Test
  public void test1() {
	  String actualTitle="Welcome: Mercury Tours";
	  String expectedTitle=driver.getTitle();
	  
	  if (actualTitle.contentEquals(expectedTitle)){
          System.out.println("Test1 Passed!");
      } else {
          System.out.println("Test1 Failed");
      }
  }
	  @Test
	  public void test() {
		  String actualTitle="Welcome: Mercury";
		  String expectedTitle=driver.getTitle();
		  
		  if (actualTitle.contentEquals(expectedTitle)){
	          System.out.println("Test Passed!");
	      } else {
	          System.out.println("Test Failed");
	      }
	  
	  
	  
  }
 



}
