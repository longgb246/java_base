package learn.practice;

/**
 * Created by longguangbin on 2018/5/1.
 */
public class practice_01 {
    //    practice：
    //    将数组中0元素去掉，留下非0元素
    public static void main(String[] args) {
        int[] oldArr = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        int[] newArr = new int[count(oldArr)];
        copy(oldArr, newArr);
        print(newArr);

    }

    public static int count(int[] temp) {
        int count_i = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0) {
                count_i++;
            }
        }
        return count_i;
    }

    public static void copy(int[] oa, int[] na) {
        int j = 0;
        for (int i = 0; i < oa.length; i++) {
            if (oa[i] != 0) {
                na[j] = oa[i];
                j++;
            }
        }
    }

    public static void print(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + ",");
        }
    }
}
