package _practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get 

{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
     	WebDriver driver = new ChromeDriver();
     	
     	driver.navigate().to("https://www.cowin.gov.in/home");
     	
     	Thread.sleep(1000);
     	
     	driver.navigate().refresh();
     	
     	Thread.sleep(3000);
     	
     	driver.findElement(By.partialLinkText("Register Yourself")).click();
     	
     	Thread.sleep(1000);

     	Set<String> childP = driver.getWindowHandles();
     	
     	ArrayList<String> al = new ArrayList<String>(childP);
     	
     	 String cld = al.get(1);
     	
     	driver.switchTo().window(cld);
     	
     	Thread.sleep(1000);
     	
     	driver.findElement(By.id("mat-input-0")).sendKeys("8308975185");
     	
     	Thread.sleep(1000);
     	
     	driver.findElement(By.xpath("//ion-button[@type='button']")).click();
     	
     	Thread.sleep(1000);
     	
     	driver.findElement(By.xpath("//ion-button[@type='button']")).click();
     	
     
     	
     	
     	
     	
		
	}

}
