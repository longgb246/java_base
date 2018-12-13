package learn.javaCoreT.javaCoreT_01;

/**
 * Created by longguangbin on 2018/5/1.
 */
public class javaCharArray {
    //    learn:
    //    1、String.toCharArray
    //    2、char变大写
    //    3、char array 变String
    //    4、判断 String 是否是数字
    public static void main(String[] args) {
        String str1 = "hello world";
        char[] data = str1.toCharArray();       // 1、String.toCharArray
        print(data);
        upper(data);
        print(data);
        String str2 = new String(data);         // 3、char array 变String
        System.out.println(str2);
        String str3 = "1a23";
        System.out.println(isNumber(str3));
        System.out.println(isNumber("123"));
    }

    public static void upper(char[] temp) {
        for (int i = 0; i < temp.length; i++) {
            temp[i] -= 32;                      // 2、变大写
        }
    }

    public static void print(char[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + ",");
        }
        System.out.println("");
    }

    public static boolean isNumber(String str_v) {       // 4、判断 String 是否是数字
        char[] data_v = str_v.toCharArray();
        for (int i = 0; i < data_v.length; i++) {
            if (data_v[i] < '0' || data_v[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
