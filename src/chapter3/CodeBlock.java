package chapter3;

/**
 * Created by longguangbin on 2017/12/4.
 */
public class CodeBlock {
    public static void main(String[] args) {
//        if (true) {
        {
            int x = 20;
            System.out.println("x=" + x);
        }
        int x = 30;
        System.out.println(x);
    }
}
