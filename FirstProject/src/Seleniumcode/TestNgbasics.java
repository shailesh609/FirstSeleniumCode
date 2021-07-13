package Seleniumcode;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class TestNgbasics {
 
  @BeforeSuite
  public void setup() {
	  System.out.println("Setup system property");
  }
	
	
  @BeforeTest
  public void launchbrowser() {
	  System.out.println("Launch browser");
  }
  
  @BeforeMethod
  public void enterurl() {
	  System.out.println("Enter the url");
  }

  @BeforeClass
  public void login() {
	  System.out.println("Login Method");
  }

  @Test
  public void test1() {
	  System.out.println("hello world");
  }
  
  @Test
  public void test2() {
	  System.out.println("hello world2");
  }
  
  
  @Test
  public void test3() {
	  System.out.println("hello world3");
  }
  
  @AfterMethod
  public void logout() {
	  System.out.println("Log out");
  }
  
  @AfterTest
  public void deleteallcookies() {
	  System.out.println("Delete cookies");
  }
  
  @AfterClass
  public void closebrowser() {
	  System.out.println("Browser close");
  }
  
  @AfterSuite
  public void generatereport() {
	  System.out.println("Generate report");
  }
  
}
