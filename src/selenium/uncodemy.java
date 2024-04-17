package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uncodemy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nains\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uncodemy.com/");
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement abc = driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
		a.moveToElement(abc).perform();
		Thread.sleep(5000);
		WebElement bcd = driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Software Testing']"));
		bcd.click();
		WebElement dca = driver.findElement(By.xpath("//a[@class='has'][normalize-space()='Software Testing']"));
		dca.click();
		a.moveToElement(dca).perform();
		Thread.sleep(1000);
		
		

	}

}
