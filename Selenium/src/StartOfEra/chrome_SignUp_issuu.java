package StartOfEra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_SignUp_issuu 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver d	= new ChromeDriver();
		
        d.navigate().to("https://issuu.com/signup");
        
        Thread.sleep(1000);
        
        d.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Nishant");
        
        Thread.sleep(1000);
        
        d.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Mane");
        
        Thread.sleep(1000);
        
        d.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys("nishantmane895@gmail.com");
		
        Thread.sleep(1000);
        
        d.findElement(By.xpath("//input[@type='password']")).sendKeys("T@rzan4040");
        
        Thread.sleep(1000);
        
        d.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("nishant747");
        
        Thread.sleep(1000);
        
        d.findElement(By.xpath("//input[@data-testid='terms']")).click();
        
        Thread.sleep(1000);
        
        d.findElement(By.xpath("//button[@style='margin-top:12px']")).click();        
        
        
	}

}
