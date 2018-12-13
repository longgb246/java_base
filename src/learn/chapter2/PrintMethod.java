package learn.chapter2;

/**
 * Created by longguangbin on 2017/12/3.
 */
public class PrintMethod {
    public static void main(String[] args) {
        printInfo();
        printInfo();
        printTriangle(5);
        printTriangle(7);
    }

    public static void printInfo() {
        System.out.println("==============================");
        System.out.println("这是一个测试");
        System.out.println("==============================");
    }

    public static void printTriangle(int line) {
        for (int x = 0; x < line; x++) {
            for (int y = 0; y < line - x; y++) {
                System.out.print(" ");
            }
            for (int y = 0; y < x; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
