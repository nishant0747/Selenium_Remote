package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_elements1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver d	= new ChromeDriver();
		
		d.navigate().to("https://twitter.com/?logout=1614161921010");
		
		Dimension size = d.manage().window().getSize();
		
		Thread.sleep(1000);
		
		d.navigate().refresh();
		
		Thread.sleep(1000);
		
		WebElement s1 = d.findElement(By.xpath("//span[contains(text(),'Sign up')]"));
		

		s1.click();
		Thread.sleep(1000);
		
		WebElement s2 = d.findElement(By.xpath("//input[@name='name']"));
		
		s2.sendKeys("Mane");
		
		Thread.sleep(1000);
		
		s2.clear();
		
		Thread.sleep(1000);
		
		s2.sendKeys("Nishant Mane");
		
		Thread.sleep(1000);
		
		WebElement s3 = d.findElement(By.xpath("//input[contains(@name,'phone_number')]"));
		s3.sendKeys("7709994094");
		
		Thread.sleep(1000);
		
		s3.clear();
		
		Thread.sleep(1000);
		
		s3.sendKeys("9834183766");
		
		Thread.sleep(1000);
		
		WebElement s4 = d.findElement(By.xpath("//select[@id='Day']"));
		s4.sendKeys("16");
		 
		Thread.sleep(1000);
		
		WebElement s5 = d.findElement(By.xpath("//select[@id='Year']"));
		s5.sendKeys("1996");
		
		Thread.sleep(1000);
		
		WebElement s6 = d.findElement(By.xpath("//select[@id='Month']"));
		s6.sendKeys("August");
		
		Thread.sleep(1000);
		
		
		WebElement s7 = d.findElement(By.xpath("//span[text()='Next']"));
		s7.click();
		
		
//		if(s6.isEnabled())
//		{
//			System.out.println("Proceed to next step");
//		}
//		
//		else
//		{
//			System.out.println("please fill all inputs");
//		}
//
//		
		
		
	}
	

}
