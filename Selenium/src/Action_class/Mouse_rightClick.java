package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_rightClick 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		Thread.sleep(1000);
		
		WebElement more = driver.findElement(By.xpath("//div[@class='exehdJ']"));
		
		
		Actions act = new Actions(driver);
		
		act.moveToElement(more).perform();
		
		Thread.sleep(1000);
		
		//act.moveToElement(more).contextClick().build().perform(); //in one line
		
		act.contextClick(more).perform(); //in one line
		
		act.contextClick().perform();
		
	}

}
