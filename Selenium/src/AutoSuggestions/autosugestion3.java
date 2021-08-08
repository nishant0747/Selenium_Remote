package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosugestion3 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		String exp = "Mumbai, India";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='From']")).click();
		
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//span[text()='From']")).click();
		
//		Thread.sleep(1000);
		
		WebElement textbox = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		
		textbox.sendKeys("Mumbai");
		Thread.sleep(3000);
		
		textbox.sendKeys(Keys.ARROW_DOWN);
	
		textbox.sendKeys(Keys.ENTER);
		
		
		
	}
	
	
	}


