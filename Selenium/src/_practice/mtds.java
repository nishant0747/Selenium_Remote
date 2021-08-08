package _practice;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mtds 
{
	
	public static void main(String[] args) throws InterruptedException
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver d	= new ChromeDriver();
		
		d.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
//		Point sp = new 
//		
//		d.manage().window().setPosition(sp);
//		
//		
		
		
		
	}

}
