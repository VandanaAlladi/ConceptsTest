import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GoibiboWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com");
		
	
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5000));
		WebElement smallWindowPhoneNumber=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".loginCont__input"))));
		
		//String parentWindow=driver.getWindowHandle();
		//System.out.println(parentWindow);
		//Set<String> windowIds=driver.getWindowHandles();
		
		
		//The child window is not considered as a new window here as windowIds.size() returns 1
				
				smallWindowPhoneNumber.sendKeys("9492902280");
				driver.findElement(By.xpath("//*[text()='Continue']")).click();
				Thread.sleep(2000);
				//driver.close() closes the main window so use locator of the child window close button
				driver.findElement(By.cssSelector("span[class='logSprite icClose']")).click();
				
				
				//WebElement radioButton  = driver.findElement(By.xpath("li//[@class='sc-12foipm-69']/span[following-sibling::p[text()='Round-trip']]"));
					
					//	"//preceding-sibling::ul[@class='sc-12foipm-68 iMiogo']"));
				
				//
				//WebElement radioButton  = driver.findElement(By.xpath("//p[@text()='Round-trip']/preceding-sibling::span[@class='sc-12foipm-70 bWWMhV']"));
				
						//+ "/preceding-sibling::input[@type='radio']"));
				//p[contains(text,'Round-trip')]
				//worked to select radio button Round-trip ************WebElement radioButton  = driver.findElement(By.xpath("//p[text()='Round-trip']/parent::li[1]"));************
				
				WebElement radioButton  = driver.findElement(By.xpath("//p[text()='Round-trip']/parent::li"));
				if(!radioButton.isSelected()) {
					radioButton.click();
					}
		
				
				//Actions actions=new Actions(driver);
				
				/*WebElement doctorCheckBox=wait.until(ExpectedConditions.visibilityOf(
						driver.findElement(By.xpath("//div[text()='Doctors & Nurses']/ancestor::label"))));
				
				doctorCheckBox.click();	
			System.out.println(driver.findElement(By.xpath("//span[text()='From']")).getText());
			//Thread.sleep(5000);*/
			
			
			WebElement fromCity=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='From']/following-sibling::p"))));
			fromCity.click();
			driver.findElement(By.xpath("//span[text()='From']/following-sibling::input")).sendKeys("HYD");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='sc-12foipm-24 bDSkOK']/ul[@id='autoSuggest-list']/li[1]")).click();
			//Thread.sleep(5000);
			//driver.findElement(By.xpath("//span[text()='To']/following-sibling::p")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='To']/following-sibling::input")).sendKeys("DPS");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='sc-12foipm-24 bDSkOK']/ul[@id='autoSuggest-list']/li[1]")).click();
			driver.findElement(By.xpath("(//span[@class='sc-12foipm-8 eXKWBG fswDownArrow'])[1]")).click();
			driver.findElement(By.xpath("//div[@class='DayPicker Range']/descendant::span[2]")).click();
			driver.findElement(By.xpath("//div[@class='DayPicker-Day' and @aria-label='Sat Oct 05 2024']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='DayPicker-Day' and @aria-label='Sun Nov 24 2024']")).click();
			driver.findElement(By.className("fswDownArrowTraveller")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//p[text()='Adults']/parent::div/descendant::span[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//p[text()='Children']/parent::div/descendant::span[3]")).click();
			
			driver.findElement(By.xpath("//p[text()='Infants']/parent::div/descendant::span[3]")).click();
			driver.findElement(By.xpath("//ul[@class='sc-12foipm-45 caZeZT']/li[text()='business']")).click();
			driver.findElement(By.xpath("//a[contains(.,'Done')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(.,'SEARCH FLIGHTS')]")).click();
			//span[contains(.,'SEARCH FLIGHTS')]
			//div[@class='sc-12foipm-24 bDSkOK']/ul[@id='autoSuggest-list']
						//+ "/following-sibling::input[1]")).sendKeys("HYD");
				
				
						//following-sibling::input"))));
				
				//System.out.println("from city "+fromCity.getText());
				
				//actions.moveToElement(fromCity).perform();
				
				//fromCity.("HYD");

		////td[@text='MAria']/preceding-sibling::td/child::input
	

	}

}
