package learn.javaCoreT.javaCoreT_01;

/**
 * Created by longguangbin on 2018/5/1.
 */

class StaticPerson {
    private String name;
    private int age;
    static String country2 = "北京";
    private static String country = "北京";
    private static int count = 0;

    public StaticPerson(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("当前实例化：" + (++count) + " 个");
    }

    public static void setCountry(String country) {
        StaticPerson.country = country;
    }

    public static String getCountry() {
        return country;
    }

    public void tell() {
        System.out.println("name: " + this.name + "; age:" + this.age + ", country:" + country2);
    }

    public void tell2() {
        System.out.println("name: " + this.name + "; age:" + this.age + ", country:" + country);
    }

    public static int getCount() {
        return count;
    }
}

public class javaStatic {
    //    learn:
    //    1、静态属性，是在全局数据区，修改一个，全部实例化的都改了。
    //    2、不用实例化调用，直接使用 类.方法 调用
    //    3、统计实例化个数
    public static void main(String[] args) {
        StaticPerson per1 = new StaticPerson("张三", 20);
        StaticPerson per2 = new StaticPerson("李四", 21);
        StaticPerson per3 = new StaticPerson("王五", 22);
        per1.country2 = "燕京";                           // 1、静态属性，是在全局数据区，修改一个，全部实例化的都改了。
        per1.tell();
        per2.tell();
        per3.tell();
        StaticPerson.setCountry("南京");                  // 2、不用实例化调用。
        System.out.println(StaticPerson.getCountry());
        per1.tell2();
        per2.tell2();
        System.out.println(StaticPerson.getCount());      // 3、统计实例化个数
    }
}
