package _practice

import org.openqa.selenium.Dimension
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class setSize {
	def static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe")
		var WebDriver driver = new ChromeDriver()
		driver.get("https://www.facebook.com/")
		var Dimension d = new Dimension(50, 300)
		driver.manage().window().setSize(d)
		System.out.println(driver.manage().window().getSize())
		System.out.println(driver.manage().window().getPosition())
	}
}
