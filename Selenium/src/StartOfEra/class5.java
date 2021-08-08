package StartOfEra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class class5 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver d	= new ChromeDriver();
		
		d.navigate().to("https://www.facebook.com/");
		
		d.navigate().forward();
	
		
		d.navigate().refresh();
		
		Thread.sleep(1000);
        
		d.manage().window().maximize();
        
        Thread.sleep(1000);
     
        d.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
        Thread.sleep(1000);
		
		d.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Shubham");
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Mohite");
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("sm@gmail.com");
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("dffwfrgq");
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("sm@gmail.com");
		
		Thread.sleep(1000);
		d.findElement(By.xpath("//select[@title='Day']")).click();
		d.findElement(By.xpath("//select[@title='Day']")).sendKeys("_1");
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Aug");
		Thread.sleep(1000);
		d.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1996");
		Thread.sleep(1000);
		d.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
	}
	

}
