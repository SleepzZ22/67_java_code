package W13;
import java.util.Scanner;
public class W13_02_introArray {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in); 

        String[] brandCars = new String[3];
        //กำหนดค่าให้ Array
        brandCars[0] = "Toyota"; //จองไว้10ช่อง เริ่มที่ 0 จบที่ 9
        brandCars[1] = "Hinda";
        brandCars[2] = "Nissan";
        
        System.out.println("Default Brand ofcars in the array are");
        for (int i = 0; i < brandCars.length; i++) {
            System.out.print(brandCars[i] + " / ");
        }
        System.out.println("\n\nPlease enter the brand fo the 3rd car:"); 
        for (int i = 0; i < brandCars.length; i++){
            System.out.print("Enter brand" + (i+1)+": " );
            brandCars[i] = kb.next();
        }

            System.out.println("Default Brand ofcars in the array are");
        for (int i =0; i <brandCars.length; i++) {
            System.out.print(brandCars[i]+" / ");
        }
     
            System.out.print("\n");
            System.out.println("new Brand ofcars in the array are");
        for (String car : brandCars) {
            System.out.print(car + " / ");
        }
    }
}
