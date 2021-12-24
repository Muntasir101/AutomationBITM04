package com.WebDriverBasic;

import com.Base.BaseClass;

public class TitleUrlVerify extends BaseClass {
    public static void main(String[] args) {
        firefox_launch();
        open_URL("https://google.com");
        title_verification();
        url_verification();
        firefox_close();

    }
    public static void title_verification(){
        String ExpectedTitle="Facebook";
       String ActualTitle= driver.getTitle();

       if (ExpectedTitle.equals(ActualTitle)){
           System.out.println("Title matched.Test Passed.");
       }
       else {
           System.out.println("Title did not match.Test Failed!!.");
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
