package MySelenium.MySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main( String[] args )
    {
	System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");

	
//	    1. Find Element by xpath: --2nd priority
//	    absolute xath should not be used. -- html/body/div[1]/div[5]/div[2]/a
//	    only relative xpath should be used. -- //*[@id='firstname']
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Tom");
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Peter");
		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("12, new street");
		
//		2. Find Element by id: --1st priority
		driver.findElement(By.id("firstname")).sendKeys("Tom");
		driver.findElement(By.id("lastname")).sendKeys("Peter");
		
//		3. Find Element by name: --3rd priority
		driver.findElement(By.name("firstname")).sendKeys("Tom");
		driver.findElement(By.name("lastname")).sendKeys("Peter");
		
//		4. Find Element by linkText: Used only for links
		driver.findElement(By.linkText("Sign in")).click();
		
//		5. partiallyLinkText: not useful
		driver.findElement(By.partialLinkText("How to pick")).click();
		
//		6. Find Element by CSSSelector: --2nd priority
//		if id is there: --#{id}
//		if class is there: --.{class}
		driver.findElement(By.cssSelector("#address1")).sendKeys("12 new strt");
		
//		7. Find Element by class name: not useful: --4th priority
		driver.findElement(By.className("ancAsb")).click();
		
		
}
}