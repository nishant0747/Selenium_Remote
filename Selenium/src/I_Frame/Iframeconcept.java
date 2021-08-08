package I_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

public class Iframeconcept 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver d	= new ChromeDriver();
		
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(1000);
		
		d.switchTo().frame("iframeResult");

		d.findElement(By.xpath("//button[contains(text(),'me to')]")).click();
		
		 d.switchTo().parentFrame();
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		
		
	}
	

}
