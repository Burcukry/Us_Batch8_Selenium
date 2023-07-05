package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static void getDriver(){

        Logger logger= Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        // Waits for 15 secs for page to be loaded.
        // if it takes more than 15 secs to a page being loaded it throws an exception
        // PageLoad = waits all html files are downloaded to our computer but they are not visible on our browser yet.

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // waits until all elements on a webpage are visible on our browser.
        // if it is not done in 15 secs it throws an exception



    }
}
