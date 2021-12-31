package com.WebDriverBasic;

import com.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IFrame extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        chrome_launch();
        open_URL("https://the-internet.herokuapp.com/iframe");
        iFrame_test();
        chrome_close();
    }
    public static void iFrame_test() throws InterruptedException {
        driver.switchTo().frame("mce_0_ifr");
        WebElement frameBody= driver.findElement(By.id("tinymce"));
        frameBody.clear();
        frameBody.sendKeys("Test Automation");
        Thread.sleep(3000);
    }
}
