package _practice

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class getTextfromfb {
	def static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe")
		var WebDriver driver = new ChromeDriver()
		driver.navigate().to("https://www.facebook.com/")
		Thread.sleep(1000)
		var String text = driver.findElement(By.xpath("(//a[@role='button'])[2]")).getText()
		System.out.println(text)
	}
}
