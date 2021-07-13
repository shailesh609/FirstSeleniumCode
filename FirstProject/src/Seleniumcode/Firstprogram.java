package Seleniumcode;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Firstprogram {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Files\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
    	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        driver.get(baseUrl);

        actualTitle = driver.getTitle();

       
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        driver.close();

	}

}
