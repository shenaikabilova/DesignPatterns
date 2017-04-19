package shenaikabilova.behavioralsdesignpattern.iterator;

import java.util.Arrays;

/**
 * Created by ShenaiKabilova
 */
public class ArrayCollection implements Collection{
    private String[] name;
    private int size;

    public ArrayCollection() {
        this(10);
    }

    public ArrayCollection(int size) {
        this.name = new String[size];
    }

    public void addElement(String element) {
        if(this.size < name.length) {
            int newSize = size + 5;
            name = Arrays.copyOf(name, newSize);
        }

        name[size++] = element;
    }

    public void getAll() {
        for(int i=0; i<name.length; i++) {
            System.out.print(name[i] + " ");
        }
    }

    public String[] getName() {
        return name;
    }

    @Override
    public Iterator getIterator() {
        return new IteratorImpl();
    }

    private class IteratorImpl implements Iterator<String>{
        private int index;

        @Override
        public boolean hasNext() {
            if(index < name.length) return true;
            else return false;
        }

        @Override
        public String next() {
            if(hasNext()) {
                return name[index++];
            }
            return null;
        }
    }
}