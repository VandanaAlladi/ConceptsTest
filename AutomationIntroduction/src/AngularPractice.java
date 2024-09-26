import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AngularPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Vandana");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("alladi.vandana92@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		driver.findElement(By.cssSelector("#exampleCheck1")).click();//checkbox
		
		WebElement dropdown= driver.findElement(By.id("exampleFormControlSelect1"));
		 Select dropdownOption=new Select(dropdown);
		dropdownOption.selectByIndex(0);
		System.out.println(dropdownOption.getFirstSelectedOption().getText());
		
		dropdownOption.selectByVisibleText("Female");
		
		System.out.println(dropdownOption.getFirstSelectedOption().getText());
		driver.findElement(By.xpath("//input[@value='option2']")).click();//radio button 
		
		WebElement dateInput=driver.findElement(By.name("bday"));//calendar
		
		dateInput.sendKeys("01-01-2000");
		
		driver.findElement(By.className("btn-success")).click();

	}

}
