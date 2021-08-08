package StartOfEra;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome3 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver d	= new ChromeDriver();
		
		d.navigate().to("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_Cj0KCQiA1KiBBhCcARIsAPWqoSr6k21-gS-FMQ-1G09_pA8w8JYMUE5Dv8EQP0yfRGz0-rUaY4F6AqgaAniwEALw_wcB_k_&ext_vrnc=hi&gclid=Cj0KCQiA1KiBBhCcARIsAPWqoSr6k21-gS-FMQ-1G09_pA8w8JYMUE5Dv8EQP0yfRGz0-rUaY4F6AqgaAniwEALw_wcB");
		
		Dimension dm = new Dimension(301, 300);
		
     	d.manage().window().setSize(dm);
     	
     	System.out.println(d.manage().window().getSize());
     	
     	d.manage().window().maximize();
     
     	System.out.println(d.manage().window().getSize());
     	
	}

}
