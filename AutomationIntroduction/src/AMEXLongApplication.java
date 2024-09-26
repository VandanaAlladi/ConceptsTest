import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class AMEXLongApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Vandana";
		String Lastname = "Alladi";
		String DOB = "11/23/1992";
		String Email = "alladi.vandana92@gmail.com";
		String mobileNo = "9492902280";
		String streetAddress = "Highlands Ranch Resort";
		String zipCode = "00037";
		String city = "West Tehama County";
		String SSN = "123-35-4545";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.americanexpress.com/us/credit-cards/");
		// Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='All Cards']")).click();
		Thread.sleep(5000);

		WebElement ApplyNowBCE = driver.findElement(By.xpath(
				"(//div[@class='axp-shop-us-consumer__index__cardTileContainer___XguPF'])[3]/descendant::a[text()='Apply Now']"));
		Actions a = new Actions(driver);
		a.moveToElement(ApplyNowBCE).build().perform();
		ApplyNowBCE.click();

		/*============================================== filling form======================================
		
		 * driver.findElement(By.xpath("//input[@id='personalInfo.fullName.firstName']")
		 * ).sendKeys(name); //input[@id='personalInfo.fullName.lastName']
		 * driver.findElement(By.xpath("//input[@id='personalInfo.fullName.lastName']"))
		 * .sendKeys(Lastname);
		 * driver.findElement(By.xpath("//input[@name='personalInfo.dateOfBirth']")).
		 * sendKeys(DOB);
		 * driver.findElement(By.id("personalInfo.email")).sendKeys(Email);
		 * driver.findElement(By.id("personalInfo.phoneNumber.number")).sendKeys(
		 * mobileNo);
		 * driver.findElement(By.id("personalInfo.homeAddress.streetAddress")).sendKeys(
		 * streetAddress);
		 * driver.findElement(By.id("personalInfo.homeAddress.zipCode")).sendKeys(
		 * zipCode);
		 * driver.findElement(By.id("personalInfo.homeAddress.city")).sendKeys(city);
		 * Thread.sleep(2000); WebElement
		 * dropdownState=driver.findElement(By.id("personalInfo.homeAddress.state"));
		 * Select state =new Select(dropdownState);
		 * state.selectByVisibleText("California");
		 * driver.findElement(By.id("personalInfo.ssn")).sendKeys(SSN);
		 * driver.findElement(By.id("personalInfo.totalAnnualIncome")).sendKeys(
		 * "5,453,453");
		 * driver.findElement(By.id("personalInfo.nonTaxableIncome")).sendKeys(
		 * "4,353,453"); WebElement
		 * incomeDropdown=driver.findElement(By.id("personalInfo.incomeSource")); Select
		 * dropdown2=new Select(incomeDropdown);
		 * 
		 * dropdown2.selectByVisibleText("Employed"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//button[text()='Continue to Terms']")).click();
		//****************************************************************************************************

		// System.out.println("offerTerms Exclusion:");

		// System.out.println(driver.findElement(By.cssSelector("p[class='p-padding
		// exclusion']")).getText());
		// System.out.println("POID " + driver.findElement(By.xpath("//p[text()='POID
		// ']")).getText());

		/*======================printing contents of incentive and introductory=======================
		 * WebElement incentiveText =
		 * driver.findElement(By.xpath("//div[@data-testid='incentive-offer']"));
		 * System.out.println("incentiveText");
		 * System.out.println(incentiveText.getText()); WebElement introApr =
		 * driver.findElement(By.xpath("//div[@class='introApr']"));
		 * System.out.println("introApr"); System.out.println(introApr.getText());
		 * 
		 * 
		 * 
		 * WebElement exclusion =
		 * driver.findElement(By.xpath("// div[@class='exclusionText']"));
		 * System.out.println("exclusion");
		 * 
		 * System.out.println(exclusion.getText());
		 * 
		 * 
		 * WebElement introductory =
		 * driver.findElement(By.xpath("//div[@class='introductory-offer']"));
		 * System.out.println("introductory");
		 * System.out.println(introductory.getText());
		 * 
		 */
		// **********************************************offerTerms and Benefit
		// Terms********************************
		WebElement offerTerms = driver.findElement(By.xpath("(//button[@title='Offer Terms'])[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(offerTerms).build().perform();
		offerTerms.click();
		WebElement offersTabCloseButton = driver.findElement(
				By.xpath("//a[@class='modal-close glyph dls-glyph-close glyph-lg focus-light dls-white']"));
		actions.moveToElement(offersTabCloseButton).build().perform();
		offersTabCloseButton.click();
		Thread.sleep(2000);
		WebElement benefitTerms = driver.findElement(By.xpath("(//button[@title='Benefit Terms'])[1]"));
		benefitTerms.click();
		Thread.sleep(2000);
		
		WebElement POID=driver.findElement(By.xpath("//p[@class='p-padding' and text()='POID ']"));
		actions.moveToElement(POID).build().perform();
		Thread.sleep(2000);
		System.out.println(POID.getText());
		Thread.sleep(2000);
		//actions.moveToElement(benefitTerms).build().perform();
		
		actions.moveToElement(driver.findElement(By.xpath("//a[@aria-label='Close']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Close']")).click();

		Thread.sleep(2000);
		// **********************************footer
		// links************************************************
		// driver.findElement(By.xpath("(//button[@title='Offer Terms'])[1]")).click();
		// Thread.sleep(2000);
		// JavascriptExecutor jse=(JavascriptExecutor) driver;

		// WebElement
		// ApplyNowBCE=driver.findElement(By.xpath("(//div[@class='axp-shop-us-consumer__index__cardTileContainer___XguPF'])[2]/descendant::a[text()='Apply
		// Now']"));
		// jse.executeScript("arguments[0].scrollIntoView(true);", ApplyNowBCE);

		// WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		// wait.until(ExpectedConditions.elementToBeClickable(ApplyNowBCE));
		// ApplyNowBCE.click();
		// (By.xpath("(//div[@class='axp-shop-us-consumer__index__cardTileContainer___XguPF'])[2]/descendant::a[text()='Apply
		// Now']")));
		// ApplyNowBCE.click();

	}

}
