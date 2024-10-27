//จำนวนเต็มบวก ลบ ศูนย์//
import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("กรุณาใส่จำนวนเต็ม: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("จำนวนเต็มบวก");
        } else if (number < 0) {
            System.out.println("จำนวนเต็มลบ");
        } else {
            System.out.println("ศูนย์");
        }
    }
}