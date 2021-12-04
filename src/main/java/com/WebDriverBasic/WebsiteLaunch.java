package com.WebDriverBasic;

public class WebsiteLaunch extends Browser {
    public static void main(String[] args) {
        chrome_launch();
      //  open_offline_Url();
        open_URL();
       // chrome_close();
    }
    public static void open_URL(){
        driver.get("https://google.com");
    }
    public static void open_offline_Url(){
        driver.get("file:///E:/PnT B4/DemoOpencart/Your Store.html");
        driver.get("http://127.0.0.1:8080/mhypage.html");
    }

}
