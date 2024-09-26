import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;


public class MyTestAssert {
    
 
	public static void main(String[] args) {
        // Set up the ChromeDriver
        //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the website
        driver.get("https://www.americanexpress.com/us/credit-cards/");
        
        // Get the title of the page
        String pageTitle = driver.getTitle();
        
        // Assert that the title is correct
        Assert.assertEquals("Credit Cards - Compare & Apply Online | American Express", pageTitle);
        
        // Close the browser
        driver.quit();
    }
}