package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.UtilitiesMain;

public class LoginTest extends UtilitiesMain {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        // send text to login field.
            // Enter username in field
        sendTextToElement(By.name("username"),"Admin");

        // enter password field
        sendTextToElement(By.name("password"),"admin123");

       // click on login button
        clickOnElement(By.xpath("//button[@type='submit']"));

        // check verify message occured
        String expectedMessage = "Dashboard";

        String actualTextMessage=getTextFromElement(By.xpath("//h6[contains(@class,'header-breadcrumb-module')]"));

        //Validate actual and expected message
        Assert.assertEquals("Dashboard", expectedMessage, actualTextMessage);

    }


}
