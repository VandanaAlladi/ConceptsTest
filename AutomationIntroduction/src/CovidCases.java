import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class CovidCases {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.covid19india.org/");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("(//table[@class='has-fixed-layout'])[2]"))).build()
				.perform();

		List<WebElement> states = driver
				.findElements(By.xpath("(//table[@class='has-fixed-layout'])[2]/tbody/tr/td[1]"));
		List<WebElement> activeCases = driver
				.findElements(By.xpath("(//table[@class='has-fixed-layout'])[2]/tbody/tr/td[2]"));
		System.out.println(states.size());

		// TODO Auto-generated method stub

		for (int i = 1; i < states.size(); i++) {
			//System.out.println("for loop");

			if ((states.get(i).getText()).contains("Tamil Nadu")) {
				System.out.println("state:");
				System.out.println(states.get(i).getText());
				System.out.println("activeCases");
				System.out.println(activeCases.get(i).getText());
			}

		}

	}

}
