package com.Opencart;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.log.Log;

public class Registration extends BaseClass {
    public static void main(String[] args) {
        chrome_launch();
        open_URL("https://demo.opencart.com");
        TC_Registration_001();
    }
    public static void TC_Registration_001(){
        WebElement MyAccount= driver.findElement(By.linkText("My Account"));
        MyAccount.click();

        WebElement Register=driver.findElement(By.linkText("Register"));
        Register.click();

        WebElement FirstName= driver.findElement(By.id("input-firstname"));
        FirstName.clear();
        FirstName.sendKeys("Muntasir");

        WebElement LastName= driver.findElement(By.id("input-lastname"));
        LastName.clear();
        LastName.sendKeys("Abdullah");

        WebElement Email= driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys(TestEmail);

        WebElement Telephone= driver.findElement(By.id("input-telephone"));
        Telephone.clear();
        Telephone.sendKeys("Telephone");

        WebElement Password= driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("Telephone");

        WebElement PasswordConfirm= driver.findElement(By.id("input-confirm"));
        PasswordConfirm.clear();
        PasswordConfirm.sendKeys("Telephone");

        WebElement PrivacyPolicy= driver.findElement(By.name("agree"));
        PrivacyPolicy.click();

        WebElement Continue= driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
        Continue.click();

        WebElement Logout= driver.findElement(By.linkText("Logout"));
        Logout.click();

    }
}
