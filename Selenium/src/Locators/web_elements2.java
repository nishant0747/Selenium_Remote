package Locators;

import javax.swing.tree.VariableHeightLayoutCache;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_elements2
{
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver d	= new ChromeDriver();
		
		d.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		WebElement img = d.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		System.out.println(img.isEnabled());
		
		System.out.println(img.isDisplayed());
		
		System.out.println(img.isSelected());
		
		Thread.sleep(1000);
		
		d.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement gender = d.findElement(By.xpath("//label[text()='Male']"));
		
		Thread.sleep(1000);
		//gender.click();
		
		System.out.println(gender.isSelected());
		
//		if(gender.isSelected())
//		{
//			System.out.println("Gender id selected");
//		}
//		
//		else
//		{
//			gender.click();
//			
//			if(gender.isSelected())
//			{
//				System.out.println("Gender now selected");
//			}
//			
//			else
//			{
//				System.out.println("Not selecting, it's a defect");
//			}
//			
			
		}
		
		
		
		
		
		
		
		

		
	}


