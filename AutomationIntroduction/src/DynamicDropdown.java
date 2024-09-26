import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicDropdown {
    public static void main(String[] args) throws InterruptedException {
    	
    	
    	WebDriver driver =new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.agoda.com/en-in/city/boo-se.html?site_id=1922866&tag=caab9e33-71b6-432f-b78e-2a3c7c8f4d80&gad_source=1&device=c&network=g&adid=702684089666&rand=17150802004681001447&expid=&adpos=&aud=kwd-317288092229&gclid=EAIaIQobChMI5NTZm8WciAMVBqpmAh337gEaEAAYASAAEgIjSfD_BwE&pslc=1&ds=ctIUjsG%2BNr9%2FruI%2F");
    	
    	driver.findElement(By.xpath("//input[@aria-label='Enter a destination or property']")).clear();
    	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3000));
    	//wait.until(ExpectedConditions.visibilityOf(null))
    	driver.findElement(By.className("SearchBoxTextEditor--autocomplete")).sendKeys("Ind");
    	
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//li[@data-text='Hyderabad']")).click();
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3000));
    	//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("elementId")));
    	Thread.sleep(2000);
    	driver.findElement(By.cssSelector(".DayPicker-Day--today")).click();
    	
    	
    	//CheckInDate.click();
    	
    	
    

}
}