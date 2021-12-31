package com.WebDriverBasic;

import com.Base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Screenshots extends BaseClass {
    public static void main(String[] args) throws IOException {
        launch_browser("chrome");
        open_URL("https://demo.opencart.com/");
        //getVisiblePartScreenshots();
       // getFullPageScreenshot();
        getHighlightElementScreenshot();
       browser_close("chrome");
    }

    public static void getVisiblePartScreenshots() throws IOException {
        //screenshot capture
        File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //save
        FileUtils.copyFile(screenshotFile,new File("./src/ScreenshotImages/visibleImage2.jpeg"),true);
    }

    public static void getFullPageScreenshot(){
        //Screenshot
        Screenshot fullPage=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

        //save
        try {
            ImageIO.write(fullPage.getImage(),"jpeg",new File("./src/ScreenshotImages/FullPage2.jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getHighlightElementScreenshot(){
        WebElement SearchBox= driver.findElement(By.name("search"));

        JavascriptExecutor jse=(JavascriptExecutor) driver;
        //Highlight element
        jse.executeScript("arguments[0].style.border='5px solid red'",SearchBox);

        //screenshot capture
        File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        //save
        try {
            FileUtils.copyFile(screenshotFile,new File("./src/ScreenshotImages/HighlightElement.jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
