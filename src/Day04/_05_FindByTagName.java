package Day04;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindByTagName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.amazon.com/");
//
//        List<WebElement> linksOnAmazon = driver.findElements(By.tagName("a"));
//
//        for (WebElement e : linksOnAmazon) {
//            System.out.println(e.getAttribute("href"));
//        }

        driver.get("https://form.jotform.com/221934510376353");
        List<WebElement> labels = driver.findElements(By.tagName("label"));
        for (WebElement e : labels) {
            System.out.println(e.getText());
        }

        MyMethods.myWait(3);
        driver.quit();
    }
}
