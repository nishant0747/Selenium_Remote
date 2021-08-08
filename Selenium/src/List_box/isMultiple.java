package List_box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiple 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement w = driver.findElement(By.name("birthday_year"));
		
		Select s = new Select(w);
		
		boolean ml = s.isMultiple(); //boolean return for isMultiple function
		
		System.out.println(ml);
		
		if(ml==true)
		{
			System.out.println("Listbox is multi-selectable");
		}
		
		else
		{
			System.out.println("Listbox is single-selectable");
		}
		
		s.selectByVisibleText("1996");
		
		 WebElement fs = s.getFirstSelectedOption();
		 
		String dd = fs.getText();
		
		System.out.println(dd);
		
          System.out.println("----getting all options-----");
          
         List<WebElement> as = s.getOptions();
         
         
    /*     for (WebElement webel : as) 
         {
        	 
        	String str = webel.getText();
        	
        	System.out.println(str);
			
		 }*/
         
         for(int i=0; i<=as.size()-1; i++)
         {
        	 System.out.println(as.get(i).getText());
        	 
         }
         
         
         System.out.println("----getting all selected options-----");
        //this is useful for multi selectable list
         
         
        List<WebElement> es = s.getAllSelectedOptions();
         
         for(WebElement cd:es)
         {
        	 System.out.println(cd.getText());
         }
		
		 
		
		
	
		
		
		
	}

}
