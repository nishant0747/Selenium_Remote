package List_box;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ascending_order
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
		
		List<WebElement> f = s.getOptions();
		
		System.out.println(f.size());
		
		for(WebElement ab:f)
		{
			System.out.println(ab.getText());
			
		}
		
		System.out.println("----------");
		TreeSet tr = new TreeSet();
		
		for (WebElement we : f) 
		{
			
			we.getText();
			
			tr.add(we.getText());
			
		}
		
		for (Object ob: tr) 
		{
			
			System.out.println(ob);
			
		}
		
		System.out.println("-------treeset in descending order.-------");
		Iterator re = tr.descendingIterator();
		
		while(re.hasNext())
		{
			System.out.println(re.next());
		}
		
		
		
		
		
		
		
		
		
	}

}
