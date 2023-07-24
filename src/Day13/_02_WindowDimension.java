package Day13;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.Dimension;

public class _02_WindowDimension extends BaseDriver {

    @Test
    public void changeWindowSize(){

        driver.get("https://opensource-demo.orangehrmlive.com/");
        MyMethods.myWait(3);
        Dimension dimension = new Dimension(412,915);
        driver.manage().window().setSize(dimension);

        waitAndQuit();




    }
}
