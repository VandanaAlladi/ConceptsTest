import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarHandlingGoibibo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		WebElement smallWindowPhoneNumber = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".loginCont__input"))));
		driver.findElement(By.cssSelector("span[class='logSprite icClose']")).click();

		WebElement fromCity = wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//span[text()='From']/following-sibling::p"))));
		fromCity.click();
		driver.findElement(By.xpath("//span[text()='From']/following-sibling::input")).sendKeys("HYD");
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sc-12foipm-24 bDSkOK']/ul[@id='autoSuggest-list']/li[1]")).click();
		// Thread.sleep(5000);
		// driver.findElement(By.xpath("//span[text()='To']/following-sibling::p")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='To']/following-sibling::input")).sendKeys("DPS");
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sc-12foipm-24 bDSkOK']/ul[@id='autoSuggest-list']/li[1]")).click();
		driver.findElement(By.xpath("(//span[@class='sc-12foipm-8 eXKWBG fswDownArrow'])[1]")).click();

	
		while(!(driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div")).getText()).equals("December 2024")){
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			Thread.sleep(1000);
		
			
			//System.out.println(driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div")).getText());
		}
		driver.findElement(By.xpath("(//div[@class='DayPicker-Day']/p[text()='25'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Click to add a return flight for better discounts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='sc-12foipm-8 eXKWBG fswDownArrow'])[2]")).click();
		//driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		while(!(driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]/div")).getText()).equals("July 2025")){
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			Thread.sleep(1000);
		
			
			//System.out.println(driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div")).getText());
		}
		driver.findElement(By.xpath("//p[text()='31']")).click();
	}

}
