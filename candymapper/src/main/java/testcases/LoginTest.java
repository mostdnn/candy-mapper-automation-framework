package testcases;

import Pages.RegisterPage;
import Pages.loginPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
@Test(priority = 1,description = "log in with valid data")
  public void loginwithvaliddata(){
  login("77mossttffaa@gmail.com","112233Mo@@");

}
  @Test(priority = 2,description = "log in with invalid email")
  public void loginwithinvalidemail(){
    login("mos@gmail.com","112233Mo@@");
    String actualerrorrmessage= loginPage.errorrmessageforinvaliddataEl(driver).getText();
    String experrormessage="The password/email address combo is incorrect.";
    Assert.assertEquals(actualerrorrmessage,experrormessage);
  }
  @Test(priority = 3,description = "log in with invalid password ")
  public void loginwithinvalidpassord(){
    login("77mossttffaa@gmail.com","23@56");
    String actualerrorrmessage= loginPage.errorrmessageforinvaliddataEl(driver).getText();
    String experrormessage="The password/email address combo is incorrect.";
    Assert.assertEquals(actualerrorrmessage,experrormessage);
  }
  @Test(priority = 4,description = "log in with  empty data ")
  public void loginwithemptyemail(){
    login("","");
    String actualemailerrorrmessage= loginPage.emailerrormessageEl(driver).getText();
    String expemailerrormessage="Enter a valid email address.";
    Assert.assertEquals(actualemailerrorrmessage,expemailerrormessage);
    String actualpassworderrorrmessage= loginPage.passworderrorrmessageEl(driver).getText();
    String exppassworderrormessage="Passwords can’t be nothing.";
    Assert.assertEquals(actualpassworderrorrmessage,exppassworderrormessage);


  }

  @Test(priority = 5,description = "verify password is hidden ")
  public void verifypasswordishidden (){
    RegisterPage.PopupEl(driver).click();
    RegisterPage.iconaccountEL(driver).click();
    loginPage.signinEl(driver).click();
    // Verify the type attribute of the password input field
    Assert.assertEquals(loginPage.passwordEl(driver).getAttribute("type"), "password");
    loginPage.passwordEl(driver).sendKeys("112233Mo@@");
    // Verify that the actual text in the field is not visible
    Assert.assertNotEquals(loginPage.passwordEl(driver).getAttribute("value"), "112233Mo@@","Password should be hidden in the input field");
  }

  @Test(priority = 6,description = "reset the password")
  public void resetpassword(){
    RegisterPage.PopupEl(driver).click();
    RegisterPage.iconaccountEL(driver).click();
      try {
          Thread.sleep(3000);
      } catch (InterruptedException e) {
          throw new RuntimeException(e);
      }
      loginPage.signinEl(driver).click();
    loginPage.resetpasswordEl(driver).click();
    loginPage.emailEl(driver).sendKeys("mosta@gmail.com");
    String expmessage="Request Sent!";
    String acualmessage= loginPage.resetpasswordmessageEl(driver).getText();
    System.out.println(acualmessage);

  }




}
