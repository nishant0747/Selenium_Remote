package _practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gff
{
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\FRAMEWORK\\Browser\\chromedriver.exe");
		

		ChromeOptions opt = new ChromeOptions();
		
		WebDriver driver = new ChromeDriver(opt);
		
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.atlassian.com/software/jira");
		
		WebElement element = driver.findElement(By.xpath("//a[text()=' Get it free ']"));
		
		WebDriverWait wt = new WebDriverWait(driver, 10);
		
		WebElement ex = wt.until(ExpectedConditions.visibilityOf(element));
		
		ex.click();
		
		
		
	}

}
