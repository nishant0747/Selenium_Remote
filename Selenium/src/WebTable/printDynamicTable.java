package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printDynamicTable 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("file:///C:/Users/HP/Desktop/Table.html");
		
		Thread.sleep(1000);
		
		
		int rowSize = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr")).size();
		
		for(int i=1; i<=rowSize; i++)
		{
			
			int colSize=0;
			
			if(i==1)
			{
				colSize = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr["+i+"]/th")).size();
			}
			else
			{
				colSize = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr["+i+"]/td")).size();
			}
			
			
			for(int j=1; j<=colSize; j++)
			{
				String text ="";
				if(i==1)
				{
					text = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr["+i+"]/th["+j+"]")).getText();
				}
				
				else
				{
					text = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr["+i+"]/td["+j+"]")).getText();

					
				}
				
				System.out.print(text+"   ");
			}
			
			
			
			System.out.println();
			
		}
		
		
		
		
		
	}

}
