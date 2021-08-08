package List_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_class 
{
	
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		
		WebElement new_acc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		new_acc.click();
		
		Thread.sleep(1000);
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select s1 = new Select(day);
		
		s1.selectByValue("16");
		
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s2 = new Select(month);
		
		s2.selectByValue("8");
		
		Thread.sleep(1000);
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		Select s3 = new Select(year);
		
		s3.selectByVisibleText("1996");
		
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sumit");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("lastname")).sendKeys("Salvi");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("kdym@gmail.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("hwrfi984r");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kdym@gmail.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("websubmit")).click();
		
		
	}

}
