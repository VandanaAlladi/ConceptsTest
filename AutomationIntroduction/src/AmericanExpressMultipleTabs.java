import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmericanExpressMultipleTabs {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.americanexpress.com/us/credit-cards/");
		Thread.sleep(2000);
		
		WebElement footerdriver=driver.findElement(By.xpath("//div[@class='axp-footer__dls-module__pad3B___1J3uF axp-footer__dls-module__row___3H3xq']"));
		System.out.println("footerdriver size="+footerdriver.findElements(By.tagName("a")).size());
		
		WebElement columndriver=footerdriver.findElement(By.xpath("//*[text()='About']/following-sibling::ul"));
		int columndriverSize=columndriver.findElements(By.tagName("a")).size();
		System.out.println("columndriver size="+columndriver.findElements(By.tagName("a")).size());
		
		for(int i=0;i<columndriverSize;i++) {
		String clickOnTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		WebElement	specificlink=columndriver.findElements(By.tagName("a")).get(i);
		Thread.sleep(2000);
		System.out.println(specificlink.getAttribute("href"));
		specificlink.sendKeys(clickOnTab);
		
		
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
		driver.navigate().to("https://www.americanexpress.com/us/credit-cards");
		WebElement footerdriver2=driver.findElement(By.xpath("//div[@class='axp-footer__dls-module__pad3B___1J3uF axp-footer__dls-module__row___3H3xq']"));
		WebElement columndriver2=footerdriver2.findElement(By.xpath("//h2[text()='Products & Services']/following-sibling::ul"));
		int columndriverSize2=columndriver2.findElements(By.tagName("a")).size();
		System.out.println("columndriver size2="+columndriver2.findElements(By.tagName("a")).size());
		
		for(int i=0;i<columndriverSize2;i++) {
		String clickOnTab2=Keys.chord(Keys.CONTROL,Keys.ENTER);
		WebElement	specificlink2=columndriver2.findElements(By.tagName("a")).get(i);
		Thread.sleep(2000);
		System.out.println(specificlink2.getAttribute("href"));
		specificlink2.sendKeys(clickOnTab2);
		
		
		}
		Thread.sleep(5000L);
		Set<String> windows2=driver.getWindowHandles();
				
				
		
		System.out.println(windows2.size());
		
		 
		Iterator<String> it2=windows2.iterator();
		while(it2.hasNext()) {
			
			driver.switchTo().window(it2.next());
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
			Thread.sleep(1000);
		}
		
		// TODO Auto-generated method stub

	}	

}
