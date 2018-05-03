package practice;

/**
 * Created by longguangbin on 2018/5/1.
 */
public class practice_02_arrCopy {
    //    practice:
    //    合并2个数组并按升序排列
    public static void main(String[] args) {
        int[] data1 = {1, 7, 9, 11, 13, 15, 17, 19};
        int[] data2 = {2, 4, 6, 8, 10};
        int[] data3 = copy(data1, data2);
        java.util.Arrays.sort(data3);
        print(data3);
    }

    public static int[] copy(int[] ar1, int[] ar2) {
        int[] ar3 = new int[ar1.length + ar2.length];
        System.arraycopy(ar1, 0, ar3, 0, ar1.length);       // System.arraycopy(源数组名称, 源数组开始点, 目标数组名称, 目标数组开始点, 拷贝长度)
        System.arraycopy(ar2, 0, ar3, ar1.length, ar2.length);
        return ar3;
    }

    public static void print(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + ",");
        }
    }
}
