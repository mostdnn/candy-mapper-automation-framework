package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static Pages.loginPage.*;


public class BaseTest {

    public  WebDriver driver;


    @BeforeTest
    public void setup() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
        driver = new ChromeDriver();
        FileReader Read=new FileReader("src\\test\\java\\configfiles\\config.properties");
        Properties prop=new Properties();
        prop.load(Read);
        driver.manage().window().maximize(); // Set full-screen mode
        driver.get(prop.getProperty("url"));
    }

    public void login(String email,String password){
        driver.findElement(By.xpath("//*[@id=\"popup-widget238491-close-icon\"]")).click();
        WebElement pathElement = driver.findElement(By.cssSelector("path[d='M16.056 8.255a4.254 4.254 0 1 1-8.507 0 4.254 4.254 0 0 1 8.507 0zm3.052 11.71H4.496a.503.503 0 0 1-.46-.693 8.326 8.326 0 0 1 7.766-5.328 8.326 8.326 0 0 1 7.766 5.328.503.503 0 0 1-.46.694z']"));
        pathElement.click();
        signinEl(driver).click();
        emailEl(driver).sendKeys(email);
        passwordEl(driver).sendKeys(password);
        signinbuttonEl(driver).click();

    }

    @AfterMethod
    public void aftermethod(){
        driver.quit();
    }

@AfterTest
public void aftertest(){
    driver.quit();
}



    @BeforeMethod
    public void beformethod() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
        driver = new ChromeDriver();
        FileReader Read=new FileReader("src\\test\\java\\configfiles\\config.properties");
        Properties prop=new Properties();
        prop.load(Read);
        driver.manage().window().maximize(); // Set full-screen mode
        driver.get(prop.getProperty("url"));
    }




}
