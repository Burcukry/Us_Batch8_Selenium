package Day04;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _03_FindByClassName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement nameInput = driver.findElement(By.className("form-textbox"));
        nameInput.sendKeys("ragip"); // There are multiple elements that have the same className
                                                // In this case selenium gets the first element

        List<WebElement> labels = driver.findElements(By.className("form-sub-label"));  // returns a list of all of the elements
                                                                                        // that have the same locator
        for (WebElement e: labels){
            System.out.println(e.getText());
        }

        // findElement() -> NoSuchElementException
        // findElements() -> returns an empty list

        List<WebElement> elements = driver.findElements(By.className("WrongClassName"));
        System.out.println(elements.size());


        MyMethods.myWait(3);
        driver.quit();
    }
}
