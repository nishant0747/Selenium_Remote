package _practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ola 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.olacabs.com/");
		
		Thread.sleep(1000);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe"));
		
		Thread.sleep(1000);
		
		driver.switchTo().frame(iframe);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='middle h-full text value']")).click();
		
		Thread.sleep(1000);
		
		WebElement dest = driver.findElement(By.xpath("//input[@id='addressInput']"));
		
		dest.sendKeys("kolhapur");
		
		Thread.sleep(1000);
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='row results ola-ripple ptr']"));
		
		
		for (WebElement city : list) 
		{
			
			String opt = city.getText();
			
			System.out.println(opt);
			
			if(opt.contains("Kolhapur"))
			{
				city.click();
				break;
			}
			
		}
		
		System.out.println("----------");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='middle h-full text placeholder']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='addressInput']")).sendKeys("Pune");
		
		Thread.sleep(2000);
		
		List<WebElement> to = driver.findElements(By.xpath("//div[@class='row results ola-ripple ptr']"));
		
		for (WebElement destination : to)
		{
			
			String str = destination.getText();
			
			System.out.println(str);
			
			if(str.contains("Pune"))
			{
				destination.click();
				break;
			}
			
		}
		
		Thread.sleep(1000);
		
		WebElement later = driver.findElement(By.xpath("//select[@class='ola-select']"));
		
		later.click();
		
		Thread.sleep(1000);
		
		later.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(1000);
		
		later.sendKeys(Keys.ENTER);
		
		
		
	}

}
