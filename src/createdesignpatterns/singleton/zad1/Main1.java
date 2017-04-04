package createdesignpatterns.singleton.zad1;

/**
 * Created by ShenaiKabilova
 */
public class Main1 {
    public static void main(String[] args) {
        PC comp = new PC();
        comp.startTR("C");
        System.out.println(comp.tr.getName());
        comp.startTR("F");
        System.out.println(comp.tr.getName());
    }
}
