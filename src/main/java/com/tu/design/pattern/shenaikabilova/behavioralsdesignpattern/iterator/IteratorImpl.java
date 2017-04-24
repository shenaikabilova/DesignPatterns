package com.tu.design.pattern.shenaikabilova.behavioralsdesignpattern.iterator;

/**
 * Created by ShenaiKabilova
 */
public class IteratorImpl<T> implements Iterator{
    private int index;
    private T[] array;

    public IteratorImpl(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length; //return true;
//        else return false;
    }

    @Override
    public T next() {
        if(hasNext()) {
            return array[index++];
        }
        return null;
    }
}