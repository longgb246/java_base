package learn.javaCoreT.javaCoreT_01;

/**
 * Created by longguangbin on 2018/5/1.
 */

class BlockPerson {
    public BlockPerson(){
        System.out.println("构造方法");
    }
    {                                                   // 定义构造块
        System.out.println("构造块");
    }
    static {                                            // 定义静态构造块
        System.out.println("静态构造块");
    }
}

public class javaBlock {
    //    learn:
    //    1、代码块
    //    2、构造块。构造块优先于构造函数执行
    //    3、静态构造块。静态构造块优先于构造块，但是只执行一次，为static属性初始化
    public static void main(String[] args) {
        if (true) {                                     // 1、代码块
            int x = 10;                                 // 局部变量
            System.out.println("x=" + x);
        }
        //        System.out.println("x=" + x);         // 无效x
        {                                               // 1、代码块
            int x = 11;                                 // 局部变量
            System.out.println("x=" + x);
        }
        //        System.out.println("x=" + x);         // 依然无效x
        BlockPerson per1 = new BlockPerson();
        BlockPerson per2 = new BlockPerson();
        BlockPerson per3 = new BlockPerson();
    }
}
