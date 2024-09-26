import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmexHorizontalAnchorTags {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.americanexpress.com/us/credit-cards/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		WebElement headerDriver = driver.findElement(By.xpath(
				"//div[@class='axp-global-header__GlobalHeader__navContainer___1rC-J axp-global-header__dls-module__nav___9Aq3L axp-global-header__dls-module__navLarge___LYxP0 axp-global-header__dls-module__navMenu___2v96a axp-global-header__dls-module__pad0___1QHU5']"));
		List<WebElement> links = headerDriver.findElements(By.xpath(
				"//ul[@class='axp-global-header__Tabs__navTabs___XEPHn axp-global-header__dls-module__navMenu___2v96a']/li"));
		System.out.println("header links size=" + links.size());
		
		
		Actions actions = new Actions(driver);
		for (int i = 1; i <= links.size(); i++) {

			WebElement link = headerDriver.findElement(By.xpath(
					"//ul[@class='axp-global-header__Tabs__navTabs___XEPHn axp-global-header__dls-module__navMenu___2v96a']/li["
							+ i + "]/label[1]"));
			Thread.sleep(2000);
			actions.moveToElement(link);
			Thread.sleep(2000);
			link.click();
			Thread.sleep(2000);
			for(int j=1;j<=11;j=j+2) {
			WebElement subTabDriver =driver.findElement(By.xpath("(//div[@class='axp-global-header__dls-module__row___3H3xq'])["+j+"]"));
			List<WebElement> anchorTags=subTabDriver.findElements(By.tagName("a"));
			System.out.println(anchorTags.size());
			}
			//List<WebElement> anchorTags=driver.findElements(By.xpath("(//div[@class='axp-global-header__dls-module__row___3H3xq'])["+i+"]/descendant::a"));
			//WebElement myAccountDriver = headerDriver.findElement(By.xpath("//li/a/span"));

			// Thread.sleep(2000); actions.moveToElement(myAccountDriver);
			// Thread.sleep(2000); myAccountDriver.click();
			//Thread.sleep(2000);
			//Thread.sleep(2000);
			//List<WebElement> myAccountDriverLinks = link.findElements(By.tagName("a"));

			//System.out.println("anchorTags= " + anchorTags.size());

		}

	}

}
