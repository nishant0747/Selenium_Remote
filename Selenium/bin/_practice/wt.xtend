package _practice

import java.util.List
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver

class wt {
	def static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe")
		var WebDriver driver = new ChromeDriver()
		driver.get("https://www.ouexams.in/examnotifications")
		Thread.sleep(1000)
		var List<WebElement> size = driver.findElements(By.xpath("//table[@class='mGrid']/tbody/tr[1]/th"))
		System.out.println(size.size())
		for (WebElement g : size) {
			System.out.print('''«g.getText()»  ''')
			Thread.sleep(1000)
		}
	}
}
