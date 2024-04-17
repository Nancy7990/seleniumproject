package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nains\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String parentwind = driver.getWindowHandle();
		System.out.println("parentwind");
		Set<String> allWid = driver.getWindowHandles();
		System.out.println("allwid");
		WebElement insta = driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
		insta.click();
	}

}
