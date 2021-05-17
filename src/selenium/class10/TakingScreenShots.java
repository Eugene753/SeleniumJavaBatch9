package selenium.class10;

import Test.DriverControl;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class TakingScreenShots {

    public static String url="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx";

    public static void main(String[] args) {

        DriverControl.driverOpen(url);
        WebElement userName=DriverControl.driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester", Keys.TAB);
        WebElement password=DriverControl.driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test",Keys.ENTER);

        TakesScreenshot ts=(TakesScreenshot) DriverControl.driver;

        File sourceFile=ts.getScreenshotAs(OutputType.FILE);//the screenshot is taken

        try {
            FileUtils.copyFile(sourceFile,new File("screenshots/SmartBear/adminLogin.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
