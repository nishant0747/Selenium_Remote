package StartOfEra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_login_to_my_fb 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver d	= new ChromeDriver();
		
		d.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("8308975184");
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("tarzan895");
		
		Thread.sleep(2000);
		
//		d.findElement(By.xpath("//input[@type='text']")).sendKeys("nsm456@gmail.com");
//		
//		Thread.sleep(2000);
//		
//		d.findElement(By.xpath("//input[@type='text']")).sendKeys("8308975184");
//		
//		Thread.sleep(2000);
		
		d.findElement(By.xpath("//button[@value='1']")).click();
	}

}
