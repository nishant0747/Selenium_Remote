package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(1000);
		
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		Actions act = new Actions(driver);
		
		//act.dragAndDrop(source, dest).perform(); //In one line
		
		act.clickAndHold(source).release(dest).perform();
		
	
		
	}

}
