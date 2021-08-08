package StartOfEra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class _opera
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.opera.driver", "C:\\Users\\HP\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		
		WebDriver op = new OperaDriver();
		
		
		op.navigate().to("https://www.booking.com/dealspage.html?aid=348297;campaign_id=early20&label=early2020");
		
		Thread.sleep(2000);
		
		op.navigate().to("https://www.instagram.com");
		
		Thread.sleep(2000);
		
		op.navigate().back();
		
		Thread.sleep(1000);
		
		op.navigate().refresh();
		
		Thread.sleep(2000);
		
		op.navigate().forward();
		
		op.manage().window().maximize();
		
		Thread.sleep(2000);
		
		op.close();
		
		
	}

}
