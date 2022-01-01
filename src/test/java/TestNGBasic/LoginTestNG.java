package TestNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginTestNG {
   public static WebDriver driver;

    @BeforeSuite
    public static void chrome_launch(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        System.out.println("Before Suite Executed.");
    }
    @AfterSuite
    public static void chrome_close(){
        driver.close();
        System.out.println("After Suite Executed.");
    }

    @BeforeTest
    public static void before_test(){
        System.out.println("Before test Executed.");
    }

    @AfterTest
    public static void after_test(){
        System.out.println("After test Executed.");
    }

    @BeforeMethod
    public static void before_method(){
        System.out.println("Before method Executed.");
    }
    @AfterMethod
    public static void chrome_method(){
        System.out.println("After method Executed.");
    }
    @Test(description = "Email and password are valid")
    public static void valid_TestCase(){
        WebElement Email=driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("user101@mail.com");

        WebElement Password=driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("123456");

        WebElement LoginBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        LoginBtn.click();
        System.out.println("Valid TestCase Executed");
    }
    @Test(description = "Email and pass are invalid")
    public static void invalid_TestCase(){
        WebElement Email=driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("sdsdasasdsd");

        WebElement Password=driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("Telephone");

        WebElement LoginBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        LoginBtn.click();
        System.out.println("Valid TestCase Executed");
    }

/*
Before test Executed.
Before Class Executed.
Before method Executed.
Valid TestCase Executed
After method Executed.
Before method Executed.
Valid TestCase Executed
After method Executed.
After Class Executed.
After test Executed.
 */

}
