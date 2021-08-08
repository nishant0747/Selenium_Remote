package POP_UP;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_popup 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
		
	
			TargetLocator switch_focus = driver.switchTo();
			
			Alert al = switch_focus.alert();
			
			Thread.sleep(1000);
			
			System.out.println(al.getText());
			
			Thread.sleep(1000);
			
			al.accept();
			
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
		
		Thread.sleep(1000);
		
		Alert second_alert = driver.switchTo().alert();
		
		System.out.println(second_alert.getText());
		
		Thread.sleep(1000);
		
		second_alert.dismiss();
		
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
		
		Thread.sleep(1000);
		
		Alert third_alert = driver.switchTo().alert();
		
		String str = third_alert.getText();
		
		System.out.println(str);
		
		third_alert.sendKeys("Nishant Mane");
		
		Thread.sleep(1000);
		
		third_alert.accept();
		
		
				
		
		
		
		
		
		
		
		
		
	}

}
