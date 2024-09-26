import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarsPracticeHYR {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// TODO Auto-generated method stub
		
		driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
		
		System.out.println(
		driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText());
		//=======================first date next year dates======================================================================================
		while(!((driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText()).equals("December 2026"))) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
		}
		
		driver.findElement(By.xpath("//a[text()='1']")).click();
		//==================================second date previous years date==================================================================================
		
		
		driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
		System.out.println(
				driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText());
		
		while(!((driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText()).equals("December 2023"))) {
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			
		}
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td/a[text()='15']")).click();
		
		
		//==================================thjrd date==================================================================================
		driver.findElement(By.xpath("//input[@id='third_date_picker']")).click();
		
		WebElement dropdownYear=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select year=new Select(dropdownYear);
		year.selectByVisibleText("2014");
		
		WebElement dropdownMonth=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		
		Select month=new Select(dropdownMonth);
		month.selectByVisibleText("Mar");
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td/a[text()='11']")).click();
		//============================calendar image==============================================================
		
		driver.findElement(By.xpath("//img[@title='Calendar-icon']")).click();
	}
	
	
	
}
