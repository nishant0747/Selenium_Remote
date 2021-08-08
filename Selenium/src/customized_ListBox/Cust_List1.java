package customized_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cust_List1 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(3000);
		
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Actions act = new Actions(driver);
		
		act.click(day).perform();
		
		Thread.sleep(1000);
		
		act.sendKeys(Keys.ARROW_UP).perform();
		
		Thread.sleep(1000);
		
		act.sendKeys(Keys.ARROW_UP).perform();
		
		Thread.sleep(1000);
		
		act.sendKeys(Keys.ENTER).perform();
		
		act.moveToElement(month).click().perform();
		
		Thread.sleep(1000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(1000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(1000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(1000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(1000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(1000);
		
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(1000);
		
		act.click(year).perform();
		
		String s1 = "1996";
		
		for(int i=1; i<=25; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			
			Thread.sleep(100);
		}
		
		act.sendKeys(Keys.ENTER).perform();
			
		}
		
	

		
		
		
		
		
		
		
		
		
		
		
	}


