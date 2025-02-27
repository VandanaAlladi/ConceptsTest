package rahulshettyacademy.FrameWorkDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.utilities.AbstractComponents;

public class PasswordPage extends AbstractComponents {
	WebDriver driver;
	
	public PasswordPage(WebDriver driver) {
		super(driver);
	this.driver=driver;	
	PageFactory.initElements(driver, this);
	}
	
	//continueButton.click();
		//driver.findElement(By.id("ap_password")).sendKeys("veda@555");
		@FindBy(id="ap_password")
		WebElement passwordEle;
		
		//driver.findElement(By.id("auth-signin-button")).click();
		@FindBy(id="auth-signin-button")
		WebElement signInButton;
		
		public RemoveElementsFromCart enterPassword(String passWordInput)
		{
			passwordEle.sendKeys(passWordInput);
			signInButton.click();
			RemoveElementsFromCart removeElementsFromCart=new RemoveElementsFromCart(driver);
			return removeElementsFromCart;
		}
}
