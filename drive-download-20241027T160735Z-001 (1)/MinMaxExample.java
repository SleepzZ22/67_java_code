// ค่ามากสุด น้อยสุด //
import java.util.Scanner;

public class MinMaxExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("กรอกจำนวนเต็มที่ต้องการ: ");
        int n = scanner.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print("กรอกตัวเลขที่ " + i + ": ");
            int number = scanner.nextInt();

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("ค่ามากสุดคือ: " + max);
        System.out.println("ค่าน้อยสุดคือ: " + min);
    }
}