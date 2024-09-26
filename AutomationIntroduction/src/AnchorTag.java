import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AnchorTag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://sso.teachable.com/secure/9521/identity/sign_up/routing?wizard_id=qU3QHcDQeI84CPLECh1COsyN2Yf848wCtYOON_XB9j-LgiXKCecpN5jVhdoZLOHnWEYsDIEj2K1y0wTx-faZiw");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		List<WebElement> allLinks=wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.tagName("a"))));
		
		for(WebElement link:allLinks) {
			
			String url=link.getAttribute("href");
			System.out.println(url);
			
		}

	}

}
