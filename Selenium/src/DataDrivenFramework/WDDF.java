package DataDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WDDF
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		WebElement ud = driver.findElement(By.id("userid"));
		
		ud.sendKeys("DV1510");
		
		String att = ud.getAttribute("value");
		
		System.out.println(att);
		
		WebElement pwd = driver.findElement(By.id("password"));
		
		pwd.sendKeys("Vijay@123");
		
		String att1 = pwd.getAttribute("value");
		
		System.out.println(att1);
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.id("pin")).sendKeys("959594");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		//driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//span[@class='user-id']")).click();
		
		String text = driver.findElement(By.xpath("//h4[@class='username']")).getText();
		
		System.out.println(text);
		
		if(text.contains("Kulkarni"))
		{
			System.out.println("Pass");
		}
		
		else
		{
			System.out.println("Fail");
		}
		
	}

}
