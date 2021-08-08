package POP_UP;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class concept 

{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver d	= new ChromeDriver();
		
		d.navigate().to("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Thread.sleep(3000);
		
		Set<String> focus = d.getWindowHandles();
		
		 ArrayList<String> al = new ArrayList<String>(focus);
		 
		 System.out.println(al.size());
		 
		 String wn = al.get(1);
		 
		 d.switchTo().window(wn);
		 
		 Thread.sleep(1000);
		 
		 d.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		 
		
		 
		 //WebElement more = d.findElement(By.xpath("(//span[text()='More'])[1]"));
		 

		   
		//  Thread.sleep(1000);
		   
		//  d.findElement(By.xpath("(//span[text()='TestingBasics'])[1]")).click();   
		   
		 /*  Thread.sleep(1000);
		   
		   Select s = new Select(more);
		   
		   s.deselectAll();
		   
		   s.selectByVisibleText("TESTINGBASICS");*/
		
		
	}

}
