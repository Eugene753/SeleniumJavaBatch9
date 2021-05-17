package selenium.class10;

import Test.DriverControl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo1 {

    public static String url="https://www.amazon.com/";

    public static void main(String[] args) {

        DriverControl.driverOpen(url);

        WebElement accountsAndList=DriverControl.driver.findElement(By.id("nav-link-accountList"));
        Actions action=new Actions(DriverControl.driver);
        action.moveToElement(accountsAndList).perform();


    }
}
