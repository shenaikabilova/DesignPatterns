package com.tu.design.pattern.shenaikabilova.behavioralsdesignpattern.iterator;

/**
 * Created by ShenaiKabilova
 */
public class Main {
    public static void main(String[] args) {
        ArrayCollection arr = new ArrayCollection(3);
        arr.addElement("a");
        arr.addElement("bsds");
        arr.addElement("f");
        arr.addElement("g");
        arr.addElement("e");
        arr.addElement("qwe");
        arr.addElement("a");
        arr.addElement("a");

        //      arr.getAll();

        Iterator iterator = arr.getIterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("without inner class");
        String[] myArr = new String[5];
        myArr[0] = "a";
        myArr[1] = "v";
        myArr[2] = "q";
        myArr[3] = "p";
        myArr[4] = "l";


        Iterator<String> iterator1 = new IteratorImpl<>(myArr);
        while(iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }
    }
}
