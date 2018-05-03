package javaCoreT.javaCoreT_01;

/**
 * Created by longguangbin on 2018/5/1.
 */
public class javaArray {
    //    learn:
    //    1、array初始化
    //    2、函数的传递引用改变值
    //    3、返回数组的方法
    //    4、数组排序，java.util.Arrays.sort(arr)
    //    5、System.arraycopy(源数组名称, 源数组开始点, 目标数组名称, 目标数组开始点, 拷贝长度)， 见 practice.practice_02_arrCopy
    public static void main(String[] args) {
        int[] data = new int[3];        // 1、array初始化1
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        int[] temp2 = data;             // 2、函数的传递引用改变值
        temp2[0] = 100;
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
        System.out.println("");
        int[] data2 = {209, 2112, 2, 2, 3, 32};         // 1、array初始化2
        print(data2);
        inc(data2);                     // 2、传递引用，函数中参数是栈内存的值，引用改变堆内存的值
        print(data2);
        int[] data3 = init();           // 3、返回数组的方法
        print(data3);
        java.util.Arrays.sort(data3);   // 4、数组排序
        print(data3);
    }

    public static void print(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + ",");
        }
        System.out.println("");
    }

    public static void inc(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            temp[i] *= 2;
        }
    }

    public static int[] init() {
        int[] temp = {209, 2112, 2, 2, 3, 32};
        return temp;
    }
}
