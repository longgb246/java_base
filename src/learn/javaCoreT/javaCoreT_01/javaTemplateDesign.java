package learn.javaCoreT.javaCoreT_01;

/**
 * Created by longguangbin on 2018/5/6.
 */

abstract class Action {
    public static final int EAT = 1;              // 操作标记
    public static final int SLEEP = 3;
    public static final int WORK = 5;
    public static final int RUN = 7;

    public void order(int flag) {
        switch (flag) {
            case EAT:                           // 吃饭
                this.eat();
                break;
            case SLEEP:                         // 睡觉
                this.sleep();
                break;
            case WORK:                          // 工作
                this.work();
                break;
            case RUN:                           // 跑步
                this.run();
                break;
            case EAT + SLEEP + RUN:             // 吃饭 + 睡觉 + 跑步
                this.eat();
                this.sleep();
                this.run();
                break;
            case EAT + WORK:                    // 吃饭 + 工作
                this.eat();
                this.work();
                break;
            case EAT + SLEEP + RUN + WORK:      // 吃饭 + 睡觉 + 跑步 + 工作
                this.eat();
                this.sleep();
                this.run();
                this.work();
                break;
        }
    }

    public abstract void eat();                 // 吃饭功能

    public abstract void sleep();               // 睡觉功能

    public abstract void run();                 // 跑步功能

    public abstract void work();                // 工作功能
}

class TemplateDog extends Action {
    @Override
    public void eat() {
        System.out.println("狗在吃。");
    }

    @Override
    public void sleep() {
        System.out.println("狗在睡觉。");
    }

    @Override
    public void run() {
        System.out.println("狗在跑。");
    }

    @Override
    public void work() {
    }
}

class TemplateRobot extends Action {
    @Override
    public void eat() {
        System.out.println("机器人在加油。");
    }

    @Override
    public void sleep() {
    }

    @Override
    public void run() {
    }

    @Override
    public void work() {
        System.out.println("机器人在工作。");
    }
}

class TemplatePerson extends Action {
    @Override
    public void eat() {
        System.out.println("人在吃。");
    }

    @Override
    public void sleep() {
        System.out.println("人在睡觉。");
    }

    @Override
    public void run() {
        System.out.println("人在跑。");
    }

    @Override
    public void work() {
        System.out.println("人在工作。");
    }
}

public class javaTemplateDesign {
    //    learn:
    //    1、模板设计模式
    public static void main(String[] args) {
        Action action1 = new TemplateDog();
        action1.order(Action.EAT + Action.SLEEP + Action.RUN);
        Action action2 = new TemplateRobot();
        action2.order(Action.EAT + Action.WORK);
        Action action3 = new TemplatePerson();
        action3.order(Action.EAT + Action.SLEEP + Action.RUN + Action.WORK);
    }
}
