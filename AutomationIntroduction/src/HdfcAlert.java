import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HdfcAlert {

	public static void main(String[] args) throws InterruptedException {
		
		//***************************For Firefox browser*****************
		/*FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new FirefoxDriver(options);*/
		
		//******************************** For Chrome browser *****************
		
		/*ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);*/
		
		//******************* For Edge Driver ******************************
		
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new EdgeDriver(options);
		
		
		driver.get("https://www.hdfcbank.com/");
	/*	
		driver.manage().window().maximize();
		
		/*driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
				
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000)); 
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.accept();*/
		
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
				
		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000)); 
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
		alert.accept();*/
		
		
		/*driver.get("https://omayo.blogspot.com/");
		//https://www.hdfcbank.com/
		// TODO Auto-generated method stub
		
		
		driver.findElement(By.id("alert1")).click();
		  Alert alert = driver.switchTo().alert();
		  alert.accept();
		/*Thread.sleep(10000);
		driver.switchTo().alert().dismiss();
		*/
		
		/* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000)); // 10 seconds timeout
         wait.until(ExpectedConditions.alertIsPresent());

         Switch to the alert
         Alert alert = driver.switchTo().alert();

         // Interact with the alert (e.g., accept or dismiss it)
         alert.accept();
         */
		
		/*Set<String> windowIds= driver.getWindowHandles();
		for(String windowId: windowIds)
			driver.switchTo().window(windowId);
		{
			if()
		}
		*/
	}

}
