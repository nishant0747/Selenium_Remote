package DataDrivenFramework;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenFW 
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, AWTException 
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\SW Testing\\Data driven framework\\Test data.xlsx"); 
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.manage().window().maximize();
		
		
		driver.get("https://kite.zerodha.com/");
		
		WebElement ud = driver.findElement(By.id("userid"));
		
		 String id = sh.getRow(0).getCell(0).getStringCellValue();
		
		ud.sendKeys(id);
		
		WebElement pwd = driver.findElement(By.id("password"));
		
		String pw = sh.getRow(0).getCell(1).getStringCellValue();
		
		pwd.sendKeys(pw);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		
		driver.findElement(By.id("pin")).sendKeys(pin);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[@class='user-id']")).click();
		
		String text = driver.findElement(By.xpath("//h4[@class='username']")).getText();
		
		System.out.println(text);
		
		if(text.contains("Kulkarni"))
		{
			System.out.println("Pass");
		}
		
		else
		{
			System.out.println("Fail");
		}
		
		
	}

}
