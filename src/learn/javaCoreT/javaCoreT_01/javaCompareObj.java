package learn.javaCoreT.javaCoreT_01;

/**
 * Created by longguangbin on 2018/5/1.
 */

class ComObPerson {
    private String name;
    private int age;

    public ComObPerson(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public boolean compare(ComObPerson temp) {
        if (temp == null) {        // 比较对象为null
            return false;
        }
        if (this == temp) {        // 比较地址相同
            return true;
        }
        if (this.name.equals(temp.name) && this.age == temp.age) {
            return true;
        }
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class javaCompareObj {
    //    learn:
    //    1、对象比较的函数
    public static void main(String[] args) {
        ComObPerson per1 = new ComObPerson("张三", 20);
        ComObPerson per2 = new ComObPerson("张三", 20);
        if (per1.compare(per2)) {
            System.out.println("同一对象");
        } else {
            System.out.println("不同对象");
        }
    }
}
