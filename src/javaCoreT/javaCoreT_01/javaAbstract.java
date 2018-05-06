package javaCoreT.javaCoreT_01;

/**
 * Created by longguangbin on 2018/5/6.
 */


abstract class AbstractA1 {                             // 1、抽象类
    private String info = "Hello world A!";

    public void print() {
        System.out.println(this.info);
    }

    public abstract void get();                         // 抽象方法：只是声明，没有方法体
}

class Impl1 extends AbstractA1 {                          // 抽象类子类
    @Override
    public void get() {
        System.out.println("Hello Impl! ");             // 抽象方法必须覆写
    }
}

abstract class AbstractA2 {
    static abstract class AbstractB2 {
        public abstract void print();
    }
}

class Impl2 extends AbstractA2.AbstractB2 {
    @Override
    public void print() {
        System.out.println("AbstractA2.AbstractB2 - Impl2");
    }
}

abstract class AbstractA3 {
    public AbstractA3() {
        this.print();
    }

    public abstract void print();
}

class Impl3 extends AbstractA3 {
    private int x = 100;

    public Impl3(int x) {
        this.x = x;
    }

    @Override
    public void print() {
        System.out.println("x=" + x);
    }
}

public class javaAbstract {
    //    learn:
    //    1、抽象类。向上转型。
    //    2、抽象类。向下转型。
    //    3、抽象类。转型的时候，调用父类构造函数，属性均未初始化。
    public static void main(String[] args) {
        System.out.println("================== javaAbstract1 ==================");
        AbstractA1 impl = new Impl1();                      // 1、抽象类。向上转型。
        impl.print();
        impl.get();
        System.out.println("================== javaAbstract2 ==================");
        AbstractA2.AbstractB2 abstract_b2 = new Impl2();    // 2、抽象类。向下转型。
        abstract_b2.print();
        System.out.println("================== javaAbstract3 ==================");
        AbstractA3 abstract_a3 = new Impl3(30);         // 3、抽象类。转型的时候，调用父类构造函数，属性均未初始化。
    }
}
