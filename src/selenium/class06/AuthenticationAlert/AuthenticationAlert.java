package selenium.class06.AuthenticationAlert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {

    public static String url="http://test:test@abcdatabase.com/basicauth";
                                    //username:password@

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumJavaBatch9\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
    }
}
