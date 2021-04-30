package selenium.class04.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement inputUserName=driver.findElement(By.cssSelector("input#txtUsername"));
        inputUserName.sendKeys("Admin");
        WebElement inputPassword=driver.findElement(By.cssSelector("input#txtPassword"));
        inputPassword.sendKeys("Hum@nhrm123");
        WebElement loginButton=driver.findElement(By.cssSelector("input[id='btnLogin']"));
        loginButton.click();
        WebElement syntax=driver.findElement(By.xpath("//img[contains(@src,'syntax')]"));

        if(syntax.isDisplayed()){
            System.out.println("Syntax is displayed - true");
        }else{
            System.out.println("Syntax is displayed - false");
        }
        Thread.sleep(2000);

        driver.quit();

    }
}
