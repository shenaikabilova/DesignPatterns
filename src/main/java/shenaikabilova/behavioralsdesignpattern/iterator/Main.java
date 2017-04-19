package shenaikabilova.behavioralsdesignpattern.iterator;

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
    }

}
