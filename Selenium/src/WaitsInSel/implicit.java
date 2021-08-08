package WaitsInSel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicit 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://twitter.com/login");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@dir='auto'])[5]")));
		
		driver.findElement(By.xpath("(//div[@dir='auto'])[5]")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sdfww");
		
		driver.findElement(By.xpath("(//input[@autocorrect='off'])[2]")).sendKeys("sdfww");
		
		Thread.sleep(11000);
		
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@dir='auto'])[5]")));
		
		driver.findElement(By.xpath("(//div[@dir='auto'])[5]")).click();
		
		
	}

}
