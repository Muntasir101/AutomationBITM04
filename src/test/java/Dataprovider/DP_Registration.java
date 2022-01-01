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

public class DP_Registration {
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
    @Test(dataProvider = "Registration_Data")
    public static void valid_TestCase(String firstName,
                                      String lastName,
                                      String Email,
                                      String Telephone,
                                      String Password,
                                      String ConfirmPassword){

        //Implement Extent Report
        htmlReporter =new ExtentHtmlReporter("./ExtentReports/LoginTest_DataProvider.html");
        reports=new ExtentReports();
        reports.attachReporter(htmlReporter);

        //Information add to Report
        reports.setSystemInfo("Project Name","Opencart");
        reports.setSystemInfo("Module Name","Login");
        reports.setSystemInfo("Browser","Chrome");
        reports.setSystemInfo("Test by","Muntasir");

        test=reports.createTest("Registration test");

        //Registration code



        reports.flush();
    }


    @DataProvider(name="Registration_Data")
    public Object [][] data(){

        Object [][] data=new Object[2][6];

        //set 1
        data [0][0]="first Name";
        data [0][1]="last name";
        data [0][2]="email@test.com";
        data [0][3]="123123";
        data [0][4]="123456";
        data [0][5]="123456";

        //set 2
        data [1][0]="first Name";
        data [1][1]="last name";
        data [1][2]="email@test.com";
        data [1][3]="123123";
        data [1][4]="123456";
        data [1][5]="123456";

        return data;
    }

}
