package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRatingsfromFlipkart 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(1000);
		
	    WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
	    
	    textbox.sendKeys("flip");
	    
	    Thread.sleep(2000);
	    
	    textbox.sendKeys(Keys.ARROW_DOWN);
	    
	    Thread.sleep(1000);
	    
	    textbox.sendKeys(Keys.ENTER);
	    
	    Thread.sleep(1000);
	    
	   driver.findElement(By.xpath("//h3[text()='Flipkart']")).click();
	   
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi note 8");
	   
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	   
	   Thread.sleep(1000);
	   
	   String ratings = driver.findElement(By.xpath("(//div[@class='col col-7-12']//span)[4]")).getText();
	   
		System.out.println(ratings);
	}

}
