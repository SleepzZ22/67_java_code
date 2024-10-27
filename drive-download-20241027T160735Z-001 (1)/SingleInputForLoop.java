import java.util.Scanner;

public class SingleInputForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่าผ่านลูป for จำนวน 5 ครั้ง
        for (int i = 1; i <= 5; i++) {
            System.out.print("กรุณาใส่จำนวนเต็ม (ครั้งที่ " + i + "): ");
            int number = scanner.nextInt();
            System.out.println("คุณได้กรอกจำนวน: " + number);
        }
    }
}