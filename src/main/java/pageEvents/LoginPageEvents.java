package main.java.pageEvents;

import main.java.pageobjects.LoginPageElements;
import main.java.utils.ElementFetch;
import org.testng.Assert;
import test.java.BaseProgramTest.baseTest;

public class LoginPageEvents {

    public void OrAngeHRMloginpage(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebelement("ID", LoginPageElements.username_ID).sendKeys("Admin");
        elementFetch.getWebelement("ID", LoginPageElements.password_ID).sendKeys("admin123");
        elementFetch.getWebelement("ID", LoginPageElements.LoginButton_ID).click();
        //baseTest.logger.info("Verifying the login text in the amazon sign in page");
        //Assert.assertTrue(elementFetch.getListWebelement("XPATH", LoginPageElements.SigninText).size()>0,"Login page didn't get open");
    }
}
