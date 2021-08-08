package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printColumn2 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(1000);
		
		driver.navigate().to("file:///C:/Users/HP/Desktop/Table.html");
		
		List<WebElement> rowSize = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr"));
		
		int TotalRows = rowSize.size();
		
		System.out.println(TotalRows);
		
		System.out.println("---------");
		
		for(int i=1; i<=TotalRows; i++)
		{
		
			String text = "";
			if(i==1)
			{
				
				text = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr["+i+"]/th[1]")).getText();
			}
			
			else
			{
				text = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr["+i+"]/td[1]")).getText();
			}
			
			System.out.println(text);
			
		}
		
	}

}
