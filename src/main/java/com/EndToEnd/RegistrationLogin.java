package com.EndToEnd;

import com.Base.BaseClass;
import com.Opencart.LoginTest;
import com.Opencart.Registration;

public class RegistrationLogin extends BaseClass {

    public static void main(String[] args) throws InterruptedException {
        chrome_launch();
        open_URL("https://demo.opencart.com");
        Registration.TC_Registration_001();
        Thread.sleep(3000);
        driver.navigate().to("https://demo.opencart.com/index.php?route=account/login");
        LoginTest.TC_Login_001();
    }

}
