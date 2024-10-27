package W16;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];

        // Single Variable Inpur
        System.out.print("Type some number: ");
        int sg = sc.nextInt();
        System.out.println("Single Variable Updated..");
        
        // Array 
        for(int i = 0; i < nums.length; i++)
        {
            System.out.printf("Type array [%d] number: ", i);
            nums[i] = sc.nextInt();
        }
        System.out.println("Array Variable Updated..");

        // 
        sc.close();
    }
}
