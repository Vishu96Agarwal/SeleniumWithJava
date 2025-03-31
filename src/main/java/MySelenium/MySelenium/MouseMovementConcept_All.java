package MySelenium.MySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept_All {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\\\browsers\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		
		Actions action = new Actions(driver);
		
		//Move to Element 
		action.moveToElement(driver.findElement(By.className("menuLink"))).build().perform();
		
        Thread.sleep(3000);
		
		driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Articles']")).click();
		
		// Drag and Drop
		
        driver.get("http://jqueryui.com/droppable/");
        driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.switchTo().frame(0);
		
		action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
		.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
		.release()
		.build()
		.perform();
		
		
	     //Right Click
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement rightClickButton= driver.findElement(By.cssSelector(".context-menu-one"));
		action.contextClick(rightClickButton).build().perform();
		
		WebElement copy=driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		String copyText = copy.getText();
		System.out.println(copyText);
		copy.click();
		//driver.quit();
	}

}
