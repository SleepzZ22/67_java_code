import java.util.Scanner;
public class iiiii {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int sum = 1;
        System.out.print("Enter number");
        int number = kb.nextInt();
        for(int i = 0;i < number; i++){
            System.out.print(sum + " ");
            sum += number;
        }
        System.out.println("Summary is " + sum);     
    }
}
