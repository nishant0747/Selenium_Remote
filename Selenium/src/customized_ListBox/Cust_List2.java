package customized_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cust_List2 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(3000);
		
		//step 1
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		//step 2
		Actions act = new Actions(driver);
		
		//step 3
		act.click(month).perform();
		
		//move to bottom
		
		for(int i=1; i<=12; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
		
		//act.sendKeys(Keys.ENTER).perform();
		
		//move to required month i.e. August
		for(int i=1; i<=4; i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			
			Thread.sleep(500);	
		}
		
		act.sendKeys(Keys.ENTER).perform();
		
	}

}
