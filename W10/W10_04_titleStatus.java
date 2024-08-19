package W10;
import java.util.Scanner;
public class w10_04_titleStatus{
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        
        System.out.print("ระบุเพศ (male/femaie): ");
        String gender = kb.next();
        
        System.out.print("ระบุอายุ: ");
        int age = kb.nextInt();
        
        System.out.print("สถานสมรส (single/married): ");
        String isMarrid = kb.next();

        if (gender.equalsIgnoreCase("male")){
            if(age < 15){
            System.out.println("ด.ช.");
            }else{
            System.out.println("นาย");
            }
        }else{
            if(age < 15){
                System.out.println("ด.ญ.");
            }else if(isMarrid.equalsIgnoreCase("marrid")){
                System.out.println("นาง");
            }else{
                System.out.println("นางสาว");
            }
        }

    }
}