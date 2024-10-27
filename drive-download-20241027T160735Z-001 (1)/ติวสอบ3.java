//กรณีรับมาหลายค่า (ผ่านลูป)://
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = sc.nextInt();
            System.out.println("You entered: " + number);
        }
    }
}