package TACTOC;


import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Basic {
	static WebDriver driver;
	public static void getConnection() {
	    String baseUrl = "http://10.0.1.86/tatoc";
	    
		driver.get(baseUrl); 
		
		driver.manage().window().maximize();
		clickAction("div.page>a:nth-child(4)");
		clickAction("td>div.greenbox");
		
		FrameDungeon();
	 
		draganddrop();
	  	 
		popupwindow();
		
		cookies();
	
	
			
	}
	
	public static void FrameDungeon() {
		driver.switchTo().frame("main");
		String box1= driver.findElement(By.cssSelector("center> div#answer")).getAttribute("class");
		
		String box2="";
		while(true) {
			driver.switchTo().frame("child");
			 box2= driver.findElement(By.id("answer")).getAttribute("class");
			 if(box1.equals(box2)) 
				 break;
			 else {
				 driver.switchTo().parentFrame();
			
				 clickAction("center>a:nth-child(7)");
			 }
		}
		 driver.switchTo().parentFrame();
		
		 clickAction("center>a:nth-child(9)");
	}
	
	
	public static void draganddrop() {

		 WebElement from=driver.findElement(By.cssSelector("div#dragbox"));
		 WebElement to=driver.findElement(By.cssSelector("div#dropbox"));
	
		 Actions action=new Actions(driver);					
			
         action.dragAndDrop(from, to).build().perform();
		 clickAction("div.page>a:nth-child(10)");
		      
	}
	
	public static void popupwindow() {
		
         clickAction("div.page>a:nth-child(4)");
		 
		 String MainWindow=driver.getWindowHandle();
		 
		 Set<String> s1=driver.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                    driver.switchTo().window(ChildWindow);
	                    
	                    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	                    driver.findElement(By.cssSelector("input#name")).sendKeys("Shailesh Sharma");
	                   
	                   clickAction("input#submit");
	            }
	        }
	        driver.switchTo().window(MainWindow);
	        clickAction("div.page>a:nth-child(6)");
	}
	
	public static void cookies() {
		
		clickAction("div.page>a:nth-child(8)");
		String[] token= driver.findElement(By.cssSelector("div.page>span#token")).getText().split(" ");
		
		driver.manage().addCookie(new Cookie("Token", token[1]));
		
		clickAction("div.page>a:nth-child(10)");
		 
	}
	
	
	public static void clickAction(String path) {
		 driver.findElement(By.cssSelector(path)).click();
	}
	
	
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "D:\\Files\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  getConnection();
	  
  }
}
