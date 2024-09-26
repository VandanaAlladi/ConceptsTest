import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VegShoppingList {

	public static void main(String[] args) throws InterruptedException {
		

		 

		        WebDriver driver = new ChromeDriver();

		        driver.manage().window().maximize();

		        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		        ArrayList<String> veggies=new ArrayList<String>(Arrays.asList("Carrot","Corn","Cauliflower","tomato","onion"));
		        
		        for(String veggie: veggies) {
		        	System.out.println(veggie);
		        	driver.findElement(By.className("search-keyword")).sendKeys(veggie);
		        	Thread.sleep(2000);
			        driver.findElement(By.xpath("//div[@class='product-action']/button[1]")).click();
			        driver.findElement(By.className("search-keyword")).clear();
		        }
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		        Thread.sleep(1000);
		        System.out.println(driver.getCurrentUrl());

		        driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");

		        driver.findElement(By.xpath("//button[text()='Apply']")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		        Thread.sleep(3000);

		        WebElement dropdownElement = driver.findElement(By.xpath("//select[@style='width: 200px;']"));
		        Thread.sleep(1000);
		        Select dropdown = new Select(dropdownElement);
		        dropdown.selectByVisibleText("India");
		        Thread.sleep(1000);
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		        
		        WebElement checkBox = driver.findElement(By.className("chkAgree"));
		        // Tick the checkbox
		        if (!checkBox.isSelected()) {
		            checkBox.click();
		        }
		        Thread.sleep(1000);
		        
		       // driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		        //Thread.sleep(3000);
		       // driver.findElement(By.className("chkAgree")).click();
		        //Thread.sleep(1000);
		        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		       
		        /*driver.findElement(By.className("search-keyword")).sendKeys("Cauliflower");
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//div[@class='product-action']/button[1]")).click();
		      //div[@class='product-action']/button[1]
		        driver.findElement(By.className("search-keyword")).clear();
		        driver.findElement(By.className("search-keyword")).sendKeys("tomato");
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//div[@class='product-action']/button[1]")).click();*/
	}

}
