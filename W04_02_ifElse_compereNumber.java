public import java.util.Scanner;

public class W04_02_ifElse_compereNumber {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Type First Number: ");
        int num1 = keyboard.nextInt();

        System.out.print("Type First Number: ");
        int num2 = keyboard.nextInt();

        int result = 0;

        if (num1 > num2) {
            result = num1 - num2;
            System.out.println("The Number " + num1 + " มากกว่า " + num2);
        } else {
            result = num1 + num2;
            System.out.println("The Number " + num1 + " น้อยกว่า " + num2);
        }

        System.out.println("Result: " + result);

        keyboard.close();
    }
} 
    

