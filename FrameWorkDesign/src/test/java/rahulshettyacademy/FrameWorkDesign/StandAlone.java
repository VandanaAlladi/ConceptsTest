package rahulshettyacademy.FrameWorkDesign;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoAlertPresentException;

public class StandAlone {

	
	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.amazon.in/");
			driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
			
			
			
			driver.findElement(By.id("ap_email")).sendKeys("9492902280");
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			//WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='a-button-text']")));
			//continueButton.click();
			
			WebElement continueButton=	driver.findElement(By.xpath("//input[@id='continue']"));
			
			//Actions actions = new Actions(driver);
			//actions.moveToElement(continueButton).build().perform();
			
			continueButton.click();
		
			
			driver.findElement(By.id("ap_password")).sendKeys("veda@555");
			driver.findElement(By.id("auth-signin-button")).click();
			Thread.sleep(1000);
			String cartValue= driver.findElement(By.xpath("//span[@id='nav-cart-count']")).getText();
			//System.out.println("cartValue: "+cartValue);
			int cartInteger=Integer.parseInt(cartValue);
			
			if(cartInteger>0) {
				System.out.println("in if block");
			driver.findElement(By.id("nav-cart-count")).click();
			
			
			//System.out.println(driver.findElement(By.xpath("//h2[@class='a-size-extra-large a-text-normal']")).getText());
			//driver.switchTo().frame("DAsis");
			
			
			List<WebElement> products=driver.findElements(By.xpath("(//form[@id='activeCartViewForm']/descendant::div[@data-bundleitem='absent'])"));
			//System.out.println("products size:"+products.size());
			WebElement first=driver.findElement(By.xpath("(//form[@id='activeCartViewForm']/descendant::div[@data-bundleitem='absent'])[1]"));
			WebElement firstDelete=first.findElement(By.xpath("//input[@value='Delete']"));
			firstDelete.click();
			List<WebElement> products1=driver.findElements(By.xpath("(//form[@id='activeCartViewForm']/descendant::div[@data-bundleitem='absent'])"));
			System.out.println("products1 size:"+products1.size());
		
			
			for(int i=2;i<=products1.size();i++) {
				System.out.println("i: "+i);
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//form[@id='activeCartViewForm']/descendant::div[@data-bundleitem='absent'])[2]/descendant::input[@value='Delete']")).click();
				
				/*WebElement product=driver.findElement(By.xpath("(//form[@id='activeCartViewForm']/descendant::div[@data-bundleitem='absent'])[2]"));
				WebElement button=wait.until(ExpectedConditions.elementToBeClickable(product.findElement(By.xpath("//input[@value='Delete']"))));
				Thread.sleep(1000);
				button.click(); */
			
			}
			}
			else {
				System.out.println("in else block");
				System.out.println("Cart value is 0");
			}
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile Phones 5G",Keys.ENTER);		
					
	
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//div[@id='brandsRefinements']//span[@class='a-list-item']/a/span)[1]")).click();
			
			driver.findElement(By.xpath("//span[text()='5G']")).click();
			List<WebElement> phones=driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
			for(int i=2;i<=phones.size();i++) {
				
				//System.out.println("in for loop "+i);
			
			WebElement phone=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])["+i+"]"));
			String phoneTitle=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])["+i+"]//h2")).getText();
			System.out.println(phoneTitle);
			if(phoneTitle.contains("108MP")) {
				//System.out.println("in if block");
				
				WebElement buttonAddtoCart =driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])["+i+"]//button[text()='Add to cart']"));
				wait.until(ExpectedConditions.elementToBeClickable(buttonAddtoCart)).click();
			}
			}
			driver.findElement(By.id("nav-cart-count")).click();
			driver.findElement(By.xpath("//input[@value='Proceed to checkout']")).click();
			
			
			WebElement address=driver.findElement(By.id("orderSummaryPrimaryActionBtn"));
			wait.until(ExpectedConditions.elementToBeClickable(address)).click();
			
			
			//String price=phone.findElement(By.className("a-price-whole")).getText();
			
			
			
		
			/*for(WebElement phone:phones) {
				
			}
			
			//driver.findElement(By.xpath("(//div[@id='brandsRefinements']//span[@class='a-list-item']/a/span)[2]")).click();
			/*List<WebElement> products=driver.findElements(By.cssSelector(".mb3"));
			//products.stream().distinct().forEach(product->System.out.println(product.getText())); 
			
			System.out.println("*********************************************************************");
			WebElement prod=products.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
			
			System.out.println("*********************************************************************");
			prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
			
			
			/*WebElement zara= product.findElement(By.xpath("//b"));
			String zaraText=zara.getText();
			System.out.println(zaraText);
			//("(//div[@class='card']//b)[1]")
			
		}
	
		private static boolean isAlertPresent(WebDriver driver) {
			
			
			try {
				driver.switchTo().alert();
				return true;
			}catch(NoAlertPresentException e) {
			
			// TODO Auto-generated method stub
			return false;
			}
		}*/
			/*List<WebElement> deleteButtons=driver.findElements(By.xpath("//input[@value='Delete']"));
			System.out.println(deleteButtons.size());
			
			
			if(deleteButtons.size()>=1) {
				
				//WebElement button=(WebElement) deleteButtons.stream().map(s->s.isEnabled());
				//button.click()
			/*for(WebElement button:deleteButtons) {
				button.click();
				Thread.sleep(1000);
			}
			}*/
			/*for(int j=1;j<=deleteButtons.size();j++) {	
				System.out.println(j);
				Thread.sleep(1000);
				WebElement deletButton= wait.until(ExpectedConditions.elementToBeClickable(deleteButtons.get(j)));
				deletButton.click();
				
			}
			}*/
	}
	}


	