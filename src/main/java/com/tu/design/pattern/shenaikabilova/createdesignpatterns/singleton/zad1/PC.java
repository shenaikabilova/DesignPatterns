package com.tu.design.pattern.shenaikabilova.createdesignpatterns.singleton.zad1;

/**
 * Created by ShenaiKabilova
 */
public class PC {
    public TR tr;

    public void startTR(String pcName) {
        tr = TR.trGetInstance(pcName);
    }
}
