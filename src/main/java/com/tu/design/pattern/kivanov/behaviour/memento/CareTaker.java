package com.tu.design.pattern.kivanov.behaviour.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kamen on 30.04.16
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

}
