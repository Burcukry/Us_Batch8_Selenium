package Day04;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class _02_FindByName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

// Locators in Selenium
        // Id -> 99.99999% unique
        // Name
        // className
        // linkText
        // partialLinkText
        // tagName
        // css Selector
        // xpath

        WebElement nameInput = driver.findElement(By.name("q8_name[first]"));
        nameInput.sendKeys("Ragip");


        MyMethods.myWait(3);
        driver.quit();
    }
}
