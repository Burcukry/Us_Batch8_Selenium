package Day03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningNewWebSite {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // Creates a WebDriver object and opens a new Chrome page
       // WebDriver driver1 = new FirefoxDriver();
       // WebDriver driver2 = new EdgeDriver();



        driver.get("https://www.google.com/");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.quit(); // closes the browser
        //driver.close(); // closes only yhe active tab
    }
}
