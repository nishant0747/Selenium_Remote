package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBox1 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Desktop/CheckBoxes.html");
		
		Thread.sleep(1000);
		
		List<WebElement> AllCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(AllCheckbox.size());
		
		for(WebElement checkbox:AllCheckbox)
		{
			checkbox.click();
			
			Thread.sleep(500);
		}
		
	}

}
