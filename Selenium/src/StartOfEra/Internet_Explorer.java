package StartOfEra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internet_Explorer
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\HP\\Downloads\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		WebDriver IE = new InternetExplorerDriver();
		IE.get("https://www.booking.com/index.html?aid=1535084&label=enin-prime-hp-me");
		
	}

}
