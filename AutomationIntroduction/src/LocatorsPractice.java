import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;



public class LocatorsPractice {

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeOptions options = new ChromeOptions();
		// options.addArguments("start-maximized");
		
		//WebDriver driver =new FirefoxDriver();
		
		//WebDriver driver =new EdgeDriver();
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy123");
		
		driver.findElement(By.xpath("//label[@for='chkboxOne']")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.tagName("p")).getText());
		String s1=driver.findElement(By.tagName("p")).getText();
		//System.out.println("s1="+s1);
		String[] array=s1.split("\'");
		//System.out.println(array[0]);
		String password=array[1];
		System.out.println("password="+password);
		//System.out.println(array[2]);
		
		driver.findElement(By.xpath("//*[text()='Go to Login']")).click();
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		/*System.out.println(driver.findElement(By.xpath("//input[@type='password']")).getText());
	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3000));
		
		By checkbox11=By.xpath("//label[@for='chkboxOne']");
		WebElement checkbox1=wait.until(ExpectedConditions.visibilityOfElementLocated(checkbox11));
		checkbox1.click();
		//driver.findElement(By.xpath("//label[@for='chkboxOne']")).click();
		driver.findElement(By.id("chkboxTwo")).click();*/
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		Thread.sleep(5000);
		System.out.println("h2= "+driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText());
		System.out.println("h2= "+driver.findElement(By.xpath("//div[@class='login-container']/h1")).getText());
		//System.out.println("p= "+driver.findElement(By.xpath("//div[@class='login-container']/p")).getText());
		System.out.println("p= "+driver.findElement(By.tagName("p")).getText());
		
		String paragraph=driver.findElement(By.tagName("p")).getText();
		
		//Assert.assertEquals(paragraph, "You are successfully logged in.");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	}

}

//div