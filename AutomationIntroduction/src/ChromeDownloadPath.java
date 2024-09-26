import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ChromeDownloadPath {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "C:\\Users\\pc\\Downloads\\sample");
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[normalize-space()='4.24.0']"))));
		element.click();
	
		// TODO Auto-generated method stub

	}

}
