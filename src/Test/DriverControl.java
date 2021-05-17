package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverControl {

    public static WebDriver driver;

    public static void driverOpen(String url){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumJavaBatch9\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);

    }

    public static void driverQuit(){
        driver.quit();
    }

    public static void driveClose(){
        driver.close();
    }

    public static void main(String[] args) {

       driverOpen("https://the-internet.herokuapp.com/dynamic_controls");


       driveClose();


    }
}
