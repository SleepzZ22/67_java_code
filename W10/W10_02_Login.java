package W10;
import java.util.Scanner;
public class W10_02_Login {
    public static void main (String [] args) {
        String username = "porames";
        String password = "221248";
    Scanner kb = new Scanner(System.in);
    System.out.print("ป้อนชื่อผู้ใช่: ");
    String inputUsername = kb.nextLine();
    System.out.print("ป้อนรหัสผ่าน: ");
    String inputpassword = kb.nextLine();
    
    if (username.equals(inputUsername) && password.equals(inputpassword)){
        System.out.println("เข้าสู่ระบบสำเร็จ");
    
    }else{
        if(!username.equals(inputUsername) && password.equals(inputpassword)){
            System.out.println("ชื่อผู้ใช้ผิด");

        }else if(username.equals(inputUsername) && !password.equals(inputpassword)){
            System.out.println("รหัสผ่านผิด");

        }else{
            System.out.println("ชื่อผู้ใช้และรหัสผ่านไม่ถูกต้อง");
        }
    }   
 }
}