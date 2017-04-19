package shenaikabilova.creatededignpattern.prototype.zad2;

/**
 * Created by ShenaiKabilova
 */
public interface Figure extends Cloneable {
    void getInfo();
    Figure clone() throws CloneNotSupportedException;
}
