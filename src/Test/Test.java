package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static String url="https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\imark\\IdeaProjects\\SeleniumJavaBatch9\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        WebElement e_mailInput=driver.findElement(By.id("email-input"));
        e_mailInput.sendKeys("login@codility.com");
        WebElement passwordInput=driver.findElement(By.id("password-input"));
        passwordInput.sendKeys("password");
        WebElement loginButton=driver.findElement(By.id("login-button"));
        loginButton.click();
        WebElement text=driver.findElement(By.xpath("//div[@class='message success']"));
        System.out.println(text.isDisplayed());


        //WebElement welcomeTexValidCredentialst=driver.findElement(By.xpath("//div[text()='Welcome to Codility']"));
        //Assert.assertEquals("Welcome to Codility is visible",welcomeTexValidCredentialst.getText(),"Welcome to Codility");


        //WebElement invalidCredentialsText1=driver.findElement(By.xpath("//div[text()='You shall not pass! Arr!']"));
        //Assert.assertEquals("You shall not pass! Arr! is visible",invalidCredentialsText1.getText(),"You shall not pass! Arr!");


        // WebElement invalidCredentialsText2=driver.findElement(By.xpath("//div[text()='You shall not pass! Arr!']"));
        //Assert.assertEquals("Enter a valid email is visible",invalidCredentialsText2.getText(),"Enter a valid email");


        //WebElement textAfterEmptyPassword=driver.findElement(By.xpath("//div[text()='Password is required']"));
        //Assert.assertEquals("Password is required is visible",textAfterEmptyPassword.getText(),"Password is required");


    }
}
