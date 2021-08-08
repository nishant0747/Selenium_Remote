package StartOfEra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_login_to_my_insta
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver d	= new ChromeDriver();
		
        d.navigate().to("https://www.instagram.com/");		
        
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("nishant__96k");
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("tarzan895");
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//div[@class='                     Igw0E     IwRSH      eGOV_         _4EzTm                                                                                                              ']")).click();

		
		
		
	}

}
