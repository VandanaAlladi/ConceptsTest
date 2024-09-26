import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildWindowPractise {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2000));
		
		WebElement link=
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"))));
		
		link.click();
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		
		//driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		Set<String> windows=driver.getWindowHandles();
		
		System.out.println(windows.size());
		
		Iterator<String> it=windows.iterator();
		String window1=it.next();
		System.out.println(window1);//same as parent window
		String childWindow=it.next();
	//	String anotherwindow=it.next();
		//System.out.println(anotherwindow);
		System.out.println(childWindow);//child window
		driver.switchTo().window(childWindow);
		String username=driver.findElement(By.linkText("mentor@rahulshettyacademy.com")).getText();
		driver.close();
		
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.close();
		
		// TODO Auto-generated method stub

	}

}
