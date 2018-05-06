package javaCoreT.javaCoreT_01;

import javafx.scene.shape.FillRule;

/**
 * Created by longguangbin on 2018/5/6.
 */

interface FactoryFruit {                               // 定义接口
    public void eat();
}

class FactoryApple implements FactoryFruit {                  // 实现接口
    @Override
    public void eat() {
        System.out.println("吃苹果。");
    }
}

class FactoryOrange implements FactoryFruit {                 // 实现接口
    @Override
    public void eat() {
        System.out.println("吃橘子。");
    }
}

class Factory {                                  // 过渡端
    public static FactoryFruit getInstance(String class_name) {
        if ("apple".equals(class_name)) {
            return new FactoryApple();
        }
        if ("orange".equals(class_name)) {
            return new FactoryOrange();
        }
        return null;
    }
}

public class javaFactoryDesign {
    //    learn:
    //    1、工厂设计模式。
    public static void main(String[] args) {
        FactoryFruit factory_fruit = Factory.getInstance("apple");          // 1、工厂设计模式。
        factory_fruit.eat();
    }
}
