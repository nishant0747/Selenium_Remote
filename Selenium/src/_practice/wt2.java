package _practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wt2 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ouexams.in/examnotifications");
		
		Thread.sleep(1000);
		
	//	List<WebElement> size = driver.findElements(By.xpath("//table[@class='mGrid']/tbody/tr"));
		
	//	System.out.println(size.size());
		
		for(int i=1; i<=102; i++)
		{
			String text="";
			if(i==1)
			{
				text = driver.findElement(By.xpath("//table[@class='mGrid']/tbody/tr["+i+"]/th[2]")).getText();
			}
			
			else
			{
				 text = driver.findElement(By.xpath("//table[@class='mGrid']/tbody/tr["+i+"]/td[2]")).getText();
				
			}
			
			System.out.println(text);
			
		}
		
		
		
		
		

		
	}

}
