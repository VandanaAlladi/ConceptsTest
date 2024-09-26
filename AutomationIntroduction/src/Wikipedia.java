
import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wikipedia {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.xpath("//span[@class='lang-list-button-text jsl10n']")).click();
		Thread.sleep(2000);

		WebElement language = driver.findElement(By.xpath("//div[@class='lang-list-content']"));

		List<WebElement> bigList = language.findElements(By.tagName("a"));
		System.out.println(bigList.size());
		for (int j = 1; j <= 5; j++) {
			System.out.println("j value=" + j);

			WebElement languageDriver = language
					.findElement(By.xpath("(//div[@data-el-section='secondary links'])[" + j + "]/ul"));

			List<WebElement> languageLinks = languageDriver.findElements(By.tagName("a"));
			System.out.println(languageLinks.size());

			for (int i = 0; i < languageLinks.size(); i++) {

				WebElement specificlink = languageLinks.get(i);
				String Language = languageLinks.get(i).getText();
				System.out.println(Language);

				String url;
				// WebElement specificlink;
				System.out.println(url = specificlink.getAttribute("href"));
				String clickOnTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
				specificlink.sendKeys(clickOnTab);

			}

		}

		// Thread.sleep(2000);
		/*
		 * driver.findElement(By.id("searchInput")).click();
		 * driver.findElement(By.id("searchInput")).sendKeys("Singapore");
		 * Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//div[@class='suggestions-dropdown']/descendant::a[@class='suggestion-link'][1]"
		 * )).click(); Thread.sleep(2000);
		 * 
		 * //System.out.println(
		 * "***************************************English**********************");
		 * //System.out.println(driver.findElement(By.id("mw-content-text")).getText());
		 * 
		 * WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		 * WebElement languageLink=
		 * wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(
		 * "p-lang-btn-label")))); languageLink.click();
		 * 
		 * Thread.sleep(2000); driver.findElement(By.
		 * xpath("//div[@class='grid uls-menu notheme skin-invert uls-wide']/descendant::a[@lang='te'][1]"
		 * )).click();
		 * 
		 * }
		 */
		/*
		 * driver.findElement(By.xpath("//a[text()='Italiano']")).click();
		 */
		// ===============================to print langunage
		// names======================================================================
		/*
		 * for(int i=1;i<=19;i++) { String
		 * locator="//div[@data-el-section='secondary links'][1]/descendant::li["+i+
		 * "]/child::a"; //System.out.println(locator); System.out.println(
		 * driver.findElement(By.xpath(locator)).getText()); }
		 */
	}

}
