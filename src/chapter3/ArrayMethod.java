package chapter3;

/**
 * Created by longguangbin on 2017/12/3.
 */
public class ArrayMethod {
    public static void main(String[] args) {
        int num_a = 3;
        int[] data = new int[num_a];
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        int[][] data2 = new int[2][3];
        data2[0][0] = 1;
        System.out.println(data2);
        System.out.println(data2.toString());
        System.out.println(data2[0][0]);
        System.out.println(data2[0][1]);

    }
}
