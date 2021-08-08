package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyDataIndexTable 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		String exp = "Mumbai";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Desktop/Table.html");
		
		Thread.sleep(1000);
		
		for(int i=2; i<=6; i++)
		{
			for(int j=1; j<=3; j++)
			{
				String act = driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]")).getText();
			
				if(act.equalsIgnoreCase(exp))
				{
					System.out.println(exp +" is present in table at index : "+i+ "," +j);
				}
				
//				if(!act.equalsIgnoreCase(exp))
//				{
//					System.out.println("Expexted result is not present in table");
//					break;
//				}
				
			
			
			}
		}
		
	}

}
