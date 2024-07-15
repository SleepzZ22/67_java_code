import java.util.Scanner;
public class W05_01_ifElse_OddEvenNumber{
    public static void main (String [] args){
        Scanner Kb = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = Kb.nextInt();
        int result = number % 2;
        
        if(result==0){
            System.out.print(number + " is an even number.");
        }else{
            System.out.print(number + "is an odd number. ");
        } 
    }
}