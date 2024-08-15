package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {


    public static WebElement signinEl(WebDriver driver){
        WebElement signinElement= driver.findElement(By.id("n-238369238407-membership-sign-in"));
        return signinElement;
    }
    public static WebElement emailEl(WebDriver driver){
        WebElement emailElement= driver.findElement(By.name("email"));
        return emailElement;
    }

    public static WebElement passwordEl(WebDriver driver){
        WebElement passwordElement= driver.findElement(By.name("password"));
        return passwordElement;
    }

    public static WebElement signinbuttonEl(WebDriver driver){
        WebElement signinbuttonElement= driver.findElement(By.tagName("button"));
        return signinbuttonElement;
    }

    public static WebElement errorrmessageforinvaliddataEl(WebDriver driver){
        WebElement errorrmessageforinvaliddataElement= driver.findElement(By.xpath("//*[@id=\"bs-6\"]/span/div/div/div/form/div[3]/p"));
        return errorrmessageforinvaliddataElement;
    }

    public static WebElement emailerrormessageEl(WebDriver driver){
        WebElement emailerrormessageElement= driver.findElement(By.xpath("//*[@id=\"bs-6\"]/span/div/div/div/form/div[1]/p"));
        return emailerrormessageElement;
    }

    public static WebElement passworderrorrmessageEl(WebDriver driver){
        WebElement passworderrorrmessageElement= driver.findElement(By.xpath("//*[@id=\"bs-6\"]/span/div/div/div/form/div[2]/p"));
        return passworderrorrmessageElement;
    }

    public static WebElement resetpasswordEl(WebDriver driver){
        WebElement resetpasswordElement= driver.findElement(By.xpath("//*[@id=\"bs-6\"]/span/div/div/div/form/div[4]/a"));
        return resetpasswordElement;
    }
    public static WebElement resetpasswordmessageEl(WebDriver driver){
        WebElement resetpasswordmessageElement= driver.findElement(By.cssSelector("#bs-6 > span > div > div > h2 > span"));
        return resetpasswordmessageElement;
    }
}
