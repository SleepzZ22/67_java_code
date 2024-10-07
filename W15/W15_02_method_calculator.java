package W15;
import java.util.Scanner;

public class W15_02_method_calculator {
    // ทั้งหมดเป็น method ที่มีการรับค่าและคืนค่า
    // 1) Method สำหรับบวกเลข
    static int add (int a, int b) {
        System.out.print(a + " + " + b + "= ");
        return a + b;
    }
    // 2) Method สำหรับลบเลข
    static int subtact (int a, int b ) {
        System.out.print(a + " - " + b + "= ");
        return a - b;
    }
    // 3) Method สำหรับคูณเลข
    static int muitiply(int a, int b) {
        System.out.print(a + " * " + b + " = ");
        return a * b;
    }
    // 4) Method สำหรับหารเลข
    static int devide(int a, int b) {
        System.out.print(a + " / " + b + " = ");
        return a / b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("ป้อนตัวเลขที่1 : ");
        int a =sc.nextInt();
        System.err.print("ป้อนตัวเลขที่2 : ");
        int b = sc.nextInt();
        // 1) Method สำหรับบวกเลข
        System.out.println(add(a, b));
        // 2) Method สำหรับลบเลข
        System.out.println(subtact(a, b));
        // 3) Method สำหรับคูณเลข
        System.out.println(muitiply(a, b));
        // 4) Method สำหรับหารเลข
        System.out.println( devide(a, b));
    }

}
