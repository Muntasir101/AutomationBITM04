package com.Opencart;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoginTest_properties extends BaseClass {
    public static void main(String[] args) throws IOException {
        firefox_launch();
        open_URL("https://demo.opencart.com/index.php?route=account/login");
        TC_Login_001();
    }
    public static void TC_Login_001() throws IOException {
        FileInputStream fis=new FileInputStream("./src/PropertiesFiles/config.properties");
        Properties prop=new Properties();
        prop.load(fis);

        findElementByIdAndType("input-email",prop.getProperty("valid_Email"));
        findElementByIdAndType("input-password","123456");
        findElementByXpathAndClick("//*[@id=\"content\"]/div/div[2]/div/form/input");
        getVisiblePartScreenshots("NewImage");

    }
}
