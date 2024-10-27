//กรณีรับค่ามาเพียงค่าเดียว://
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("You entered: " + number);
    }
}