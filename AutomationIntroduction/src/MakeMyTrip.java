import java.sql.Driver;
import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		
		System.out.println((driver.findElement(By.xpath("//section[@data-cy='CommonModal_2']/descendant::ul[1]/child::li[1]")).getText()));
		
		driver.findElement(By.xpath("//section[@data-cy='CommonModal_2']/child::span[1]")).click();
		String parentWindow=driver.getWindowHandle();
		System.out.println("parentwindow="+parentWindow);
		//Thread.sleep(5000);
		
		WebElement tripType=driver.findElement(By.xpath("//li[text()='Round Trip']"));
		if(!tripType.isSelected()) {
			tripType.click();
		}
		driver.findElement(By.id("fromCity")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='From'])[1]")).sendKeys("HYD");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("(//input[@placeholder='To'])[1]")).sendKeys("BKK");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Bangkok']")).click();
		//driver.findElement(By.className("DayPicker-NavButton--prev")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-label='Thu Sep 26 2024']")).click();
		//driver.findElement(By.className("DayPicker-NavButton--next")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Mon Oct 07 2024']")).click();
		driver.findElement(By.xpath("//span[@class='lbl_input appendBottom5']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@data-cy='adults-6']")).click();
		driver.findElement(By.xpath("//li[@data-cy='children-6']")).click();
		driver.findElement(By.xpath("//li[@data-cy='infants-6']")).click();
		driver.findElement(By.xpath("//li[@data-cy='travelClass-2']")).click();
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
		//driver.findElement(By.xpath("//div[@class='checkboxContent']/child::p[contains(.,'Air India')]")).click();
		//driver.findElement(By.xpath("//div[@class='checkboxContent']/child::p[contains(.,'1-Stop')]")).click();
		//driver.findElement(By.xpath("//span[text()='Show more filters ']")).click();
		////Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//p[contains(.,'Departure From Hyderabad')]/parent::div[1]/descendant::p[contains(.,'6 AM - 12 PM')]")).click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.findElement(By.xpath("(//span[text()='Select flight'])[2]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='BOOK NOW']")).click();
		//Thread.sleep(2000);
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String window1=it.next();
		System.out.println(window1);//same as parent window
		String childWindow=it.next();
	//	String anotherwindow=it.next();
		//System.out.println(anotherwindow);
		System.out.println(childWindow);//child window
		driver.switchTo().window(childWindow);
		String url2=driver.getCurrentUrl();
		System.out.println(url2);
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("(//span[text()='Fare Option '])[1]"))).build().perform();
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("document.querySelector(\"div[class='pageRightContainer ']\").scrollTop=600");
		Thread.sleep(3000);
		WebElement creditCard=driver.findElement(By.xpath("//span[text()='MMTHSBCINTEMI']"));
		if(!creditCard.isSelected()) {
			creditCard.click();
			
		}
		
		jse.executeScript("window.scrollBy(0,3000);");
		Thread.sleep(2000);
		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='checkbox'])[1]")));
		element.click();*/
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		
		//jse.executeScript("arguments[0].scrollIntoView()",checkbox );
		Thread.sleep(2000);
		//checkbox.click();
		WebElement element=driver.findElement(By.xpath("//input[@placeholder='Mobile No']"));
		jse.executeScript("arguments[0].scrollIntoView()",element);
		//jse.executeScript("window.scrollBy(0,1200);");
		
		element.sendKeys("9492902280");
		//driver.findElement(By.xpath("//input[@placeholder='Mobile No']")).sendKeys("9492902280");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("alladi.vandana92@gmail.com");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='emailIds-dropdown']/div[1]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.className("checkboxWithLblWpr__checkboxCtr")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		//Thread.sleep(1000);
		
		//driver.navigate().to("");
		//driver.navigate().to("https://www.makemytrip.com/flight/reviewDetails/?itineraryId=f6ad9240107e535f28c68171a96946e7c4b441ff&crId=8a19b314-9b18-4d47-bdc7-4838b00fcb8f&cur=INR&rKey=RKEY:6c0d2a30-b3a2-4242-b8f0-21faac666562:12_0&ccde=IN&xflt=eyJjIjoiQiIsInAiOiJBLTlfQy0wX0ktMCIsInQiOiIiLCJzIjoiSFlELUJLSy0yMDI0MDkyNiRCS0stSFlELTIwMjQxMTIzIiwiSXRpbmVyYXJ5SWQiOiJIWUQtQktLLTI2LzA5LzIwMjRfQktLLUhZRC0yMy8xMS8yMDI0IiwiVHJpcFR5cGUiOiJSIiwiUGF4VHlwZSI6IkEtOV9DLTBfSS0wIiwiSW50bCI6dHJ1ZSwiQ2FiaW5DbGFzcyI6IkIiLCJDY2RlIjoiaW4iLCJQZnQiOiIiLCJQYWZzIjoiIiwiRm9yd2FyZEZsb3dSZXF1aXJlZCI6dHJ1ZSwiQ21wSWQiOiIifQ==&ibf=true");
		//String url2=driver.getCurrentUrl();
		
		//System.out.println(url2);
		
		
		/*try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // 10 seconds timeout

        // Wait for the page to be completely loaded
        wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                return js.executeScript("return document.readyState").equals("complete");
            }
        });

        System.out.println("Page has fully loaded.");
        String url2=driver.getCurrentUrl();
		System.out.println(url2);
	 

    } catch (TimeoutException e) {
        System.out.println("Page did not load within the timeout period.");
    } */
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		
		//WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[2]/span[1]")));
			
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(25));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='bizClsReviewBredcrum']/ul[1]/li[1]")));
		//System.out.println(driver.findElement(By.xpath("//div[@class='bizClsReviewBredcrum']/ul[1]/li[1]")).getText());
		//System.out.println(driver.findElement(By.xpath("//div[@class='bizClsReviewBredcrum']/ul[1]/li[2]")).getText());
		//System.out.println(driver.findElement(By.xpath("//div[@class='bizClsReviewBredcrum']/ul[1]/li[3]")).getText());
		
		//WebElement link=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='See complete flight experience']")));
		//link.click();
		//System.out.println(driver.getCurrentUrl());
		
		
		
		//driver.findElement(By.xpath("//a[@href='https://www.makemytrip.com/railways/']")).click();
		//driver.findElement(By.xpath("//span[text()='See complete flight experience']")).click();
		//driver.findElement(By.className("multifareCross")).click();
		////Thread.sleep(5000);
		//driver.findElement(By.xpath("(//button[text()='LOCK PRICE'])[2]")).click();
		//driver.findElement(By.xpath("(//button[text()='BOOK NOW'])[2]")).click();
		
		////Thread.sleep(50000);
		
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='pageRightContainer ']")));

		//JavascriptExecutor jse=(JavascriptExecutor) driver;
		//jse.executeScript("window.scrollBy(0,3500);");
		//
		
		////Thread.sleep(2000);
		//jse.executeScript("document.querySelector(\"div[class='pageRightContainer ']\").scrollTop=500");
		
        // Print the source code of the page after clicking the "BOOK NOW" button
      //  String pageSource = driver.getPageSource();
        //System.out.println(pageSource);
		
