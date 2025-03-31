package MySelenium.MySelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\browsers\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/");
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	Thread.sleep(3000);
	
	driver.switchTo().frame("mainframe");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	}

}
