package learn.javaCoreT.javaCoreT_01;

/**
 * Created by longguangbin on 2018/5/6.
 */

class Singleton {
    private final static Singleton instance = new Singleton();

    private Singleton() {                       // 构造方法私有化
    }

    public void print() {
        System.out.println("Hello world!");
    }

    public static Singleton getInstance() {
        return instance;
    }
}

public class javaSingleton {
    //    learn:
    //    1、单例设计模式。不懂！
    public static void main(String[] args) {
        Singleton singleton = null;
        singleton = Singleton.getInstance();
        singleton.print();
    }
}
