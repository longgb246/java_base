package chapter2;

/**
 * Created by longguangbin on 2017/12/3.
 */
public class TypeConversion {
    public static void main(String[] args) {
        int x = 10;
        long y = x;
        long result = x * y;
        int temp = (int)result;
        System.out.println(temp);
    }
}
