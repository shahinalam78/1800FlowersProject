package com.shiftedtech.flowers800.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by PaxoStudent on 4/3/2017.
 */
public class CoustomerSignInPage extends BasePage {


    @FindBy(how = How.XPATH, using = ".//*[@id='logonId']")
    private WebElement emailAddressTextBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='logonPassword']")
    private WebElement passwordTextBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='default']")
    private WebElement coustomerSignInButton;

    public CoustomerSignInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void coustomerSignIn(String emailAddress, String password) {
        emailAddressTextBox.sendKeys(emailAddress);
        passwordTextBox.sendKeys(password);
        coustomerSignInButton.click();

    }

    public void verifyMyAccountName(String accountName) {
        WebElement element = getDriver().findElement(By.id("hdrSignInName"));
        String actualText = element.getText();
        Assert.assertEquals(accountName, actualText);
    }
}
