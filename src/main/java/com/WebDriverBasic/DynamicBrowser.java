package com.WebDriverBasic;

import com.Base.BaseClass;

public class DynamicBrowser extends BaseClass {
    public static void main(String[] args) {
        launch_browser("chrome");
        open_URL("https://google.com");
        browser_close("chrome");
    }
}
