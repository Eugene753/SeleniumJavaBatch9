package selenium.class10;

import Test.DriverControl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CalendarsHandeling {

    public static String url="http://delta.com/";

    public static void main(String[] args) {

        DriverControl.driverOpen(url);

        WebElement calendar=DriverControl.driver.findElement(By.id("calDepartLabelCont"));
        calendar.click();

        WebElement dMonth=DriverControl.driver.findElement(By.className("dl-datepicker-month-0"));
        String dMonthText=dMonth.getText();

        WebElement nextButton=DriverControl.driver.findElement(By.xpath("//span[text()='Next']"));

        while(!dMonthText.equals("July")){
            nextButton.click();
            dMonthText=dMonth.getText();
        }

        List<WebElement> departDates=DriverControl.driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));

        for(WebElement departDate:departDates){
            if(departDate.getText().equals("17")){
                departDate.click();
                break;
            }
        }

        WebElement returnMonth=DriverControl.driver.findElement(By.className("dl-datepicker-month-1"));

        String returnMonthtext=returnMonth.getText();

        while(!returnMonthtext.equals("September")){
            nextButton.click();
            returnMonthtext=returnMonth.getText();
        }

        List<WebElement> returnDates=DriverControl.driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-1']/tr/td"));

        for(WebElement returnDate:returnDates){
            if(returnDate.getText().equals("3")){
                returnDate.click();
                break;
            }
        }

        WebElement doneButton=DriverControl.driver.findElement(By.className("donebutton"));
        doneButton.click();

    }
}
