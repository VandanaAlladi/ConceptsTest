import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreditCard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("start-maximized");
		 
		 WebDriver driver = new ChromeDriver(options);
		 
		driver.navigate().to("https://applyonline.hdfcbank.com/cards/credit-cards.html?utm_content=DGPI&Channel=DSA&DSACode=XRKD&SMCode=H5399&LGCode=MMM2&LCCode=RKS001&LC2=RKS001#nbb");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		By textBoxLocator = By.id("guideContainer-rootPanel-panel-panel-panel-panel-panel_125926945-panel_83355669-guidetextbox___widget");
		WebElement textBox = wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxLocator));
		textBox.sendKeys("9492902280");
		driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("23");
		driver.findElement(By.xpath("//input[@placeholder='MM']")).sendKeys("11");
		driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("2000");
		
		By getOTPbutton= By.xpath("//button[@aria-label='Get OTP >>']");
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(getOTPbutton));
		 element.click();

	}

}
