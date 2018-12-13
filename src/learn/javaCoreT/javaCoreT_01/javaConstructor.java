package learn.javaCoreT.javaCoreT_01;

/**
 * Created by longguangbin on 2018/4/30.
 */

class ConsPerson {
    private String name = "张三";
    private int age;

    public ConsPerson() {
        System.out.println(name);       // 2、此处可以输出内容
    }

    public ConsPerson(String name) {
        this.setName(name);
    }   // 1、构造方法重载

    public ConsPerson(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void tell() {
        System.out.println("name: " + this.name + "; age: " + this.age);
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setAge(int a) {
        if (a >= 0 && a <= 200) {
            this.age = a;
        }
    }
}

class ConsPerson2 {
    private String name;
    private int age;

    public ConsPerson2() {
        System.out.println("实例一个ConsPerson2对象");
    }

    public ConsPerson2(String name) {
        this();
        this.name = name;
    }

    public ConsPerson2(String name, int age) {
        this(name);                 // 必须为于首行
        this.age = age;
    }

    public void tell() {
        System.out.println("name: " + this.name + "; age: " + this.age);
    }
}

public class javaConstructor {
    //    learn:
    //    1、构造方法可以重载
    //    2、构造方法是最后一步，上面可以输出内容
    //    3、匿名对象，使用完一次就被回收了
    //    4、在构造函数中使用this
    //    5、传递引用
    public static void main(String[] args) {
        ConsPerson per = new ConsPerson();
        new ConsPerson("张三", 20).tell();    // 3、匿名对象
        ConsPerson2 per2 = new ConsPerson2("张三", 20);
        per2.tell();
        per.tell();
        fun(per);                               // 5、传递引用，修改参数，但是对String无效
        per.tell();
    }
    public static void fun(ConsPerson temp){
        temp.setName("李四");
    }
}
