package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printColumn1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("file:///C:/Users/HP/Desktop/Table.html");
		
		Thread.sleep(1000);
		
		List<WebElement> getcolumn = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr/td[1]"));
		
		WebElement SrNo = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr[1]/th[1]"));
		
		System.out.println(getcolumn.size());
		
		System.out.println("--------");
		
		System.out.println(SrNo.getText());
		
		for(int i=0; i<=getcolumn.size()-1; i++)
		{
			System.out.println(getcolumn.get(i).getText());
		}
		
		
	}

}
