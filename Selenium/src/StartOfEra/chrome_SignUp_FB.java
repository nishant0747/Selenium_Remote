package StartOfEra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_SignUp_FB 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver d	= new ChromeDriver();
		
        d.navigate().to("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C355887219764%7Ce%7Cnew%20facebook%20account%7C&placement=&creative=355887219764&keyword=new%20facebook%20account&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066386563%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-298448040676%26loc_physical_ms%3D1007789%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiAvbiBBhD-ARIsAGM48bzuiFbXIynPZHIb69C6BtzHI4sZ-jupx7ngjMEWz9hA-KZa1iX2yYsaArZ3EALw_wcB");
        
        Thread.sleep(1000);
        
        d.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Tarzan");
       
        Thread.sleep(1000);
       
        d.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mane");
        
        Thread.sleep(1000);
        
        d.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8308975184");

        Thread.sleep(1000);
        
        d.findElement(By.xpath("//input[@data-type='password']")).sendKeys("selenium123");

        Thread.sleep(1000);
        
        d.findElement(By.xpath("//input[@value='2']")).click();
        
        Thread.sleep(1000);
        
        d.findElement(By.xpath("//button[@type='submit']")).click();
        
        
        
         

        
        
        
        
	}

}
