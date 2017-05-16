package com.shiftedtech.flowers800.scripts;
import com.shiftedtech.flowers800.framework.Flowers800ScriptBase;
import com.shiftedtech.flowers800.framework.report.ExtentTestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by PaxoStudent on 5/8/2017.
 */

@Listeners({ExtentTestListener.class})
public class ShoppingCartFunctionality extends Flowers800ScriptBase{

    @Test
    public void cartFunctionalityTest(){
      flowers800().shoppingCartPage().navigateToShoppingCartPage();
      flowers800().shoppingCartPage().verifyCartLandingPage();
    }
}
