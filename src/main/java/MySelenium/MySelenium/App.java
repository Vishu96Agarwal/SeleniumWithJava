package MySelenium.MySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://workspace.google.com/intl/en-US/gmail");
    	driver.manage().window().maximize();
    	driver.findElement(By.linkText("Sign in")).click();
//    	driver.quit();
    
        System.out.println( "Hello World!" );
    }
}
