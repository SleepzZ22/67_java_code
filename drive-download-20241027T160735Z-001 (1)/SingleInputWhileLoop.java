import java.util.Scanner;

public class SingleInputWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // เริ่มต้นลูป
        System.out.println("กรุณาใส่จำนวนเต็ม (กรอก 0 เพื่อสิ้นสุด): ");
        while (true) {
            number = scanner.nextInt();
            
            if (number == 0) {
                break; // จบลูปเมื่อผู้ใช้กรอก 0
            }

            System.out.println("คุณได้กรอกจำนวน: " + number);
        }
        System.out.println("สิ้นสุดการรับค่า");
    }
}