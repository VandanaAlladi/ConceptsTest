import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AmazonSearchUsingKeys {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		String parentWindow=driver.getWindowHandle();
		// TODO Auto-generated method stub
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi mobile 5g",Keys.ENTER);
		WebElement link=driver.findElement(By.xpath("(//h2/a)[1]"));
		String clickOnTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		link.sendKeys(clickOnTab);
		
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String currentWindow=it.next();
		System.out.println(parentWindow);
		System.out.println(currentWindow);
		String nextWindow=it.next();
		System.out.println(nextWindow);
		driver.switchTo().window(nextWindow);
		driver.findElement(By.xpath("(//span[@class='a-button-inner']/child::input[@id='add-to-cart-button'])[2]")).click();
	}

}
