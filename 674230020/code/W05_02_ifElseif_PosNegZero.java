import java.util.Scanner;
public class W05_02_ifElseif_PosNegZero{
    public static void main (String [] args ){
        Scanner Kb = new Scanner(System.in);
        System.out.print("Enter a number");
        int number = Kb.nextInt();
        if(number>0) {
           System.out.println(number + " is a positive number.");
        }else if(number<0) {
           System.out.println(number + " is a negative number.");
        }else if(number==0) {
           System.out.println(number + " is zero.");
        }else {
           System.out.println(number + " Invalid input.");
        }
    }
}