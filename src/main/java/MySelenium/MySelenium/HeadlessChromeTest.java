package MySelenium.MySelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\\\browsers\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("window-size=2400,800");
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.freecrm.com");
		
		// Dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Home page title=" +driver.getTitle());
	}

}
