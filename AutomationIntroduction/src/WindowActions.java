import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActions {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 Thread.sleep(1000);
		 driver.navigate().to("https://rahulshettyacademy.com/practice-project");
		 driver.manage().window().fullscreen();
		 Thread.sleep(1000);
		 driver.navigate().refresh();
		 Thread.sleep(1000);
		 driver.navigate().back();
		 Thread.sleep(1000);
		 driver.navigate().forward();
		 Thread.sleep(1000);
		 driver.manage().window().minimize();
		 Thread.sleep(1000);
		 driver.close();
		// TODO Auto-generated method stub

	}

}
