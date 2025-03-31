package MySelenium.MySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class WebDriverBasics 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://workspace.google.com/intl/en-US/gmail");
    	driver.manage().window().maximize();
    	driver.findElement(By.linkText("Sign in")).click();
    	
        String title = driver.getTitle();
        System.out.println( "Hello World!" );
        System.out.println(title);
        
        
        // Validation Point
        if(title.equals("Gmail")){
        	System.out.println("Title is correct");
        }
        else
        {
        	System.out.println("Title is incorrect");
        }
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
