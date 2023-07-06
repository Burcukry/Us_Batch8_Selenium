package Day05;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Navigate extends BaseDriver {

    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement element = driver.findElement(By.id("alerttest"));

        element.click();
        MyMethods.myWait(4);

        String currentUrl = driver.getCurrentUrl(); // gives the url of current page
        System.out.println("currentUrl = " + currentUrl);

        driver.navigate().back(); // Takes us to the previous page
        // driver.get() vs driver.navigate()
        // driver.get() -> doesn't allow us to go back and forth
        // driver.navigate() -> keeps the history so allows us to go back and forth
        System.out.println(driver.getCurrentUrl());
        MyMethods.myWait(3);
        driver.navigate().forward();

        waitAndQuit();
    }
}
