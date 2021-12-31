package com.WebDriverBasic;

import com.Base.BaseClass;

import java.io.IOException;

public class TitleUrlVerify extends BaseClass {
    public static void main(String[] args) throws IOException {
        firefox_launch();
        open_URL("https://google.com");
        title_verification();
        url_verification();
        firefox_close();

    }
    public static void title_verification() throws IOException {
        String ExpectedTitle="Facebook";
       String ActualTitle= driver.getTitle();

       if (ExpectedTitle.equals(ActualTitle)){
           System.out.println("Title matched.Test Passed.");
       }
       else {
           System.out.println("Title did not match.Test Failed!!.");
           getVisiblePartScreenshots("TitleBug");
       }
    }

    public static void url_verification(){
        String ExpectedUrl="https://google.com";
        String ActualUrl= driver.getTitle();

        if (ExpectedUrl.equals(ActualUrl)){
            System.out.println("Url matched.Test Passed.");
        }
        else {
            System.out.println("Url did not match.Test Failed!!.");
        }
    }

}
