package com.shiftedtech.flowers800.framework.pages;

import com.shiftedtech.flowers800.framework.utils.DelayUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by PaxoStudent on 4/3/2017.
 */
public class SignInPage extends BasePage {

    // put all those pages element

    @FindBy(how = How.XPATH, using = "./*//*[@id='hdrSignInText']")
    private WebElement signInLink;

    @FindBy(how = How.XPATH, using = ".//*[@id='SignIn']/img")
    private WebElement signInButton;

    public SignInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToSignInPage() {
        Actions(signInLink);
        signInButton.click();
    }

    public void verifyForSignInName() {
        String text = getDriver().findElement(By.id("hdrSignInName")).getText();
        Assert.assertEquals("Hello, MD", text);
    }

    public void verifyForErrorMessage() {
        String text = getDriver().findElement(By.cssSelector(".signInCopy.accent")).getText();
        Assert.assertEquals("*Required", text);
    }

   /* public void verifyMyAccountName(String accountName){
        WebElement element  = driver.findElement(By.xpath("./*//*[@id='hdrSignInName']"));
        String actualText = element.getText();

        Assert.assertEquals(accountName,actualText );
    }*/


/*
    protected WebElement getSignInLink() {

        WebElement signInButton = driver.findElement(By.xpath("./*//*[@id='SignIn']/img"));
        return signInButton;
    }

    public void navigateToSignInPage() {
        WebElement signInLink = driver.findElement(By.xpath("./*//*[@id='hdrSignInText']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(signInLink).perform();

        //WebElement signInButton = driver.findElement(By.xpath("./*//*[@id='SignIn']/img"));
        getSignInLink().click();
    }*/
}
