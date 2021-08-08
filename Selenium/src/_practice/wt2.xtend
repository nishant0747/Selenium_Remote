package _practice

import java.util.List
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver

class wt2 {
	def static void main(String[] args) throws InterruptedException {
		System::setProperty("webdriver.chrome.driver",
			"C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe")
		var WebDriver driver = new ChromeDriver()
		driver.get("https://www.ouexams.in/examnotifications")
		Thread::sleep(1000)
		// List<WebElement> size = driver.findElements(By.xpath("//table[@class='mGrid']/tbody/tr"));
		// System.out.println(size.size());
		for (var int i = 1; i <= 102; i++) {
			var String text = ""
			if (i === 1) {
				text = driver.findElement(By::xpath('''//table[@class='mGrid']/tbody/tr[«i»]/th[2]'''.toString)).
					getText()
			} else {
				text = driver.findElement(By::xpath('''//table[@class='mGrid']/tbody/tr[«i»]/td[2]'''.toString)).
					getText()
			}
			System::out.println(text)
		}
	}
}
