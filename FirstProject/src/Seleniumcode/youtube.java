package Seleniumcode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args)  throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Files\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
	
		driver.findElement(By.cssSelector("input#search")).sendKeys("punjabi new song");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("button#search-icon-legacy")).click();
		driver.findElement(By.cssSelector("a#video-title:nth-child(2)")).click();
		//driver.findElement(By.cssSelector("button.ytp-play-button")).click();
		
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("button.ytp-play-button")).click();
		String duration=driver.findElement(By.cssSelector("span.ytp-time-duration")).getText();
		System.out.print(duration);
		
	}

}
