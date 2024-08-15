package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class editaccountpage {

    public static WebElement editprofileEl(WebDriver driver){
        WebElement editprofileElement = driver.findElement(By.xpath("//a[@rel='' and @role='button' and @aria-haspopup='menu' and @data-ux='Link' and @data-typography='LinkAlpha' and text()='Edit Profile']"));
        return editprofileElement;
    }

    public static WebElement savechangesEl(WebDriver driver){
        WebElement savechangesElement = driver.findElement(By.xpath("//*[@id=\"bs-6\"]/span/div/div/div/div[2]/div/form/div[2]/button"));
        return savechangesElement;
    }
    public static WebElement checkeditprofileEl(WebDriver driver){
        WebElement checkeditprofileElement = driver.findElement(By.xpath("//*[@id=\"bs-6\"]/span/div/div/div/div[2]/div[3]/a"));
        return checkeditprofileElement;
    }


}
