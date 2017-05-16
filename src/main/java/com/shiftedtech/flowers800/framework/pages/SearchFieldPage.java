package com.shiftedtech.flowers800.framework.pages;

import com.shiftedtech.flowers800.framework.utils.ExplicitWaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by PaxoStudent on 5/6/2017.
 */
public class SearchFieldPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//input[@id='SearchBox']")
    private WebElement serachField;

    public SearchFieldPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void popUpHandle() {

        ExplicitWaitUtils wait = new ExplicitWaitUtils(getDriver());

        WebElement brithDayDialog = null;

        try {
            brithDayDialog = wait.waitForElement(By.cssSelector("#TB_window"));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        if (brithDayDialog != null) {
            WebElement skipBotton = wait.waitForElement(By.cssSelector(".GN-modal-skip>a"));
            skipBotton.click();
        }
        System.out.println("Continue script......");
    }


    public void nagvigateToSerachField(String text) {
        serachField.sendKeys(text);
        serachField.submit();
    }
}
