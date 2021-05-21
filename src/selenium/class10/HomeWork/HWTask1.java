package selenium.class10.HomeWork;

import Test.DriverControl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HWTask1 {

    public static String url="https://www.aa.com/homePage.do";

    public static void main(String[] args) throws InterruptedException {

        DriverControl.driverOpen(url);
        DriverControl.driver.manage().window().maximize();
        DriverControl.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement departCalendar=DriverControl.driver.findElement(By.id("aa-leavingOn"));
        departCalendar.click();

        WebElement dMounth1=DriverControl.driver.findElement(By.className("ui-datepicker-title"));

        String monthText=dMounth1.getText();

        while(!(monthText.contains("August"))){
            WebElement nextButton=DriverControl.driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a"));
            nextButton.click();
            WebElement dMounth2=DriverControl.driver.findElement(By.className("ui-datepicker-title"));
            monthText=dMounth2.getText();
        }

        List<WebElement> departDates=DriverControl.driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td"));

        for(WebElement departDate:departDates){
            if(departDate.getText().equals("7")){
                departDate.click();
                break;
            }
        }

        WebElement returnMonth=DriverControl.driver.findElement(By.id("aa-returningFrom"));
        returnMonth.click();

        WebElement monthReturnText=DriverControl.driver.findElement(By.className("ui-datepicker-month"));

        String returnMon=monthReturnText.getText();

        while(!returnMon.equals("November")){
            WebElement nextButton=DriverControl.driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a"));
            nextButton.click();
            WebElement monthReturnText2=DriverControl.driver.findElement(By.className("ui-datepicker-month"));
            returnMon=monthReturnText2.getText();
        }

        List<WebElement> returnDates=DriverControl.driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr/td"));

        for(WebElement returnDate:returnDates){
            if(returnDate.getText().equals("7")){
                returnDate.click();
                break;
            }
        }

        WebElement destination=DriverControl.driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[3]/div[1]/div/a/span[1]"));
        destination.click();

        WebElement country_region=DriverControl.driver.findElement(By.id("countryCode"));
        Select country_regionDD=new Select(country_region);

        List<WebElement> listOfCountries=country_regionDD.getOptions();

        for(WebElement country:listOfCountries){
            if(country.getText().equals("Austria")){
                country.click();
                break;
            }
        }

        List<WebElement> listOfAirports=DriverControl.driver.findElements(By.xpath("//tbody[@id='airportList']/tr/td[3]"));

        for(WebElement listAirport:listOfAirports){
            if(listAirport.getText().contains("GRZ")){
                listAirport.click();
                break;
            }
        }

        WebElement returnDestination=DriverControl.driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[3]/div[2]/div/a/span[1]"));
        returnDestination.click();

        for(WebElement country:listOfCountries){
            if(country.getText().equals("Bahamas")){
                country.click();
                break;
            }
        }

        List<WebElement> listOfAirports2=DriverControl.driver.findElements(By.xpath("//tbody[@id='airportList']/tr/td[3]"));

        for(WebElement listAirport:listOfAirports2){
            if(listAirport.getText().contains("ASD")){
                listAirport.click();
                break;
            }
        }

        WebElement buttonSearch=DriverControl.driver.findElement(By.id("flightSearchForm.button.reSubmit"));
        buttonSearch.click();

        DriverControl.driverQuit();
    }
}
