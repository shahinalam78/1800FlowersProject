package com.shiftedtech.flowers800.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by PaxoStudent on 4/4/2017.
 */
public class CreateAccountPage extends BasePage {

    @FindBy(how = How.XPATH, using = ".//*[@id='activityId_18f-hdr-create-account']/a")
    protected WebElement createAccountLink;

    @FindBy(how = How.XPATH, using = ".//*[@id='firstName']")
    protected WebElement firstNameTextField;

    @FindBy(how = How.XPATH, using = ".//*[@id='lastName']")
    protected WebElement lastNameTextField;

    @FindBy(how = How.XPATH, using = ".//*[@id='logonId']")
    protected WebElement emailTextField;

    @FindBy(how = How.XPATH, using = ".//*[@id='email1']")
    protected WebElement confirmEmailTextField;

    @FindBy(how = How.XPATH, using = ".//*[@id='logonPassword']")
    protected WebElement passwordTextField;

    @FindBy(how = How.XPATH, using = ".//*[@id='logonPasswordVerify']")
    protected WebElement verifyPasswordTextField;

    @FindBy(how = How.XPATH, using = ".//*[@id='default']")
    protected WebElement createAccountButton;


    public CreateAccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToCreateAccountPage() {
        createAccountLink.click();
    }


    public void CreateAccountPage(String firstName, String lastName, String email,
                                  String confirmEmail, String password, String verifyPassword) {
        firstNameTextField.sendKeys(firstName);
        lastNameTextField.sendKeys(lastName);
        emailTextField.sendKeys(email);
        confirmEmailTextField.sendKeys(confirmEmail);
        passwordTextField.sendKeys(password);
        verifyPasswordTextField.sendKeys(verifyPassword);
        createAccountButton.click();
    }
}
