import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelIntroduction {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		// TODO Auto-generated method stub
		
		
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("start-maximized");
		 
		 WebDriver driver = new ChromeDriver(options);
		 
		 
		 driver.get("https://www.amazon.in/");
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 driver.findElement(By.xpath("//a[.//span[contains(text(), 'Hello, sign in')]]")).click();
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("alladi.vandana92@gmail.com");
		 driver.findElement(By.className("a-button-input")).click();
		 
		 By password=By.xpath("//input[@id='ap_password']");
		 
		WebElement passwordInput =wait.until(ExpectedConditions.visibilityOfElementLocated(password));
				passwordInput.sendKeys("veda@555");
				
				driver.findElement(By.id("signInSubmit")).click();
				 WebElement divElement = driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
			        System.out.println("Text inside div: " + divElement.getText());
			        
			        WebElement parentElement = driver.findElement(By.cssSelector("a.nav-a.nav-a-2.nav-truncate.nav-progressive-attribute"));

			        // Then find the nested span element
			        WebElement spanElement = parentElement.findElement(By.xpath(".//span[@class='nav-icon nav-arrow' and @style='visibility: visible;']"));
			        
			        spanElement.click();
			        
			        WebElement linkElement = driver.findElement(By.partialLinkText("Subscribe & Save"));
			        linkElement.click();
				
				/*WebElement element = driver.findElement(By.className("nav-a"));
		        element.click();
				
				//System.out.println(driver.findElement(By.xpath("//a[.//span[@id='nav-link-accountList-nav-line-1']")).getText());
				
				
		//*[@id="nav-link-accountList"]
		 /*WebElement element = driver.findElement(By.className("nav-a-2"));
		 element.click();
         // Perform hover action
       
         /*By signIn=By.xpath("//button[@aria-label='Sign in']");
         WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(signIn));
         signIn.click();
         
         
		 https://selectorshub.com/selectorshub
		 
		/*By signIn= By.xpath("//a[.//span[text()='Sign in']]");
		WebElement signInbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(signIn));
		signInbutton.click();
		 
		 
		 //<a href="https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&amp;openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&amp;openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.assoc_handle=inflex&amp;openid.mode=checkid_setup&amp;openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0" class="nav-action-signin-button" data-nav-role="signin" data-nav-ref="nav_custrec_signin"><span class="nav-action-inner">Sign in</span></a>
		/*driver.get("https://applyonline.hdfcbank.com/cards/credit-cards.html?utm_content=DGPI&Channel=DSA&DSACode=XRKD&SMCode=H5399&LGCode=MMM2&LCCode=RKS001&LC2=RKS001#nbb");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		/*By textBoxLocator = By.id("guideContainer-rootPanel-panel-panel-panel-panel-panel_125926945-panel_83355669-guidetextbox___widget");
		WebElement textBox = wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxLocator));
		textBox.sendKeys("9492902280");
		driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("23");
		driver.findElement(By.xpath("//input[@placeholder='MM']")).sendKeys("11");
		driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("2000");
		
		By getOTPbutton= By.xpath("//button[@aria-label='Get OTP >>']");
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(getOTPbutton));
		 element.click();

		//driver.findElement(By.id("comb-form-group-month1724847179596")).sendKeys("03");
		//driver.findElement(By.id("comb-form-group-year1724847179596")).sendKeys("2000"); 
		/* driver.get("https://rahulshettyacademy.com/practice-project");
		 
		 driver.findElement(By.id("name")).sendKeys("vandana");
		 driver.findElement(By.id("email")).sendKeys("alladi.vandana92@gmail.com");
		 driver.findElement(By.id("agreeTerms")).click();
		 driver.findElement(By.id("form-submit")).click();
		 Thread.sleep(5000);
		 System.out.println(driver.getTitle());
		 System.out.println(driver.findElement(By.xpath("//h2[text()='Enter code here']")));
		 driver.findElement(By.id("code")).sendKeys("123456");
		 driver.findElement(By.cssSelector("#code-form-submit")).click();
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());*/
		 
		//*[@id="guideContainer-rootPanel-panel-panel-panel-panel-guidebutton_23907962___widget"]
		 /*<button class="button-default button-medium Button" type="button" id="guideContainer-rootPanel-panel-panel-panel-panel-guidebutton_23907962___widget" name="guideContainer-rootPanel-panel-panel-panel-panel-guidebutton_23907962___jqName" style="position: relative;" tabindex="0" aria-label="Get OTP >>" placeholder="" data-original-title="" title="">
	        <span class="iconButton-icon"></span>
	        <span class="iconButton-label" data-guide-button-label="true" style="">Get OTP &gt;&gt;</span>
	    </button>*/
		

	}

}
