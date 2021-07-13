package Seleniumcode;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorprogram {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\Files\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*String baseUrl = "https://www.facebook.com/pages/create/?ref_type=registration_form";
        String tagName = "";
        
        driver.get(baseUrl);
        tagName = driver.findElement(By.name("email")).getTagName();
        System.out.println(tagName);
        driver.close();
        System.exit(0);
        */
		 driver.get("http://demo.guru99.com/selenium/deprecated.html");
	        driver.switchTo().frame("classFrame");
	        driver.findElement(By.linkText("Deprecated")).click();
        
	}
}
