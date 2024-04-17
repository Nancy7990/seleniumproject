package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class firstcryAC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nains\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.get("https://firstcrystore.in/");
		Thread.sleep(2000);
		WebElement Account = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[3]/ul/a[1]"));
		Account.click();
		Thread.sleep(1000);
		WebElement CA = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div/span/a"));
		CA.click();
		WebElement FN = driver.findElement(By.xpath("//input[@name='firstname']"));
		FN.sendKeys("Nainsi");
		WebElement LN = driver.findElement(By.xpath("//input[@name='lastname']"));
		LN.sendKeys("Mishra");
		WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
		Email.sendKeys("nainshim47@gmail.com");
		WebElement PWD = driver.findElement(By.xpath("//input[@name='password']"));
		PWD.sendKeys("123456789");
		WebElement CPWD = driver.findElement(By.xpath("//input[@name='confirmpassword']"));
		CPWD.sendKeys("123456789");
		Thread.sleep(2000);
		WebElement Signin = driver.findElement(By.xpath("//button[@type='submit-btn']"));
//		action.moveToElement(Signin).click().perform();
		Signin.click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		

	
		
		
		

	}

}
