package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {


    public static WebElement PopupEl(WebDriver driver){
        WebElement PopupElement= driver.findElement(By.xpath("//*[@id=\"popup-widget238491-close-icon\"]"));
        return PopupElement;
    }

    public static WebElement iconaccountEL (WebDriver driver){
        WebElement iconaccountElement= driver.findElement(By.cssSelector("path[d='M16.056 8.255a4.254 4.254 0 1 1-8.507 0 4.254 4.254 0 0 1 8.507 0zm3.052 11.71H4.496a.503.503 0 0 1-.46-.693 8.326 8.326 0 0 1 7.766-5.328 8.326 8.326 0 0 1 7.766 5.328.503.503 0 0 1-.46.694z']"));
        return iconaccountElement;
    }

    public static WebElement createccountEL (WebDriver driver){
        WebElement createaccountElement= driver.findElement(By.id("n-238369238407-membership-create-account"));
        return createaccountElement;
    }

    public static WebElement firstnameEL (WebDriver driver){
         WebElement firstnameElement= driver.findElement(By.name("nameFirst"));
        return firstnameElement;
    }

    public static WebElement lastnameEL (WebDriver driver){
        WebElement lastnameElement= driver.findElement(By.name("nameLast"));
        return lastnameElement;
    }

    public static WebElement emailEL (WebDriver driver){
        WebElement emailElement= driver.findElement(By.name("email"));
        return emailElement;
    }

    public static WebElement phoneEL (WebDriver driver){
        WebElement phoneElement= driver.findElement(By.name("phone"));
        return phoneElement;
    }
    public static WebElement RegisterbuttonEL (WebDriver driver){
        WebElement RegisterbuttonElement= driver.findElement(By.tagName("button"));
        return RegisterbuttonElement;
    }


    public static WebElement errormessageEL (WebDriver driver){
        WebElement errormessageElement= driver.findElement(By.xpath("//*[@id=\"bs-6\"]/span/div/div/div/form/div[3]/p"));
        return errormessageElement;
    }
    public static WebElement firstnameerrorrmessageEL (WebDriver driver){
        WebElement  firstnameerrorrmessageElement= driver.findElement(By.xpath("//*[@id=\"bs-6\"]/span/div/div/div/form/div[1]/p"));
        return firstnameerrorrmessageElement;
    }
    public static WebElement lastnameerrorrmessageEL (WebDriver driver){
        WebElement  lastnameerrorrmessageElement= driver.findElement(By.xpath("//*[@id=\"bs-6\"]/span/div/div/div/form/div[2]/p"));
        return lastnameerrorrmessageElement;
    }
    public static WebElement emailerrorrmessageEL (WebDriver driver){
        WebElement  emailrrorrmessageElement= driver.findElement(By.xpath("//*[@id=\"bs-6\"]/span/div/div/div/form/div[3]/p"));
        return emailrrorrmessageElement;
    }
}
