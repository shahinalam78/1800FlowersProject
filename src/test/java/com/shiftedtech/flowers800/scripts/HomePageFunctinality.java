package com.shiftedtech.flowers800.scripts;
import com.shiftedtech.flowers800.framework.Flowers800ScriptBase;
import com.shiftedtech.flowers800.framework.report.ExtentTestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static com.shiftedtech.flowers800.framework.utils.DelayUtil.delayFor;

/**
 * Created by PaxoStudent on 4/8/2017.
 */


@Listeners({ExtentTestListener.class})
public class HomePageFunctinality extends Flowers800ScriptBase {

    @Test
    public void headerPageFunctinalityTest1() {
        flowers800().homePage().navigateToBrandTab_1Page();
        flowers800().homePage().verifyBrandTab_1PageLandingMessage();
        delayFor(2000);
    }

    @Test
    public void headerPageFunctinalityTest2() {
        flowers800().homePage().navigateToBrandTab_2Page();
        flowers800().homePage().verifyBrandTab_2PageLandingMessage();
        delayFor(2000);
    }

    @Test
    public void headerPageFunctinalityTest3() {
        flowers800().homePage().navigateToBrandTab_3Page();
        flowers800().homePage().verifyBrandTab_3PageLandingMessage();
        delayFor(2000);
    }

    @Test
    public void occasionDropdownTest(){
        flowers800().homePage().navigateToSelectItem();
        flowers800().homePage().verifySelectOccasion();
        delayFor(2000);
    }
}
