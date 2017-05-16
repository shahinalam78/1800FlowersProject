package com.shiftedtech.flowers800.framework.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by PaxoStudent on 4/2/2017.
 */
public class ApplicationPage {

    // put all pages object / singleton

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }
    private SignInPage signInPage = null;
    private CoustomerSignInPage coustomerSignInPage = null;
    private CreateAccountPage createAccountPage = null;
    private HomePage homePage = null;
    private SearchFieldPage searchFieldPage = null;
    private ShoppingCartPage shoppingCartPage = null;

    public ApplicationPage(WebDriver driver) {
        this.driver = driver;
    }

    public SignInPage signInPage() {
        if (signInPage == null) {
            signInPage = new SignInPage(getDriver());
        }
        return signInPage;
    }

    public CoustomerSignInPage coustomerSignInPage() {
        if (coustomerSignInPage == null) {
            coustomerSignInPage = new CoustomerSignInPage(getDriver());
        }
        return coustomerSignInPage;
    }

    public CreateAccountPage createAccountPage() {
        if (createAccountPage == null) {
            createAccountPage = new CreateAccountPage(getDriver());
        }
        return createAccountPage;
    }

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage(getDriver());
        }
        return homePage;
    }

    public SearchFieldPage searchFieldPage(){
        if(searchFieldPage == null){
            searchFieldPage = new SearchFieldPage(getDriver());
        }
        return searchFieldPage;
    }

    public ShoppingCartPage shoppingCartPage(){
        if(shoppingCartPage == null){
            shoppingCartPage = new ShoppingCartPage(getDriver());
        }
        return shoppingCartPage;
    }
}
