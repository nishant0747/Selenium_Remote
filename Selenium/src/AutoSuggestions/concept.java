package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class concept
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.co.in/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("redmi note 8");
		
		List<WebElement> AllOptions = driver.findElements(By.xpath("//ul[@class='erkvQe']"));
		
		for (WebElement option : AllOptions) 
		{
			System.out.print(option.getText());
			
		}
		
		
		
	}

}
