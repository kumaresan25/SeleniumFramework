package main.java.pageEvents;
import main.java.pageobjects.skypeLoginPageElements;
import main.java.utils.ElementFetch;
import test.java.BaseProgramTest.baseTest;

import java.util.concurrent.TimeUnit;
import test.java.BaseProgramTest.baseTest;


public class skypeloginevent {
    public void SkypeLogin(){
        ElementFetch elementFetch = new ElementFetch();
        baseTest.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        elementFetch.getWebelement("XPATH", skypeLoginPageElements.SkyUsername_Xpath).sendKeys("skumaresan246@gmail.com");
        baseTest.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        elementFetch.getWebelement("XPATH", skypeLoginPageElements.SkyNextbutton_Xpath).click();
        baseTest.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        elementFetch.getWebelement("XPATH", skypeLoginPageElements.Skypassword_Xpath).sendKeys("dhana@123");
        baseTest.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        elementFetch.getWebelement("XPATH", skypeLoginPageElements.SkySignin_Xpath).click();

        //baseTest.logger.info("Verifying the login text in the amazon sign in page");
        //Assert.assertTrue(elementFetch.getListWebelement("XPATH", LoginPageElements.SigninText).size()>0,"Login page didn't get open");
    }



}
