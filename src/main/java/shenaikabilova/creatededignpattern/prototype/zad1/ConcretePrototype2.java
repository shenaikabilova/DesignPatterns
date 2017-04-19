package shenaikabilova.creatededignpattern.prototype.zad1;

/**
 * Created by ShenaiKabilova
 */
public class ConcretePrototype2 extends Prototype {

    public ConcretePrototype2(int id) {
        super(id);
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
