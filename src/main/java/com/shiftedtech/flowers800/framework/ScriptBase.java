package com.shiftedtech.flowers800.framework;

import com.shiftedtech.flowers800.framework.pages.BasePage;
import com.shiftedtech.flowers800.framework.utils.DelayUtil;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static javafx.scene.input.KeyCode.G;

/**
 * Created by PaxoStudent on 3/31/2017.
 */
public class ScriptBase {

    private WebDriver driver;

    public static int DEFAULT_IMPLICITY_WAIT_TIME = 20;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();

        /*FirefoxDriverManager.getInstance().arch32().setup();
        driver = new FirefoxDriver();*/

      /*  InternetExplorerDriverManager.getInstance().arch32().setup();
        driver = new InternetExplorerDriver();
*/
        driver.manage().timeouts().implicitlyWait(DEFAULT_IMPLICITY_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }

    @AfterMethod
    public void tearDown() {
        if(driver!=null) {
            driver.close();
            driver.quit();
        }

    }

}
