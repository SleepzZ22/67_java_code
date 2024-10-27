//เลขคู่ เลขคี่//

import java.util.Scanner;

public class EvenOddExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("กรอกจำนวนเต็มที่ต้องการตรวจสอบ: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("เป็นเลขคู่");
        } else {
            System.out.println("เป็นเลขคี่");
        }
    }
}