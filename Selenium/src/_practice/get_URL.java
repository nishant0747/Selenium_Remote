package _practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_URL 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/gp/customer-reviews/RXKJ7XOL5UJZY?ASIN=B007Z9K45U");
		
		Thread.sleep(2000);
		
		// System.out.println(driver.getCurrentUrl());
		
	//	System.out.println(driver.getPageSource());
		
		
		
		
	}

}
