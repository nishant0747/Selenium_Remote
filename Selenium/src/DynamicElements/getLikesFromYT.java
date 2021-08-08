package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLikesFromYT 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(1000);
		
		WebElement google = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		
		google.sendKeys("youtube");
		
		Thread.sleep(1000);
		
		google.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(1000);
		
		google.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//h3[text()='YouTube'])[1]")).click();
		
		WebElement song = driver.findElement(By.xpath("//input[@id='search']"));
		
		song.sendKeys("nira ishq");
		
		Thread.sleep(3000);
		
		song.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(1000);
		
		song.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
		
		Thread.sleep(10000);
		
		WebElement likes = driver.findElement(By.xpath("//yt-formatted-string[text()='3M']"));
	
		System.out.println(likes.getText());
		
		
		
	}

}
