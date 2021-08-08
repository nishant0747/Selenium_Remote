package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class way 
{
	
	private static final String TakeS = null;

	public static void main(String[] args) throws InterruptedException, IOException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		
		dr.navigate().to("https://www.bankofindia.co.in/");
		
		Thread.sleep(1000);
		
		dr.navigate().refresh();
		
		Thread.sleep(1000);
		
	//	File i = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		
		
		File f1 = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		
	   String str = RandomString.make(5);
	     
		File f2 = new File("D:\\selenium Screenshot\\boi123"+str+".png");
		
		FileHandler.copy(f1, f2);
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
