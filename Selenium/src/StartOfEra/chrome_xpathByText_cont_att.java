package StartOfEra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_xpathByText_cont_att

{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.navigate().to("file:///C:/Users/HP/Desktop/login.html");
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("nishant666");
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//input[contains(@id,'xyz789')]")).sendKeys("8308975184");
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("jfjjnjkwk");
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//input[@type='button']")).click();
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//a[text()='amazon']")).click();

		
		
		
		
		
	}

}
