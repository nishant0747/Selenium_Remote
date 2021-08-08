package POP_UP;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser_popup1 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewTab")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		String mainpageID = driver.getWindowHandle();
		
		String cwID="";
		
		for (String str : ids) 
		{
			/*if(!str.equals(mainpageID))
			{
				 cwID = str;
			} */
			
			cwID = str;
		}
		
		
		driver.switchTo().window(cwID);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@title='Contact me'])[3]")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().window(mainpageID);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Download']")).click();
		
		
		
		
		
	}

}
