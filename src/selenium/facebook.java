package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nains\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement xyz = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		xyz.sendKeys("7078417990");
		WebElement abc = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		abc.sendKeys("Nis98@09");
		WebElement wxy = driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]"));
		wxy.click();
		
	

	}

}
