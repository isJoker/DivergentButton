package com.example.jokerwan.divergentbutton.widget;

/**
 * Created by JokerWan on 2018/7/15.
 * Function:
 */

public class QuickClickChecker {
    private int threshold;
    private long lastClickTime = 0;

    public QuickClickChecker(int threshold) {
        this.threshold = threshold;
    }

    public boolean isQuick() {
        boolean isQuick = System.currentTimeMillis() - lastClickTime <= threshold;
        lastClickTime = System.currentTimeMillis();
        return isQuick;
    }
}
