package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTotalLinksOnWebpage 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		List<WebElement> TotalLinks = driver.findElements(By.xpath("//a"));
		
		System.out.println(TotalLinks.size());
		
		for (WebElement we : TotalLinks)
		{
			
			String str = we.getText();
			
			System.out.println(str);
			
		}
		
	
		
		
		
		
	}

}
