import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Spicejet {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000)); // 10 seconds timeout
    wait.until(ExpectedConditions.alertIsPresent());

    // Switch to the alert
    Alert alert = driver.switchTo().alert();

    // Cancel the alert (dismiss) if it’s a confirmation or prompt
    alert.dismiss();
	}

}
