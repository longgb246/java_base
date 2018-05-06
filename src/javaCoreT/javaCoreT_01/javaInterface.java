package javaCoreT.javaCoreT_01;

/**
 * Created by longguangbin on 2018/5/6.
 */

interface InterfaceA1 {                                     // 1、接口。
    public String INFO = "Hello world!";

    public void print();
}

interface InterfaceA2 {                                     // 1、接口。
    public void get();
}

abstract class InterfaceA3 {
    public abstract void fun();
}

class InterfaceA4 extends InterfaceA3 implements InterfaceA1, InterfaceA2 {
    @Override
    public void print() {
        System.out.println("InterfaceA1");
    }

    @Override
    public void get() {
        System.out.println("InterfaceA2 " + INFO);           // 这个地方的 INFO 是在 InterfaceA1 定义
    }

    @Override
    public void fun() {
        System.out.println("InterfaceA3");
    }
}

interface InterfaceA5 extends InterfaceA1, InterfaceA2 {     // 2、接口多继承。
    public void printA5();
}

interface InterfaceA6 {
    public void printA6();

    static interface InterfaceB {                           // 3、内部接口。
        public void printB();
    }
}

class InterfaceA7 implements InterfaceA6.InterfaceB {       // 3、内部接口。
    @Override
    public void printB() {
        System.out.println("InterfaceA6.InterfaceB - InterfaceA7");
    }
}

interface InterfaceUSB {                                     // 操作标准
    public void install();

    public void work();
}

class InterfaceComputer {
    public void plugin(InterfaceUSB usb) {                   // 接收USB实例
        usb.install();                                      // 调用接口方法
        usb.work();                                         // 调用接口方法
    }
}

class InterfacePhone implements InterfaceUSB {               // 实现USB接口
    @Override
    public void install() {
        System.out.println("安装手机驱动程序。");
    }

    @Override
    public void work() {
        System.out.println("手机与电脑开始工作。");
    }
}

class InterfacePrinter implements InterfaceUSB {
    @Override
    public void install() {
        System.out.println("安装打印机驱动程序。");
    }

    @Override
    public void work() {
        System.out.println("打印机与电脑开始工作。");
    }
}

public class javaInterface {
    //    learn:
    //    1、接口。
    //    2、接口多继承。
    //    3、内部接口。
    //    4、USB接口。
    public static void main(String[] args) {
        System.out.println("================== InterfaceA1 ==================");    // 2、接口多继承。
        InterfaceA1 interface_a1 = new InterfaceA4();       // 子类为接口实例化
        InterfaceA2 interface_a2 = new InterfaceA4();       // 子类为接口实例化
        InterfaceA3 interface_a3 = new InterfaceA4();       // 子类为抽象类实例化
        interface_a1.print();
        interface_a2.get();
        interface_a3.fun();
        System.out.println("================== InterfaceA7 ==================");
        InterfaceA6.InterfaceB interface_b = new InterfaceA7();                     // 3、内部接口。
        interface_b.printB();
        System.out.println("================== InterfaceUSB ==================");
        InterfaceComputer interface_computer = new InterfaceComputer();             // 4、USB接口。
        interface_computer.plugin(new InterfacePhone());
        interface_computer.plugin(new InterfacePrinter());
    }
}
