package learn.chapter2;

/**
 * Created by longguangbin on 2017/12/3.
 */
public class MaxMinValue {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);
        System.out.println(max + 1);        // 超过最大值就变成最小值了
        System.out.println(max + 2);
        System.out.println(min - 1);
        // 解决数据溢出
        System.out.println("=============================================");
        System.out.println("解决数据溢出问题");
        System.out.println("=============================================");
        System.out.println(max + 2L);
        System.out.println(max + (long)2);
    }
}
