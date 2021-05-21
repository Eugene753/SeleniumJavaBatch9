package selenium.class12POM.utils;



import org.openqa.selenium.WebElement;
import selenium.class12POM.testbase.BaseClass;

import java.util.concurrent.TimeUnit;

public class CommonMethods extends BaseClass {

    /**
     *
     * this method will clear textbox and send text
     *
     * @param element
     * @param text
     */

    public static void sendText(WebElement element,String text){
        element.clear();
        element.sendKeys(text);
    }


}
