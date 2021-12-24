package com.Guru99;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class NewCustomer extends BaseClass {
    public static void main(String[] args) {
        launch_browser("firefox");
        open_URL("http://demo.guru99.com/V4/");
        TC_NewCustomer_001();
    }
    public static void TC_NewCustomer_001(){

        WebElement UserId=driver.findElement(By.name("uid"));
        UserId.clear();
        UserId.sendKeys("mngr373431");

        WebElement Password=driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys("zahyzYd");

        WebElement LoginBtn=driver.findElement(By.name("btnLogin"));
        LoginBtn.click();

        WebElement CustomerLink= driver.findElement(By.linkText("New Customer"));
        CustomerLink.click();


        WebElement CustomerName=driver.findElement(By.name("name"));
        CustomerName.clear();
        CustomerName.sendKeys("tamjimulhasan");

         WebElement CustomerGender=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]"));
        //WebElement CustomerGender=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]"));
        CustomerGender.click();

        WebElement Dob= driver.findElement(By.id("dob"));
        Dob.click();
        Dob.sendKeys("2021-12-24");


        WebElement CustomerAddress=driver.findElement(By.name("addr"));
        CustomerAddress.clear();
        CustomerAddress.sendKeys("Dhaka");

        WebElement City=driver.findElement(By.name("city"));
        City.clear();
        City.sendKeys("Dhaka");

        WebElement State=driver.findElement(By.name("state"));
        State.clear();
        State.sendKeys("Dhaka");

        WebElement PIN=driver.findElement(By.name("pinno"));
        PIN.clear();
        PIN.sendKeys("123456");

        WebElement MobileNumber=driver.findElement(By.name("telephoneno"));
        MobileNumber.clear();
        MobileNumber.sendKeys("01711454534");

        WebElement Email=driver.findElement(By.name("emailid"));
        Email.clear();
        Email.sendKeys("tanjimul110@gmail.com");

        WebElement CustomerPassword=driver.findElement(By.name("password"));
        CustomerPassword.clear();
        CustomerPassword.sendKeys("1234567");

        WebElement SubmitBtn=driver.findElement(By.name("sub"));
        SubmitBtn.click();


    }
}
