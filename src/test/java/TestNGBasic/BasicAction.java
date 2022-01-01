package TestNGBasic;

import org.testng.annotations.*;

public class BasicAction {

    @BeforeTest
    public static void browserConfig(){
        System.out.println("Successfully Browser Config");
    }

    @AfterTest
    public static void closeTest(){
        System.out.println("Browser Close");
    }
    @BeforeMethod
    public static void OpenTestUrl(){
        System.out.println("URL launched");
    }

    @AfterMethod
    public static void Verification(){
        System.out.println("Verification DONE");
    }
    @Test
    public static void testCase_001(){
        System.out.println("Test Case 1 Executed");
    }
    @Test
    public static void testCase_002(){
        System.out.println("Test Case 2 Executed");
    }
}
