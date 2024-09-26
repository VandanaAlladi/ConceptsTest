
package automation.testing;

import org.openqa.selenium.WebDriver;





import org.openqa.selenium.chrome.ChromeDriver;


public class AutomationTesting {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\edgedriver_win64.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com");
		
		
	}

}
