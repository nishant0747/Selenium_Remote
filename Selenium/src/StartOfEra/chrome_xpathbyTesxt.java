package StartOfEra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_xpathbyTesxt 

{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.navigate().to("file:///C:/Users/HP/Desktop/XpathbyText.html");
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//a[text()='Facebook']")).click();
		
		Thread.sleep(1000);
		
		d.navigate().back();
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//a[text()='Instagram']")).click();
		
		Thread.sleep(3000);
		
		d.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
