package rahulshettyacademy.FrameWorkDesign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.utilities.AbstractComponents;

public class AmazonSearch extends AbstractComponents {
	WebDriver driver;
	public AmazonSearch(WebDriver driver) {
		super(driver);
		impWait();
		this.driver=driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	

	@FindBy(id="twotabsearchtextbox")
	WebElement searchBar;
	
	@FindBy(xpath="//div[@class='a-section a-spacing-small a-spacing-top-small']")
	List<WebElement> phones;
	
	@FindBy(xpath="//div[@class='a-section a-spacing-small a-spacing-top-small']")
	WebElement phoneProduct;
	
	
	By brandRefinement=By.xpath("(//div[@id='brandsRefinements']//span[@class='a-list-item']/a/span)[1]");
	
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile Phones 5G",Keys.ENTER);
	public ProceedToCart searchforProducts(String product) throws InterruptedException {
		searchBar.sendKeys(product);
		searchBar.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//refine();
		 addToCart();
		 Thread.sleep(2000);
		 
		 return new ProceedToCart(driver);
			 
		}

	
	/*public void refine() {
		driver.findElement(brandRefinement).click();
		driver.findElement(By.xpath("//span[text()='5G']")).click();
	}*/
	
	public List<WebElement> findProducts() {
		waitForElementToAppear(phoneProduct);
		return phones;
	}
	
	public void addToCart() {
		for(int i=2;i<=6;i++) {
			
			//System.out.println("in for loop "+i);
		
		WebElement produc=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])["+i+"]"));
		String producTitle=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])["+i+"]//h2")).getText();
		System.out.println(producTitle);
		waitForElementToAppear(produc);
		//for(int k=2; k<=6;k++) {
			//System.out.println("in if block");
			
			WebElement buttonAddtoCart =driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])["+i+"]//button[text()='Add to cart']"));
			waitForElementToAppear(buttonAddtoCart);
			buttonAddtoCart.click();
		}
		
	}
		
		
	}
	
	
	
	//driver.findElement(By.xpath("(//div[@id='brandsRefinements']//span[@class='a-list-item']/a/span)[1]")).click();
	
	
	//List<WebElement> phones=driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));



