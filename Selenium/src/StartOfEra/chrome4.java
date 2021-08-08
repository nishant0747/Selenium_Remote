package StartOfEra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome4 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver d	= new ChromeDriver();
		
		d.navigate().to("https://www.facebook.com/");
        d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Nishant");
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Mane");
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("nsm@gmail.com");
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("nsm@gmail.com");
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[contains(@autocomplete,'new-password')]")).sendKeys("hfhfvhfvjej");
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		
		Thread.sleep(2000);

		d.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		
		
		
	}

}
