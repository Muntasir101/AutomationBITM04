package com.Guru99;

import com.Base.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Deposit extends BaseClass {
    public static void main(String[] args) {
        chrome_launch();
        open_URL("http://demo.guru99.com/V4/");
        GuruLogin.managerLogin("mngr373431","zahyzYd");
        TC_DepositCustomer_001();
    }
    public static void TC_DepositCustomer_001(){

        WebElement DepositMoney= driver.findElement(By.linkText("Deposit"));
        DepositMoney.click();

        WebElement AccountNo=driver.findElement(By.name("accountno"));
        AccountNo.clear();
        AccountNo.sendKeys("102237");

        WebElement Amount=driver.findElement(By.name("ammount"));
        Amount.clear();
        Amount.sendKeys("10000");

        WebElement Description=driver.findElement(By.name("desc"));
        Description.clear();
        Description.sendKeys("10000tk");

        WebElement Submit= driver.findElement(By.name("AccSubmit"));
        Submit.click();
    }

}
