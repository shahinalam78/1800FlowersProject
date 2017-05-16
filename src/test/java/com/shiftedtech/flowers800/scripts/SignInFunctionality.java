package com.shiftedtech.flowers800.scripts;

import com.gargoylesoftware.htmlunit.AppletConfirmHandler;
import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.shiftedtech.flowers800.framework.Flowers800ScriptBase;
import com.shiftedtech.flowers800.framework.pages.ApplicationPage;
import com.shiftedtech.flowers800.framework.report.ExtentTestListener;
import com.shiftedtech.flowers800.framework.utils.DelayUtil;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static com.shiftedtech.flowers800.framework.utils.DelayUtil.delayFor;

/**
 * Created by PaxoStudent on 3/31/2017.
 */

@Listeners({ExtentTestListener.class})
public class SignInFunctionality extends Flowers800ScriptBase {

    @Test
    public void vaildUserIdVaildPassword() {
        flowers800().signInPage().navigateToSignInPage();
        flowers800().coustomerSignInPage().coustomerSignIn("mdalam7841@gmail.com", "P1234567");
        flowers800().coustomerSignInPage().verifyMyAccountName("Hello, MD");
        delayFor(5000);
        flowers800().signInPage().verifyForSignInName();
    }

    @Test
    public void invaildUserIdInvaildPassword() {
        flowers800().signInPage().navigateToSignInPage();
        flowers800().coustomerSignInPage().coustomerSignIn("alam_s78@yahoo.com", "P113234567");
        delayFor(4000);
        flowers800().signInPage().verifyForErrorMessage();
    }

    @Test
    public void invaildUserIdvaildPassword() {
        flowers800().signInPage().navigateToSignInPage();
        flowers800().coustomerSignInPage().coustomerSignIn("aalam_s78@yahoo.com", "P113234567");
        delayFor(4000);
        flowers800().signInPage().verifyForErrorMessage();
    }

    @Test
    public void vaildUserIdInvaildPassword() {
        flowers800().signInPage().navigateToSignInPage();
        flowers800().coustomerSignInPage().coustomerSignIn("alam_s78@yahoo.com", "P10013234567");
        delayFor(4000);
        flowers800().signInPage().verifyForErrorMessage();
    }


}
