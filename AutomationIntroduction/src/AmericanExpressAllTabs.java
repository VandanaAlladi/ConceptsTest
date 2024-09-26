import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmericanExpressAllTabs {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.americanexpress.com/us/credit-cards/");
		Thread.sleep(2000);
		
		WebElement footerdriver=driver.findElement(By.xpath("//div[@class='axp-footer__dls-module__pad3B___1J3uF axp-footer__dls-module__row___3H3xq']"));
		List<WebElement> allLinks=footerdriver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		
		for(int i=0;i<allLinks.size();i++) {
			String clickOnTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			WebElement	specificlink=footerdriver.findElements(By.tagName("a")).get(i);
			Thread.sleep(2000);
			//System.out.println(specificlink.getAttribute("href"));
			specificlink.sendKeys(clickOnTab);
			//WebDriverWait wait=new WebDriverWait(footerdriver,Duration.ofSeconds(10));
			Thread.sleep(2000);
			//specificlink.getAttribute("href");
			
			}
			Thread.sleep(5000L);
			Set<String> windows=driver.getWindowHandles();
					
					
			
			System.out.println(windows.size());
			
			 
			Iterator<String> it=windows.iterator();
			while(it.hasNext()) {
				
				driver.switchTo().window(it.next());
				Thread.sleep(1000);
				System.out.println(driver.getTitle());
				Thread.sleep(1000);
				
			}
		// TODO Auto-generated method stub

	}

}
