package shenaikabilova.creatededignpattern.prototype.zad2;

/**
 * Created by ShenaiKabilova
 */
public class Rectangle implements Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void getInfo() {
        System.out.println("width: " + width + " height: " + height);
    }

    @Override
    public Figure clone() throws CloneNotSupportedException {
        return new Rectangle(this.width, this.height);
    }
}
