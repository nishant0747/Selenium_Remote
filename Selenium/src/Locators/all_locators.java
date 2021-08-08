package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_locators
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver d	= new ChromeDriver();
		
		d.navigate().to("file:///C:/Users/HP/Desktop/Signup.html");
		
		Thread.sleep(1000);
		
		d.navigate().refresh();
		
		Thread.sleep(1000);
		
		d.findElement(By.tagName("input")).sendKeys("nick");
		
		Thread.sleep(1000);
		
		d.findElement(By.id("xxxyyy")).sendKeys("rththehh");
		
		Thread.sleep(1000);
		
		d.findElement(By.className("mumbai")).sendKeys("qwd@yahoomail");
		
		Thread.sleep(1000);
		
		d.findElement(By.name("velocity")).sendKeys("5542545241414");
		
		Thread.sleep(1000);
		
		d.findElement(By.partialLinkText("kart")).click();
		
		Thread.sleep(1000);
		
		d.navigate().back();
		
		Thread.sleep(1000);
		
		d.findElement(By.linkText("Amazon")).click();
		
	}
}
