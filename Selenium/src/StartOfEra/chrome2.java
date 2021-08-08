package StartOfEra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome2 

{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver d	= new ChromeDriver();
		
		//d.get("https://kite.zerodha.com/");
		
		//instead of get function we can use navigate.
		d.navigate().to("https://kite.zerodha.com/"); 
		
		Thread.sleep(2000);
		
		d.navigate().to("https://www.google.com/");
		
		Thread.sleep(2000);
		
		//we can perform forward,backward,refresh operations by using navigate
		d.navigate().back(); 
		
		Thread.sleep(2000);
		
		d.navigate().refresh();
		
		Thread.sleep(2000);
		
		d.navigate().forward();
		
		
		d.manage().window().maximize(); //to maximize the window
		
	}

}
