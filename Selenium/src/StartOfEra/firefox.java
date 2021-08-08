package StartOfEra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox 

{
	
	public static void main(String[] args) throws InterruptedException 
	{
		String expected = "Road Transport ";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		
		FirefoxDriver d = new FirefoxDriver(); //upcasting
		
		d.get("https://parivahan.gov.in/parivahan/");
		
		Thread.sleep(2000);
		
		String actual = d.getTitle(); //String return 
		
		System.out.println(actual);
		
		if(actual.contains(expected))
		{System.out.println("Passed");}
		else
		{System.out.println("failed");}
		
		d.quit();
		
	}

}
