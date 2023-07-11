package Day07;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_XpathExapmle extends BaseDriver {

    /**
     * Go to "https://www.saucedemo.com/"
     * Login
     * Click on Sauce Labs Backpack and add it to cart
     * Go back
     * Click on Sauce Labs Bolt T-Shirt and add it to cart
     * Go back
     * Click on Cart
     * Click on Check Out
     * Verify that total amount is equal to the sum of the products in the cart
     * <p>
     * Use XPATH
     **/

    @Test
    public void test1() {
        driver.get("https://www.saucedemo.com/");

        MyMethods.myWait(1);
        WebElement userNameInput = driver.findElement(By.xpath("//input[@id='user-name']"));
        userNameInput.sendKeys("standard_user");

        MyMethods.myWait(1);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        MyMethods.myWait(1);
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();

        MyMethods.myWait(1);
        WebElement product1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        product1.click();

        MyMethods.myWait(1);
        WebElement addToCardButton1 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addToCardButton1.click();

        MyMethods.myWait(1);
        WebElement goBackButton = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        goBackButton.click();

        MyMethods.myWait(1);
        WebElement product2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        product2.click();

        MyMethods.myWait(1);
        WebElement addToCardButton2 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addToCardButton2.click();
        MyMethods.myWait(1);
        driver.navigate().back();

        MyMethods.myWait(1);
        WebElement cartButton = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cartButton.click();

        MyMethods.myWait(1);
        WebElement checkOutButton = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkOutButton.click();

        MyMethods.myWait(1);
        WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstName.sendKeys("Batch 8");

        MyMethods.myWait(1);
        WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastName.sendKeys("Snow");

        MyMethods.myWait(1);
        WebElement zipCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipCode.sendKeys("345676");

        MyMethods.myWait(1);
        WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
        continueButton.click();

        MyMethods.myWait(1);
        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double total = 0;
        for (WebElement p : productList) {
            //p.getText().replaceAll("[^0-9,.]","");

            total += Double.parseDouble(p.getText().substring(1));
        }

        System.out.println(total);
        WebElement subTotal = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));

        double subTotalDouble = Double.parseDouble(subTotal.getText().replaceAll("[^0-9,.]", ""));

        Assert.assertTrue("Test Failed",subTotalDouble==total);

        waitAndQuit();


    }
}
