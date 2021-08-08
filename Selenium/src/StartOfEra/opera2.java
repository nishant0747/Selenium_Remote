package StartOfEra;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class opera2

{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.opera.driver", "C:\\Users\\HP\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		
		OperaDriver op = new OperaDriver();
	
		System.out.println(op.manage().window().getSize());
		
		Thread.sleep(2000);
		
		op.manage().window().maximize();
		
		System.out.println(op.manage().window().getSize());
		
		Thread.sleep(2000);
		
		Dimension xy = new Dimension(517, 427);
		op.manage().window().setSize(xy);
		
		System.out.println(op.manage().window().getSize());
		
		Thread.sleep(2000);
		
		Point yb = new Point(-25, -100);
		
		op.manage().window().setPosition(yb);
		
		System.out.println(op.manage().window().getPosition());

	}

}
