package Day06;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_CssSelector3 extends BaseDriver {
    public static void main(String[] args) {
        /**
         * Go to "https://formsmarts.com/form/yu?mode=h5"
         * Select Business
         * Click on Discover XYZ and select Online Advertising
         * Select Every Day
         * Select Good
         * Click on XYZ and select the 3rd option
         *
         * Use Css Selector only
         *
         * **/

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        MyMethods.myWait(3);
        WebElement businessOption = driver.findElement(By.cssSelector("input[value='Business']"));
        businessOption.click();

        MyMethods.myWait(3);
        WebElement element1 = driver.findElement(By.cssSelector("div[id='section_1'] select[id='u_yQt_4588']"));
        element1.click();

        MyMethods.myWait(3);
        WebElement selectName=driver.findElement(By.cssSelector("select[name=u_yQt_4588] option[value='Online Advertising'"));
        selectName.click();

        MyMethods.myWait(3);
        WebElement everyDay = driver.findElement(By.cssSelector("label[for='u_yQt_89585_0']>span[class='label-body']"));
        everyDay.click();

        MyMethods.myWait(3);
        WebElement goodRadioButton = driver.findElement(By.cssSelector("input[name$='4589'][value='Good']"));
        goodRadioButton.click();

        MyMethods.myWait(3);
        WebElement XYZSelect = driver.findElement(By.cssSelector("select[name^='u_yQt'][id='u_yQt_4588']"));
        XYZSelect.click();

        MyMethods.myWait(3);
        WebElement experience = driver.findElement(By.cssSelector("select[id='u_yQt_4597']>:nth-child(4)"));
        experience.click();

        waitAndQuit();
    }
}
