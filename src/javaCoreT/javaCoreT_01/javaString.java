package javaCoreT.javaCoreT_01;

/**
 * Created by longguangbin on 2018/4/30.
 */
public class javaString {
    //    learn:
    //    1、substring
    //    2、==     : 2个字符串内存地址是否相等，数值比较；
    //       equals : 2个字符串内容是否相等；
    //       equalsIgnoreCase : 2个字符串内容是否相等，忽略大小写；
    //    3、其他函数：
    //       contains, indexOf, lastIndexOf, startsWith, endsWith,
    //       replace, replaceAll, replaceFirst
    //       split
    //       length, isEmpty, trim, toUpperCase, toLowerCase
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting.substring(0, 3));       // 1、substring
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = str2;
        System.out.println(str1 == str2);                   // 2、==
        System.out.println(str1 == str3);
        System.out.println(str3 == str2);                   // 2、==，堆内存地址相同
        System.out.println(str1.equals(str2));              // 2、equals
        System.out.println(str1.equals(str3));
        System.out.println(str3.equals(str2));
        System.out.println("Hello".equalsIgnoreCase("hello"));       // 2、equalsIgnoreCase
        System.out.println("Hello".contains("llo"));                                // 3、contains
        System.out.println("Hello".indexOf("llo"));                                 // 3、indexOf
        System.out.println("Hello".indexOf("llo", 2));              // 3、indexOf
        System.out.println("Hello".lastIndexOf("llo", 2));          // 3、lastIndexOf
        System.out.println("Hello".startsWith("He"));                               // 3、startsWith
        System.out.println("Hello".startsWith("el", 1));            // 3、startsWith
        System.out.println("Hello".endsWith("lo"));                                 // 3、endsWith
        System.out.println("Hello".replace("l", "_"));        // 3、replace
        System.out.println("Hello".replaceAll("l", "_"));     // 3、replaceAll
        System.out.println("Hello".replaceFirst("l", "_"));   // 3、replaceFirst
        print("Hello world !!!".split(" "));                                // 3、split
        print("Hello world !!!".split(" ", 2));                       // 3、split
        print("192.168.1.1".split("\\."));                                  // 3、split，拆分.分割
        System.out.println("Hello world !!!".length());                             // 3、length
        System.out.println("Hello world !!!".isEmpty());                            // 3、isEmpty
        System.out.println("  Hello world !!!   ".trim());                          // 3、trim
        System.out.println("  Hello world !!!   ".toUpperCase());                   // 3、toUpperCase
        System.out.println("  Hello world !!!   ".toLowerCase());                   // 3、toLowerCase
    }

    public static void print(String[] temp) {
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + ",");
        }
        System.out.println("");
    }
}
