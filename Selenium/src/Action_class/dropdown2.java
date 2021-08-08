package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown2 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yatra.com/");
		
		Thread.sleep(1000);
		
		WebElement sup = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
		
	    Actions act = new Actions(driver);
	    
	    act.moveToElement(sup).perform();
	    
	    Thread.sleep(1000);
	    
	   driver.findElement(By.xpath("//span[text()='Adventures']")).click();
	
	 // act.sendKeys(Keys.DOWN).perform();
	
	}

}
