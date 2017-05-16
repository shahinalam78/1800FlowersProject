package com.shiftedtech.flowers800.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Created by PaxoStudent on 5/8/2017.
 */
public class ShoppingCartPage extends BasePage {

    @FindBy(how = How.ID, using = "miniCartBasket")
    private WebElement shoppingCart;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToShoppingCartPage() {
        Actions(shoppingCart);
    }

    public void verifyCartLandingPage() {
        String text = getDriver().findElement(By.xpath("//div[@id='trsCenterContent']/div/b")).getText();
        Assert.assertEquals("Your shopping cart is currently empty.", text);
    }


}
