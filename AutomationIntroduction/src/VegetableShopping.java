import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VegetableShopping {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.findElement(By.xpath("//h4[text()='Tomato - 1 Kg']/parent::div/descendant::button[text()='ADD TO CART']")).click();
        driver.findElement(By.xpath("//h4[text()='Potato - 1 Kg']/parent::div/descendant::button[text()='ADD TO CART']")).click();
        Thread.sleep(1000);
        for(int i=1;i<5;i++) {
            driver.findElement(By.xpath("//h4[text()='Potato - 1 Kg']/parent::div/descendant::a[2]")).click();
            Thread.sleep(500);
        }

        driver.findElement(By.xpath("//h4[text()='Onion - 1 Kg']/parent::div/descendant::button[text()='ADD TO CART']")).click();
        for(int j=1;j<10;j++) {
            driver.findElement(By.xpath("//h4[text()='Onion - 1 Kg']/parent::div/descendant::a[2]")).click();
            Thread.sleep(500);
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
        
        // Locate the checkbox and click on it using JavaScript Executor
        // Locate the checkbox and click on it using JavaScript Executor
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     
        WebElement checkBox = driver.findElement(By.className("chkAgree"));
        // Tick the checkbox
        if (!checkBox.isSelected()) {
            checkBox.click();
        }
        Thread.sleep(3000);
        
       // driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        //Thread.sleep(3000);
       // driver.findElement(By.className("chkAgree")).click();
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();
      //  driver.findElement(By.xpath("//span[@class='errorAlert']/following-sibling::button[1]")).click();
        
        // Uncomment the following lines if you want to click on the "Home" link
        // WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Home")));
        // element.click();
    }
}
