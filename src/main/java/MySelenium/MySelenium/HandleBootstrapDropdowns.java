package MySelenium.MySelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootstrapDropdowns {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\\\browsers\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		// Dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("dropdownMenuButton")).click();
	    List<WebElement> list	=driver.findElements(By.xpath("//div(contains(@class,'dropdown-menu'))//a"));
	    
	    System.out.println(list.size());
	}

}
