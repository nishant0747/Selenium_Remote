package _practice

import java.util.ArrayList
import java.util.Set
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class childpopup {
	def static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe")
		var WebDriver driver = new ChromeDriver()
		driver.navigate().to("https://skpatro.github.io/demo/links/")
		Thread.sleep(1000)
		driver.findElement(By.xpath("//input[@name='NewTab']")).click()
		Thread.sleep(1000)
		var Set<String> focus = driver.getWindowHandles()
		var ArrayList<String> al = new ArrayList<String>()
		al.addAll(focus)
		driver.switchTo().window(al.get(1))
		Thread.sleep(1000)
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click()
		Thread.sleep(1000)
		driver.close()
		Thread.sleep(1000)
		driver.switchTo().window(al.get(0))
		Thread.sleep(1000)
		driver.findElement(By.name("NewWindow")).click()
	}
}
