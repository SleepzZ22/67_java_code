import java.util.Scanner;

public class SingleInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("กรุณาใส่จำนวนเต็ม: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("เลขคู่");
        } else {
            System.out.println("เลขคี่");
        }
    }
}