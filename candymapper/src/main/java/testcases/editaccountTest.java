package testcases;


import Pages.RegisterPage;
import Pages.editaccountpage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class editaccountTest extends BaseTest {

    @Test(priority = 1,description = "edit account with valid data")
    public void editaccountwithvaliddata(){
        login("77mossttffaa@gmail.com","112233Mo@@");
        editaccountpage.editprofileEl(driver).click();

        RegisterPage.firstnameEL(driver).clear();
        RegisterPage.firstnameEL(driver).sendKeys("ali");

        RegisterPage.lastnameEL(driver).clear();
        RegisterPage.lastnameEL(driver).sendKeys("mohamed");

        RegisterPage.phoneEL(driver).clear();
        RegisterPage.phoneEL(driver).sendKeys("4444");
        editaccountpage.savechangesEl(driver).click();


        try {
            Thread.sleep(4444);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        editaccountpage.checkeditprofileEl(driver).click();
        String actualfirstname= RegisterPage.firstnameEL(driver).getAttribute("value");
        String expfirstname="ali";
        Assert.assertEquals(actualfirstname,expfirstname);

        String actuallastname= RegisterPage.lastnameEL(driver).getAttribute("value");
        String explastname="mohamed";
        Assert.assertEquals(actuallastname,explastname);
    }
    @Test(priority = 2,description = "edit account with empty data")
    public void editaccountwithemptydata(){
       login("77mossttffaa@gmail.com","112233Mo@@");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        editaccountpage.editprofileEl(driver).click();

        RegisterPage.firstnameEL(driver).clear();
        RegisterPage.firstnameEL(driver).sendKeys("");

        RegisterPage.lastnameEL(driver).clear();
        RegisterPage.lastnameEL(driver).sendKeys("");

        RegisterPage.phoneEL(driver).clear();
        RegisterPage.phoneEL(driver).sendKeys("");
        editaccountpage.savechangesEl(driver).click();
    }


}
