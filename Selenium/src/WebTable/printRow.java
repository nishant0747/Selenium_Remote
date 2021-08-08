package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printRow
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("file:///C:/Users/HP/Desktop/Table.html");
		
		Thread.sleep(1000);
		
		List<WebElement> getrow = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[3]/td"));
		
		for (WebElement print : getrow)
		{
			System.out.print(print.getText()+"   ");
			
		}
		
		
	}

}
