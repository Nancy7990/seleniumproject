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

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\nains\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
    	WebElement un = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		un.sendKeys("Admin");
		WebElement pwd = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		pwd.sendKeys("admin123");
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
        btn.click();
        Thread.sleep(2000);
		WebElement we4 = driver.findElement(By.xpath("//a[@href='/web/index.php/buzz/viewBuzz']"));
		we4.click();
		Thread.sleep(5000);
		WebElement we5 = driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
	    we5.sendKeys("Thank you");
	    Thread.sleep(1000);
		WebElement we6 = driver.findElement(By.xpath("//button[@type='submit']"));
		we6.click();
	   

	}

	}
