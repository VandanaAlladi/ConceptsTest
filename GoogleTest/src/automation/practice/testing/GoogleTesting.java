package automation.practice.testing;

import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleTesting{
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
      //  System.setProperty("webdriver.chrome.driver", "C:/Users/pc/Downloads/chromedriver-win64/chromedriver-win64.exe");

        // Set Chrome options (optional)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Open Chrome maximized

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver(options);

        try {
            // Navigate to Google.com
            driver.get("https://www.google.com");

            // Print the title of the pages
            System.out.println("Title of the page is: " + driver.getTitle());
        } finally {
            // Close the browser
            driver.quit();
        }
        
    }
}