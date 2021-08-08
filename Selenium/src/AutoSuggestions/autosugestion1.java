package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosugestion1
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		String exp = "audi q7 price pune";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.co.in/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("audi q");
		
		Thread.sleep(3000);
		
	    List<WebElement> AllOptions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));

		for (WebElement option : AllOptions) 
		{
			
			String act = option.getText();
			
		//	System.out.println(act);
			
			if(act.equals(exp))
			{
				option.click();
	            break;
			}
			
		}
	}

}
