package chapter2;

/**
 * Created by longguangbin on 2017/12/3.
 */
public class CharType {
    public static void main(String[] args) {
        char c = 'A';
        int x = c;
        System.out.println(x);
        System.out.println(c);
        x += 32;
        char temp = (char) x;
        System.out.println(x);
        System.out.println(temp);
    }
}
