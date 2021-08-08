package POP_UP;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser_popup 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Thread.sleep(1000);
		
		Set<String> focus = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String> (focus);
		
	//	al.addAll(focus);
		
		driver.switchTo().window(al.get(1));
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		Thread.sleep(1000);
		
		//driver.switchTo().window(al.get(0));
		
		driver.findElement(By.xpath("(//a[@title='YouTube page opens in new window'])[1]")).click();
		
		Thread.sleep(1000);
		
		System.out.println(al.size());
		
		Set<String> focus1 = driver.getWindowHandles();
		
		ArrayList<String> al1 = new ArrayList<String> ();
		
		al1.addAll(focus1);
	
		driver.switchTo().window(al1.get(2));
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//yt-formatted-string[text()='Cancel']")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().window(al1.get(1));
		
	}

}
