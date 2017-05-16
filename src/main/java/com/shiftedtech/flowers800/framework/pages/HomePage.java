package com.shiftedtech.flowers800.framework.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import javax.swing.text.Document;

import static com.shiftedtech.flowers800.framework.utils.DelayUtil.delayFor;

/**
 * Created by PaxoStudent on 4/8/2017.
 */
public class HomePage extends BasePage {

    @FindBy(how = How.XPATH, using = "./*//*[@id='18F']")
    private WebElement brandTab_1Link;

    @FindBy(how = How.XPATH, using = "//div/div[@id='BrandTab_2']")
    private WebElement brandTab_2Link;

    @FindBy(how = How.XPATH, using = "//a[@id='FBQ']")
    private WebElement brandTab_3Link;

    @FindBy(how = How.ID, using = "dataset")
    private WebElement occasionDropdown;
    private WebElement selectItem = null;



    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        delayFor(3000);
    }

    public void navigateToBrandTab_1Page() {
        Actions(brandTab_1Link);
    }

    public void verifyBrandTab_1PageLandingMessage() {
        String text = getDriver().findElement(By.id("18F")).getText();
        Assert.assertEquals("1-800-Flowers", text);
    }

    public void navigateToBrandTab_2Page() {
        Actions(brandTab_2Link);
        delayFor(3000);
    }

    public void verifyBrandTab_2PageLandingMessage() {
        String text = getDriver().findElement(By.xpath("//a[@id='18B']")).getText();
        Assert.assertEquals("1-800-Baskets", text);
    }

    public void navigateToBrandTab_3Page() {
        Actions(brandTab_3Link);
        delayFor(3000);
    }

    public void verifyBrandTab_3PageLandingMessage() {
        String text = getDriver().findElement(By.id("FBQ")).getText();
        Assert.assertEquals("Fruit Bouquets", text);
    }

    public void navigateToSelectItem() {
        Select occasion = new Select(occasionDropdown);
        occasion.selectByVisibleText("Just Because");
        selectItem = occasion.getFirstSelectedOption();
    }

    public void verifySelectOccasion() {
        String expectedText = selectItem.getText().trim();
        String actualText = "Just Because";
        Assert.assertEquals(expectedText,actualText);
    }

}