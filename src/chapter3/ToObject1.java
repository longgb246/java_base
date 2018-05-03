package chapter3;

/**
 * Created by longguangbin on 2017/12/3.
 */

class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    public void setAge(int age) {
        if ((age>=0)&&(age<=160)){
            this.age = age;
        }
        else {
            System.out.println("年龄错误！");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void tell() {
        System.out.println("姓名：" + this.name + "，年龄：" + this.age);
    }
}


public class ToObject1 {
    public static void main(String[] args) {
        Person person = new Person("long", 19);
//        person.name = "long";
//        person.age = 18;
        person.tell();
        person.setName("long");
        person.setAge(18);
        person.tell();
    }
}
