package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosugestion2 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		String exp = "Pune Railway Station Sadhu Vaswani Road, Koregaon Park, Pune, Maharashtra";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
	
		driver.navigate().to("https://www.google.co.in/maps/@17.0959176,74.4642858,15z?hl=en&authuser=0");
		
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
	//	Thread.sleep(1000);

		
		driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("pu");
		
		Thread.sleep(5000);
		
		List<WebElement> Alloptions = driver.findElements(By.xpath("//div[@class='sbsb_b']/div"));
		
		for (WebElement option : Alloptions)
		{
			
			String act = option.getText();
			System.out.println(act);
			
			if(exp.equals(act))
			{
				option.click();
				break;
			} 
			
		}
	//	Thread.sleep(2000);
		
	//	driver.findElements(By.xpath(""));
		
	}

}
