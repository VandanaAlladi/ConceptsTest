import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Indigo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goindigo.in/");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3000));
		
		//WebElement from =wait.until(ExpectedConditions.elementToBeClickable(By.className("accept-cookies__block--btn")));
		//acceptCookie.click();
		
		System.out.println(driver.findElement(By.className("acc-cookie-desktop")).getText());
		
		Thread.sleep(2000);
		driver.findElement(By.className("acc-cookie-desktop")).click();
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[@aria-label='sourceCity']")).clear();
		//driver.findElement(By.cssSelector("//button[class='btn custom-button accept-cookies__block--btn acc-cookie-desktop']")).click();
		//driver.findElement(By.cssSelector("accept-cookies__block--btn")).click();
		
	//	WebElement elementToHover = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Start typing..']")));

        // Create an instance of Actions class
      //  Actions actions = new Actions(driver);

        // Perform mouse hover action
     //   actions.moveToElement(elementToHover).perform();
		
		WebElement raidoButton=driver.findElement(By.xpath("//span[@aria-label='roundTrip']"));
		if(!raidoButton.isSelected()) {
			raidoButton.click();
		}
		
		
		WebElement fromAirpot =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='sourceCity']")));
		
		System.out.println(fromAirpot.getText());
		
		//fromAirpot.sendKeys("HYD");
		//driver.findElement(By.xpath("//input[@placeholder='Start typing..']")).sendKeys("HYD");
		//driver.findElement(By.xpath("//div[@aria-label='sourceCity']")).sendKeys("HYD");
		//driver.findElement(By.cssSelector(".label_hint.show-on-hover")).sendKeys("HYD");
		
		//btn custom-button accept-cookies__block--btn acc-cookie-desktop
		
		// TODO Auto-generated method stub
		
		
	}

}
