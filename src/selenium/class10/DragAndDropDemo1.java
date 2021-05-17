package selenium.class10;

import Test.DriverControl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

public class DragAndDropDemo1 {

    public static String url="https://jqueryui.com/droppable/";

    public static void main(String[] args) {

        DriverControl.driverOpen(url);
        DriverControl.driver.switchTo().frame(0);
        WebElement draggable=DriverControl.driver.findElement(By.id("draggable"));
        WebElement droppable=DriverControl.driver.findElement(By.id("droppable"));

        Actions action=new Actions(DriverControl.driver);
        //action.dragAndDrop(draggable,droppable).perform();
        action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();

    }
}