//		FluentWait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(30))  // Maximum wait time
//                .pollingEvery(Duration.ofSeconds(2))  // Frequency of checks
//                .ignoring(NoSuchElementException.class);  // Ignore NoSuchElementException
//
//        // Use Fluent Wait to find the element to hover over
//        WebElement elementToHover = wait.until(new Function<WebDriver, WebElement>() {
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(By.xpath("//span[contains(@class, 'bgProperties icon14 appendLeft5')]"));
//            }
//        });
//
//        // Create an instance of Actions class
//        Actions actions = new Actions(driver);
//
//        // Perform the hover action
//        actions.moveToElement(elementToHover).perform();
//
//        // Optionally, you can add a wait to see the hover effect
//        try {
//            //Thread.sleep(3000); // Wait for 3 seconds
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        WebElement viewFareBreakup = driver.findElement(By.xpath("//span[contains(@class, 'bizClsLinkText') and contains(text(), 'View fare breakup')]"));
//
//        // Click on the "View fare breakup" element
//        viewFareBreakup.click();
		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(25));
//		WebElement experienceLink=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".icon16"))));
//		experienceLink.click();
		//System.out.println(driver.findElement(By.xpath("//li[contains(.,'Add-ons')]")).getText());
		//driver.findElement(By.xpath("//div[@class='pageLeftConainer']/child::form[1]/descendant::span[text()='See complete flight experience']")).click();
		
		//System.out.println(driver.findElement(By.xpath("//label[text()='Mobile No']")).getText());
		//driver.findElement(By.xpath("//div[@class='bookingDetailsForm']/descendant::input[@placeholder='Mobile No']")).sendKeys("9492902280");
		//driver.findElement(By.xpath("//div[@class='pageRightContainer ']/descendant::div[@class='flexOne'][2]")).click();
		
		
		//System.out.println(driver.findElement(By.xpath("//form[@id='mainSection_0']/descendant::div[@class='makeFlex hrtlCenter spaceBetween boldFont appendBottom15']/child::span[@class='fontSize20 bizClsBlueBlack']/child::font[text()='Review your journey']")).getText());
		
		//JavascriptExecutor jse=(JavascriptExecutor) driver;
		//jse.executeScript(0, 600);
		/*driver.findElement(By.xpath("//form[@id='mainSection_0']/descendant::input[@placeholder='Mobile No']")).sendKeys("9492902280");
		driver.findElement(By.xpath("//form[@id='mainSection_0']/descendant::input[@placeholder='Email']")).sendKeys("alladi.vandana92@gmail.com");
		WebElement dropdown=driver.findElement(By.id("dt_state_gst_info"));
		Select dropdownTG=new Select(dropdown);
		dropdownTG.selectByVisibleText("Telangana");
		
		
		/*driver.findElement(By.xpath("//ul[@class='makeFlex font12 headerIconsGap']/li[2]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='makeFlex font12 headerIconsGap']/li[3]")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//ul[@class='makeFlex font12 headerIconsGap']/li[4]")).click();
		//Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//label[@for='fromCity']/span[1]")).getText());
		Actions actions=new Actions(driver);
		driver.findElement(By.xpath("//ul[@class='makeFlex font12 headerIconsGap']/li[1]")).click();
		//Thread.sleep(1000);*/
		
		/*WebElement element=driver.findElement(By.xpath("//label[@for='fromCity']/input[@id='fromCity']"));
		actions.moveToElement(element).perform();
		actions.scrollToElement(element);
		actions.click(element);
		driver.findElement(By.cssSelector("span[class='flightsSprite fltSwipIcon']")).click();
		driver.findElement(By.className("widgetSearchBtn")).click();
		//System.out.println(driver.findElement(By.xpath("//font[text()='Offers']")).getText());
		//driver.findElement(By.xpath("//a[@id='superOffersTab_HOTELS']")).click();
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5000));
		////Thread.sleep(5000);
		//click on viewDetails link in Hotels tab in offers page
		//driver.findElement(By.xpath	("//div[@data-cy='suUrl-0']/descendant::div[8]/child::a[@data-cy='superOfferCtaText0']")).click();
		
		//driver.findElement(By.xpath
		//("//div[@class='tpDest appendBottom20']/descendant::div[@class='tpDest__slider--itemDesc']/child::p[contains(.,'Picturesque Gateway to Himalayas')")).click();
		//viewDetails.click();
		//driver.findElement(By.xpath("//a[@data-cy='superOfferCtaText0']")).click();
		
		
		//driver.findElement(By.xpath("//div[@role='combobox']/child::input[1]")).sendKeys("HYD");
		
		
		
		//driver.switchTo().frame(driver.findElement(By.id("gsi_642540_222941")));
		
		//driver.findElement(By.id("button-label")).click();
		//https://www.makemytrip.com/?srsltid=AfmBOoqGAebBYOg7lsqzqLK59oxkLaqK3JMsYPF79EkFRQXigG_E9kfT
		// TODO Auto-generated method stub
		/*String parentWindowId=driver.getWindowHandle();
		System.out.println(parentWindowId +" parent Window");*/
		
		//Set<String> handles=driver.getWindowHandles();//it has address
		//
		//System.out.println(handles.size());
		
		
		//WebElement element=	driver.findElement(By.xpath("//section[@data-cy='CommonModal_2']/descendant::ul[1]/child::li[1]"));
		
				//	(element.getText(),"PERSONAL ACCOUNT");
			
		//String window1=it.next();
		//System.out.println(window1);
		//String window2=it.next();
		//System.out.println(window2);*/
		//WebElement elementToHover =driver.findElement(By.xpath("img[@alt='Make My Trip']"));
		//Actions actions=new Actions(driver);
		//actions.moveToElement(elementToHover).perform();
		//elementToHover.click();
				
	}

}
