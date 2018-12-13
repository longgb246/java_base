package learn.javaCoreT.javaCoreT_01;

/**
 * Created by longguangbin on 2018/5/6.
 */

class A {
    public A(String msg) {
        System.out.println("父类A");
        System.out.println("msg=" + msg);
    }

    public void print() {
        System.out.println("Hello world A!");
    }
}

class B extends A {                                     // 1、简单继承
    public B() {
        super("B");                               // super关键字
        System.out.println("子类B");
    }

    public void print() {                               // 覆写不能用更严格的权限。
        super.print();                                  // super直接调用父类的方法
        System.out.println("Hello world B!");
    }
}

public class javaExtend {
    //    learn:
    //    1、简单继承。super。覆写不能用更严格的权限。
    public static void main(String[] args) {
        B b = new B();                                  // 1、简单继承
        b.print();
    }
}
