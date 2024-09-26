package automation.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomationIntro {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "");

        // Set Chrome options (optional)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Open Chrome maximized

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver(options);

        try {
            // Navigate to Google.com
            driver.get("https://www.google.com");

            // Print the title of the page
            System.out.println("Title of the page is: " + driver.getTitle());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}