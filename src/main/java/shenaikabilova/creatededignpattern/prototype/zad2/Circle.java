package shenaikabilova.creatededignpattern.prototype.zad2;

/**
 * Created by ShenaiKabilova
 */
public class Circle implements Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void getInfo() {
        System.out.println("radius: " + radius);
    }

    @Override
    public Figure clone() throws CloneNotSupportedException {
        return new Circle(this.radius);
    }
}
