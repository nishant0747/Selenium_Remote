package List_box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_class1 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		
		Thread.sleep(1000);
		
		WebElement w = driver.findElement(By.id("month"));
		
	
	
		Select s = new Select(w);
		

		
	//	s.selectByVisibleText("Aug");
		
		List<WebElement> f = s.getOptions(); // all options in the listbox get stored in f reference variable.
		
	    
		
	//	System.out.println(f.size()); // used to get size of the listbox
		
	/*	for (WebElement we : f) 
		{
			
			System.out.println(we.getText());
			
		}
		
		for(int i=0; i<=f.size()-1; i++)
		{
			 WebElement x = f.get(i);
			 
			 String y = x.getText();
			 
			 System.out.println(y);
		}
		
		for(int i=0; i<=f.size()-1; i++)
		{
			WebElement x = f.get(i);
			
			System.out.println(x.getText());
		}  */
		
		for(int i=0; i<=f.size()-1; i++)
		{
			
			//System.out.println(f.get(i).getText());
			
			WebElement d = f.get(i);
			System.out.println(d);
			
			
		}

		
		
		
		
		
	}

}
