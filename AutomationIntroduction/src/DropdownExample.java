import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the WebDriver executable (e.g., chromedriver)
       // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open the webpage with the dropdown
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // Replace with your URL

        // Locate the dropdown element
        WebElement dropdownElement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); // Replace with the actual ID

        // Initialize the Select class with the dropdown element
        Select dropdown = new Select(dropdownElement);

        // 1. Select an option by visible text
        dropdown.selectByVisibleText("AED"); // Replace with the visible text of the option

        // 2. Select an option by value
        dropdown.selectByValue("USD"); // Replace with the value attribute of the option

        // 3. Select an option by index
        dropdown.selectByIndex(1); // Replace with the index of the option (0-based index)

        // 4. Get the selected option
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        System.out.println("Selected option: " + selectedOption.getText());
        
        
         List<WebElement> allOptions=  dropdown.getOptions();
        // 5. Get all options in the dropdown
        for(WebElement option: allOptions) {
        	System.out.println(option.getText());
        }
        
        driver.findElement(By.className("paxinfo")).click();
        Thread.sleep(2000);
        
        
        driver.findElements(By.id("hrefIncAdt"));
        int i,j=0;
        for(i=1,j=0;i<4;i++) {
        	driver.findElement(By.id("hrefIncAdt")).click();
        
        }
        for (j=1;j<3;j++) {
        	driver.findElement(By.id("hrefIncChd")).click();
        	
        }
        
        driver.findElement(By.id("btnclosepaxoption")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
       // driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("HYD");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
        
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
       // driver.findElement(By.className("ui-datepicker-trigger")).sendKeys("05/09");
        
      // driver.findElement(By.xpath("//div[id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
    }
    
   
}
