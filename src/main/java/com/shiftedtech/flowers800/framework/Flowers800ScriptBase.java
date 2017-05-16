package com.shiftedtech.flowers800.framework;

import com.shiftedtech.flowers800.framework.pages.ApplicationPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by PaxoStudent on 3/31/2017.
 */
public class Flowers800ScriptBase extends ScriptBase {

    private ApplicationPage flowers800 = null;

    @Override
    @BeforeMethod
    public void setUp() {
        super.setUp();
        getDriver().navigate().to("https://www.1800flowers.com/");
    }

    public ApplicationPage flowers800() {
        if (flowers800 == null) {
            flowers800 = new ApplicationPage(getDriver());
        }
        return flowers800;
    }

    @Override
    @AfterMethod
    public void tearDown() {
        super.tearDown();
        flowers800 = null;
    }
}