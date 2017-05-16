package com.shiftedtech.flowers800.scripts;
import com.shiftedtech.flowers800.framework.Flowers800ScriptBase;
import com.shiftedtech.flowers800.framework.report.ExtentTestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static com.shiftedtech.flowers800.framework.utils.DelayUtil.delayFor;

/**
 * Created by PaxoStudent on 5/7/2017.
 */


@Listeners({ExtentTestListener.class})
public class CreatAccountFunctinality extends Flowers800ScriptBase {

    @Test
    public void createAccount() {
        flowers800().createAccountPage().navigateToCreateAccountPage();
        flowers800().createAccountPage().CreateAccountPage("MD", "ALAM", "mdalam7841@gmail.com",
                "mdalam7841@gmail.com", "P1234567", "P1234567");
        delayFor(5000);
    }
}
