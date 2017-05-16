package com.shiftedtech.flowers800.scripts;


import com.shiftedtech.flowers800.framework.Flowers800ScriptBase;
import com.shiftedtech.flowers800.framework.pages.ApplicationPage;
import com.shiftedtech.flowers800.framework.report.ExtentTestListener;
import com.shiftedtech.flowers800.framework.utils.DelayUtil;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


/**
 * Created by PaxoStudent on 5/6/2017.
 */

@Listeners({ExtentTestListener.class})
public class SearchFunctionality extends Flowers800ScriptBase{

   @Test
    public void searchFunctionalityTest(){
        flowers800().searchFieldPage().nagvigateToSerachField("Birthday");
        flowers800().searchFieldPage().popUpHandle();
        DelayUtil.delayFor(4000);
    }

}
