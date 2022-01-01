package Dataprovider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DP_LoginTest {
    public static WebDriver driver;

    //Extent report
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports reports;
    public static ExtentTest test;

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
    @Test(dataProvider = "LoginData_valid")
    public static void valid_TestCase(String DP_Email, String DP_Pass){

        //Implement Extent Report
        htmlReporter =new ExtentHtmlReporter("./ExtentReports/LoginTest_DataProvider.html");
        reports=new ExtentReports();
        reports.attachReporter(htmlReporter);

        //Information add to Report
        reports.setSystemInfo("Project Name","Opencart");
        reports.setSystemInfo("Module Name","Login");
        reports.setSystemInfo("Browser","Chrome");
        reports.setSystemInfo("Test by","Muntasir");


        test=reports.createTest("Login test");

        WebElement Email=driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys(DP_Email);
        test.log(Status.INFO,"Email Type: "+DP_Email);

        WebElement Password=driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys(DP_Pass);
        test.log(Status.INFO,"Pass Type: "+DP_Pass);

        WebElement LoginBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        LoginBtn.click();
        test.log(Status.INFO,"Login Button click");
        System.out.println("Valid TestCase Executed");

        test.log(Status.PASS,"Test Case Executed.");

        reports.flush();
    }


    @DataProvider(name="LoginData_invalid")
    public Object [][] data(){

        Object [][] data=new Object[4][2];

        //set 1
        data [0][0]="mail1@test.com";
        data [0][1]="1231232";

        //set 2
        data [1][0]="mail2@test.com";
        data [1][1]="1231232";

        //set 3
        data [2][0]="mail3@test.com";
        data [2][1]="1231232";

        //set 4
        data [3][0]="mail3@test.com";
        data [3][1]="1231232";

        return data;
    }
    @DataProvider(name="LoginData_valid")
    public Object [][] data2(){

        Object [][] data2=new Object[1][2];

        //set 1
        data2 [0][0]="mail101@gmail.com";
        data2 [0][1]="123456";


        return data2;
    }

}
