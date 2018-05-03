package javaCoreT.javaCoreT_01;

/**
 * Created by longguangbin on 2018/4/30.
 */

class ByRefPerson {
    String name;
    int age;

    public void tell() {
        System.out.println("name: " + name + "; age :" + age);
    }
}

public class javaByRef {
    //    learn:
    //    1、引用传递，栈内存，堆内存
    public static void main(String[] args) {
        ByRefPerson per1 = new ByRefPerson();
        per1.name = "张三";
        per1.age = 20;
        per1.tell();
        ByRefPerson per2 = per1;     // 1、引用传递
        per2.name = "李四";
        per2.tell();
        per1.tell();
        per1.age = 21;
        per1.tell();
        per2.tell();
    }
}
