package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown1
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(1000);
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));

	    Actions act = new Actions(driver);
	    
	   Actions element = act.moveToElement(login);
	   
	    element.perform();
	 
//	    Thread.sleep(1000);
//	    
//	    element.sendKeys(Keys.DOWN).perform();
//	    
//	    Thread.sleep(1000);
//	    
//	    element.sendKeys(Keys.DOWN).perform();
//	    
//	    Thread.sleep(1000);
//	    
//	    element.sendKeys(Keys.ENTER).perform();
	    
	 //   login.sendKeys(Keys.DOWN);
	
	
	
	
	}

}
