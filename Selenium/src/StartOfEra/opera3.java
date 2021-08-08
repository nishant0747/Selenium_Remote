package StartOfEra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class opera3 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.opera.driver", "C:\\Users\\HP\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		
		WebDriver dr = new OperaDriver();
		
		dr.get("https://www.facebook.com");
		
		dr.manage().window().maximize();
		
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Nishant");
		
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Mane");
		
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//input[contains(@id,'u_1_g_d0')]")).sendKeys("nsm@gmail.com");
		
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys("hfhfvhfvjej");
		
		
		
		
		
		
		
		
		
		
		
	}

}
