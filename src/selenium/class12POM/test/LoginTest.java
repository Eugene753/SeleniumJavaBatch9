package selenium.class12POM.test;


import selenium.class12POM.pages.LoginPage;
import selenium.class12POM.testbase.BaseClass;


public class LoginTest {

    public static void main(String[] args) {
        BaseClass.setUpWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/viewPimModule");
        LoginPage loginPage=new LoginPage();
        loginPage.userNameField.sendKeys("Admin");
        loginPage.passwordField.sendKeys("Hum@nhrm123");
        loginPage.loginButton.click();

        BaseClass.tearDown();


    }
}
