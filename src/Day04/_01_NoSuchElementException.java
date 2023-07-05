package Day04;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_NoSuchElementException {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement firstNameInput = driver.findElement(By.id("first_8"));
        firstNameInput.sendKeys("Ragip");

        WebElement lastNameInputBox = driver.findElement(By.id("last_8"));
        lastNameInputBox.sendKeys("Tolegen");
        try {
            WebElement wrongLocator = driver.findElement(By.id("Wrong Id")); // If the locator is wrong or
            // there is no element with that
            //locator Selenium throws NoSuchElement Exception

        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
//        MyMethods.myWait(3);
//        firstNameInput.clear(); // Clears the text inside an input box
//        MyMethods.myWait(3);
//        lastNameInputBox.clear();

        WebElement firstNameLabel = driver.findElement(By.id("sublabel_8_first"));
        String firstNameText = firstNameLabel.getText();
        System.out.println(firstNameText);

        WebElement submitButton = driver.findElement(By.id("input_2"));
        submitButton.click(); // Clicks on an element


        MyMethods.myWait(3);
        driver.quit();
    }
}
