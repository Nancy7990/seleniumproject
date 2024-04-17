package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boolean {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nains\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		boolean a,b,c;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement po = driver.findElement(By.xpath("//button[@type-'submit']"));
		a = po.isDisplayed();
		b = po.isEnabled();
		System.out.println(a);
		System.out.println(b);
		if(a == true && b == false) {
			WebElement xyz = driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active\"]"));
			xyz.sendKeys("Admin");
			WebElement abc = driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active\"]"));
	        abc.sendKeys("admin123");
	        po.click();		}
		else {
			driver.navigate().refresh();
			Thread.sleep(2000);
			TakesScreenshot TS = (TakesScreenshot)driver;
			Thread.sleep(2000);
			File src = TS.getScreenshotAs(OutputType.FILE);
			File DS = new File("C:\\Users\\nains\\OneDrive\\Desktop.png");
			Thread.sleep(2000);
			FileUtils.copyFile(src , DS);
			System.out.println("Screenshot is caputured");
			
		
			
		}
		
		

	}

}
