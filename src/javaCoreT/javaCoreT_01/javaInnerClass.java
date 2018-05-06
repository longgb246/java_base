package javaCoreT.javaCoreT_01;

/**
 * Created by longguangbin on 2018/5/4.
 */

class Outer1 {                              // 1、内部类的使用
    private String msg = "Hello world!";

    class Inner1 {
        public void print() {
            System.out.println(msg);        // 注意：这里可以访问外部类的私有变量！
            System.out.println(Outer1.this.msg);        // 注意：这里可以访问外部类的私有变量！明确指定了访问的属性
        }
    }

    public void fun() {
        Inner1 inner1 = new Inner1();
        inner1.print();
    }
}

class Outer2 {                                              // 2、拆分出外部类，内部类
    private String msg = "Hello world!";

    public void fun() {
        Inner2 inner2 = new Inner2(this);           // 这里传入了自己。
        inner2.print();
    }

    public String getMsg() {
        return msg;
    }
}

class Inner2 {                                              // 拆分出来的内部类
    private Outer2 outer2 = null;                           // 定义外部类

    public Inner2(Outer2 outer2) {
        this.outer2 = outer2;
    }

    public void print() {
        System.out.println(this.outer2.getMsg());           // 获得外部类的私有变量
    }
}

class Outer3 {                                              // 3、外部类可以访问内部类私有属性。
    private String msg = "Hello world!";

    class Inner3 {
        private String info = "Inner3";                     // 定义内部类的私有变量

        public void print() {
            System.out.println(msg);
        }
    }

    public void fun() {
        Inner3 inner3 = new Inner3();
        inner3.print();
        System.out.println(inner3.info);                    // 外部类可以直接访问内部类私有变量
    }
}

class Outer4 {                                              // 5、静态内部类。
    private static String msg = "Hello world!";

    static class Inner4 {
        public void print() {
            System.out.println(msg);
        }
    }
}

class Outer5 {                                              // 6、在方法中定义内部类。
    private String msg = "Hello world!";

    public void fun(final int x, int y) {                   // [old] 内部类在调用方法内部的参数的时候，这些参数需要加入final关键字，否则无法调用。[new] 我不加final也可以调用！
        final String info = "fun";                          // [old] 内部类在调用方法内部的参数的时候，这些参数需要加入final关键字，否则无法调用。
        String info2 = "new";                               // [new] 我不加final也可以调用！
        class Inner5 {
            public void print() {
                System.out.println(Outer5.this.msg);        // 内部类访问外部类私有属性
                System.out.println(x);
                System.out.println(y);                      // [new] 我不加final也可以调用！
                System.out.println(info2);                  // [new] 我不加final也可以调用！
                System.out.println(info);
            }
        }
        Inner5 inner5 = new Inner5();
        inner5.print();
    }
}

public class javaInnerClass {
    //    learn:
    //    1、内部类的使用。内部类可以访问外部类私有属性。明确指定了访问的属性
    //    2、拆分出外部类，内部类。同时达到，内部类可以访问外部类私有属性
    //    3、外部类可以访问内部类私有属性。
    //    4、实例化内部类。
    //    5、静态内部类。
    //    6、在方法中定义内部类。情况最多的。[old]内部类在调用方法内部的参数的时候，这些参数需要加入final关键字，否则无法调用[ 已经不适用了！]。[new] 我不加final也可以调用！
    public static void main(String[] args) {
        System.out.println("============== Outer1 ==============");
        Outer1 outer1 = new Outer1();         // 1、内部类的使用
        outer1.fun();
        System.out.println("============== Outer2 ==============");
        Outer2 outer2 = new Outer2();         // 2、拆分出外部类，内部类
        outer2.fun();
        System.out.println("============== Outer3 ==============");
        Outer3 outer3 = new Outer3();         // 3、外部类可以访问内部类私有属性。
        outer3.fun();
        System.out.println("============== Outer1.Inner1 ==============");
        Outer1.Inner1 inner1 = new Outer1().new Inner1();               // 4、实例化内部类。
        inner1.print();
        System.out.println("============== Outer4 ==============");
        Outer4.Inner4 inner4 = new Outer4.Inner4();                     // 5、静态内部类。
        inner4.print();
        System.out.println("============== Outer5 ==============");
        Outer5 outer5 = new Outer5();                                   // 6、在方法中定义内部类。
        outer5.fun(30, 60);                                              // 内部类在调用方法内部的参数的时候，这些参数需要加入final关键字，否则无法调用。
    }
}

// 名师讲坛——Android 开发实战经典
