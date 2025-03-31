package MySelenium.MySelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\browsers\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.facebook.com");
		
		// Dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//get the total count of the links on page
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());
		
		//get the text of each link on page
		for(int i=0; i<linkList.size();i++) {
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
			
			driver.quit();
		}
	}

}
