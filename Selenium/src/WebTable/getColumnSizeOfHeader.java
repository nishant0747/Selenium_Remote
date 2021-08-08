package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getColumnSizeOfHeader 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("file:///C:/Users/HP/Desktop/Table.html");
		
		Thread.sleep(500);
		
		List<WebElement> TotalColumns = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[1]/th"));
		
		System.out.println(TotalColumns.size());
		
		
	}

}
