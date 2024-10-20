import java.util.Scanner;
public class HomeWork_factorial {
    public static void main (System [] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("กรอกจำนวนเต็มบวก");
        int number = kb.nextInt();
        
        int i = 1;
        int factorial = 1; 
        
        if(number < 0){
            System.out.println("ไม่สามารถหาค่าของเลขที่ติดลบได้");
        }else{
            
            for (int i=1;i <= number ; i++)
            factorial*= 1;
            if(i == 1){
                System.out.println(i);
            }else{
                System.out.println(" x " + i);
            }
    System.out.println(" = " + factorial);
        }
    }
}
