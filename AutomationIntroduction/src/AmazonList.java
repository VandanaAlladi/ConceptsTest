import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		
	
       // ArrayList<String> veggies=new ArrayList<String>(Arrays.asList("Carrot","Corn","Cauliflower","tomato","onion"));
		String[] items= {"Huggies XXL","Little Wipes", "Sebamed baby powder"};
		for(String item:items) {
			driver.findElement(By.id("twotabsearchtextbox")).clear();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(item,Keys.ENTER);
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(By.id("a-autoid-1-announce"))).build().perform();
			
			driver.findElement(By.id("a-autoid-1-announce")).click();
			
			
		}
		Actions actions = new Actions(driver);
		WebElement cartButton=driver.findElement(By.id("nav-cart-count-container"));
		actions.moveToElement(cartButton).build().perform();
		cartButton.click();
		
		driver.findElement(By.xpath("//input[@value='Proceed to checkout']")).click();

	}

}
