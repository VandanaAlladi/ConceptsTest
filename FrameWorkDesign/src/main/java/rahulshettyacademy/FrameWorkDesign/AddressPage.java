package rahulshettyacademy.FrameWorkDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.utilities.AbstractComponents;

public class AddressPage extends AbstractComponents{
	WebDriver driver;
	public AddressPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="orderSummaryPrimaryActionBtn")
	WebElement address;
	
	public void getAddress() {
		 address.click();
	}
	
	

}
