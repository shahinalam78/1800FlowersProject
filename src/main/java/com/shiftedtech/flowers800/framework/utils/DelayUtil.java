package com.shiftedtech.flowers800.framework.utils;

/**
 * Created by PaxoStudent on 3/31/2017.
 */
public class DelayUtil {

  protected int timeMilli;

   /* private static DelayUtil instance = null;

    private DelayUtil() {

    }

    public static DelayUtil getInstance() {
        if (instance == null) {
            instance = new DelayUtil();
        }
        return instance;
    }*/

    public static void delayFor(int timeMilli) {

        try {
            Thread.sleep(timeMilli);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
