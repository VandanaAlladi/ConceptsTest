import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalendarPracticeMMT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.findElement(By.xpath("//section[@data-cy='CommonModal_2']/child::span[1]")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Tue Oct 01 2024']")).click();
		driver.findElement(By.xpath("//span[text()='Return']")).click();
		
		WebElement departureDate=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]"));
		WebElement returnDate=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]"));
		WebElement nextButton=driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
		//System.out.println(departureDate.getText());
		//System.out.println(returnDate.getText());
		
		WebElement returnMonth=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]/div"));
		WebElement returnYear=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]/div/span"));
		//System.out.println(returnMonth.getText());
		//System.err.println(returnYear.getText());
		
		int year=Integer.parseInt(returnYear.getText());
		
		
	/*while(year<=2025 ) {
		System.out.println("in while loop");
		nextButton.click();
		
		if((returnMonth.getText()).equals("September2025")) {
			System.out.println("in if block");
			Actions actions=new Actions(driver);
		
			WebElement returnDateSelected=driver.findElement(By.xpath("//div[@aria-label='Tue Sep 09 2025']"));
		actions.moveToElement(returnDateSelected).build().perform();
		returnDateSelected.click();
		break;	
		}*/
		
		//System.out.println(departureDate.getText());
		//System.out.println(returnDate.getText());
		//Thread.sleep(3000);
		
		while(!((returnMonth.getText()).equals("July2025"))) {
			nextButton.click();
			
		}
		
		WebElement returnDateSelected=driver.findElement(By.xpath("//div[@aria-label='Thu Jul 24 2025']"));
		returnDateSelected.click();
	
		
		//div[contains(text(),'September')]
	//	(//span[contains(text(),'2025')])[2]
		

	/*driver.findElement(By.xpath("//span[@class='lbl_input appendBottom5']")).click();
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//li[@data-cy='adults-6']")).click();
	driver.findElement(By.xpath("//li[@data-cy='children-6']")).click();
	driver.findElement(By.xpath("//li[@data-cy='infants-6']")).click();
	driver.findElement(By.xpath("//li[@data-cy='travelClass-2']")).click();
	driver.findElement(By.xpath("//button[text()='APPLY']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Search']")).click();*/

}
}
