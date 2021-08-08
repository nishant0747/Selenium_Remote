package StartOfEra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_contain 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.navigate().to("file:///C:/Users/HP/Desktop/Signup.html");
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//input[contains(@id,'123')]")).sendKeys("Manenishant");
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//input[contains(@id,'yyy')]")).sendKeys("tarzan666");

		Thread.sleep(1000);
		
		d.findElement(By.xpath("//input[contains(@id,'xyzabc')]")).sendKeys("ghg@gmail.com");

		Thread.sleep(1000);
		
		d.findElement(By.xpath("//input[contains(@id,'qr')]")).sendKeys("5242003584");
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//input[@type='radio']")).click();
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//a[text()='Flipkart']")).click();

		
		
	}

}
