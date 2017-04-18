package com.tu.design.pattern.shenaikabilova.singleton.zad1;

/**
 * Created by ShenaiKabilova
 */
public class TR {
    private static TR instance;
    private String name;

    private TR (String name) {
        this.name = name;
    }

    public static TR trGetInstance(String name) {
        if(instance == null) {
            instance = new TR(name);
        }

        return instance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
