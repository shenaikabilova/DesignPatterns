package Singleton.zad1;

/**
 * Created by ShenaiKabilova
 */
public class PC {
    public TR tr;

    public void startTR(String pcName) {
        tr = TR.trGetInstance(pcName);
    }
}
