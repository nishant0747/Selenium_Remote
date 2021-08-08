package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRowSizeOfTable 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Desktop/Table.html");
		
		Thread.sleep(1000);
		
		List<WebElement> TotalRows = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr"));
		
		System.out.println(TotalRows.size());
		
	}

}
