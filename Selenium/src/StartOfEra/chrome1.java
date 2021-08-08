package StartOfEra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import d.getTitle;

public class chrome1
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		String expected = "Kite";
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
	
	WebDriver d	= new ChromeDriver();
	
	d.get("https://kite.zerodha.com/");
	
	Thread.sleep(5000);//thread sleep defines time for which browser remain open.
	
	//d.quit(); //It is used to close the whole browser.
	
     String actual = d.getTitle();  //getTitle returns string in console 
    
     System.out.println(actual);
     
     
     if(actual.contains(expected))
     {
    	 System.out.println("Pass");
     }
     else
     {
    	 System.out.println("Fails");
     }
 	
     d.close(); //It closes current tab in a browser.
	
	}
	
}
