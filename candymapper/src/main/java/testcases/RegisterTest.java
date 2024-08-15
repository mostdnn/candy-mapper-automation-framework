package testcases;

import Pages.RegisterPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {





@Test(priority = 1,description = "create an account with valid data")
public void Registerwithvaliddatatest() throws InterruptedException {
    RegisterPage.PopupEl(driver).click();
    Thread.sleep(5000);
    RegisterPage.iconaccountEL(driver).click();
    RegisterPage.createccountEL(driver).click();
    RegisterPage.firstnameEL(driver).sendKeys("mostafa");
    RegisterPage.lastnameEL(driver).sendKeys("ramadan");
   RegisterPage.emailEL(driver).sendKeys("mostafabu@gmail.com");
    RegisterPage.phoneEL(driver).sendKeys("01023245");
    RegisterPage.RegisterbuttonEL(driver).click();

}
@Test(priority = 2,description = "create account with non valid email address")
public void Rgegisterwithnonvalidemail(){
    RegisterPage.PopupEl(driver).click();
    RegisterPage.iconaccountEL(driver).click();
    RegisterPage.createccountEL(driver).click();
   RegisterPage.firstnameEL(driver).sendKeys("mostafa");
   RegisterPage.lastnameEL(driver).sendKeys("ramadan");
    RegisterPage.emailEL(driver).sendKeys("1313sdsd");
    RegisterPage.phoneEL(driver).sendKeys("01023245");
    RegisterPage.RegisterbuttonEL(driver).click();
    String actualerrormessage= RegisterPage.errormessageEL(driver).getText();
    String experrormessage="Enter a valid email address.";
    Assert.assertEquals(actualerrormessage,experrormessage);
}
    @Test(priority = 3,description = "create account with empty firstname ")
    public void Rgegisterwithemptyfirstname(){
        RegisterPage.PopupEl(driver).click();
        RegisterPage.iconaccountEL(driver).click();
        RegisterPage.createccountEL(driver).click();
        RegisterPage.firstnameEL(driver).sendKeys("");
        RegisterPage.lastnameEL(driver).sendKeys("ramadan");
        RegisterPage.emailEL(driver).sendKeys("mostafabu@gmail.com");
        RegisterPage.phoneEL(driver).sendKeys("01023245");
        RegisterPage.RegisterbuttonEL(driver).click();
        String actualerrormessage= RegisterPage.firstnameerrorrmessageEL(driver).getText();
        String experrormessage="Enter your first name.";
        Assert.assertEquals(actualerrormessage,experrormessage);

    }
    @Test(priority = 4,description = "create account with empty lastname ")
    public void Rgegisterwithemptylastname(){
        RegisterPage.PopupEl(driver).click();
        RegisterPage.iconaccountEL(driver).click();
        RegisterPage.createccountEL(driver).click();
        RegisterPage.firstnameEL(driver).sendKeys("mostafa");
        RegisterPage.lastnameEL(driver).sendKeys("");
        RegisterPage.emailEL(driver).sendKeys("mostafabu@gmail.com");
        RegisterPage.phoneEL(driver).sendKeys("01023245");
        RegisterPage.RegisterbuttonEL(driver).click();
        String actualerrormessage= RegisterPage.lastnameerrorrmessageEL(driver).getText();
        System.out.println(actualerrormessage);
        String experrormessage="Enter your last name.";
        Assert.assertEquals(actualerrormessage,experrormessage);
    }
    @Test(priority = 5,description = "create account with empty email ")
    public void Rgegisterwithemptyemail(){
        RegisterPage.PopupEl(driver).click();
        RegisterPage.iconaccountEL(driver).click();
        RegisterPage.createccountEL(driver).click();
        RegisterPage.firstnameEL(driver).sendKeys("mostafa");
        RegisterPage.lastnameEL(driver).sendKeys("Ramadan");
        RegisterPage.emailEL(driver).sendKeys("");
        RegisterPage.phoneEL(driver).sendKeys("01023245");
        RegisterPage.RegisterbuttonEL(driver).click();
        String actualerrormessage= RegisterPage.emailerrorrmessageEL(driver).getText();
        String experrormessage="Enter a valid email address.";
        Assert.assertEquals(actualerrormessage,experrormessage);

    }



}
