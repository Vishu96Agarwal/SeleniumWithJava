package MySelenium.MySelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropboxHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\browsers\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		// Dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

	    List<WebElement> list =	driver.findElements(By.xpath("//ul[contains(@class,'multiselect-containe')]//li//a//label"));
	
	    System.out.println(list.size());
	    
	    // Selecting all checkboxes
	    for(int i=0;i<list.size();i++) {
	    	System.out.println(list.get(i).getText());
	    		list.get(i).click();
	    }
	    
	    // Selecting Angular
	    for(int i=0;i<list.size();i++) {
	    	System.out.println(list.get(i).getText());
           if(list.get(i).getText().contains("Angular")) {
	    		list.get(i).click();
	    		break;
	    	}
	    }
	
	}

}
