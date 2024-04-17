package selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMBuzz  {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nains\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromeDriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(5000);
        WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
        uname.sendKeys("Admin");
        WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
        pwd.sendKeys("admin123");
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Thread.sleep(5000);
//        driver.navigate().back();
//        Thread.sleep(5000);
        WebElement buzz = driver.findElement(By.xpath("//a[@href='/web/index.php/buzz/viewBuzz']"));
        buzz.click();
        Thread.sleep(5000);
        WebElement post = driver.findElement(By.xpath("//textarea[@class='oxd-buzz-post-input']"));
        post.sendKeys("Nainsi Mishra");
        WebElement po = driver.findElement(By.xpath("//button[@type='submit']"));
        po.click();
        Thread.sleep(5000);
        Alert a = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(a.getText());
	}

}
