package learn.javaCoreT.javaCoreT_01;

/**
 * Created by longguangbin on 2018/5/6.
 */

class PolyA1 {
    public void print() {
        System.out.println("A");
    }
}

class PolyB1 extends PolyA1 {                    // 继承 A
    public void print() {                        // 覆写方法
        System.out.println("B");
    }
}

public class javaPoly {
    //    learn:
    //    1、向上转型。父类 父类对象=子类实例，自动。
    //    2、向下转型。子类 子类对象=(子类)父类实例，强制。
    public static void main(String[] args) {
        System.out.println("================== javaPoly1 ==================");
        PolyA1 poly_a1 = new PolyB1();                          // 1、向上转型。
        poly_a1.print();
        System.out.println("================== javaPoly2 ==================");
        System.out.println(poly_a1 instanceof PolyA1);
        System.out.println(poly_a1 instanceof PolyB1);
        if (poly_a1 instanceof PolyB1) {
            PolyB1 poly_b1 = (PolyB1) poly_a1;                  // 2、向下转型。
            poly_b1.print();
        }
    }
}
