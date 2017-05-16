package com.shiftedtech.flowers800.framework.pages;

import static com.shiftedtech.flowers800.framework.utils.DelayUtil.delayFor;

import com.shiftedtech.flowers800.framework.utils.ExplicitWaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by PaxoStudent on 4/2/2017.
 */
public class BasePage {

    // all commom function

    private WebDriver driver = null;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void Actions(WebElement targetElement) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(targetElement).click().perform();
    }
}

