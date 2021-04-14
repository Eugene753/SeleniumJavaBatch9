package selenium.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        String title=driver.getTitle();
        if(title.equalsIgnoreCase("Facebook - Log in or Sign up")){
            System.out.println("Title is Right");
        }else{
            System.out.println("Title is Wrong");
        }
        driver.quit();

    }
}
