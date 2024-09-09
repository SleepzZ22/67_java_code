package  W13;

public class W13_01_introArray {
    public static void main(String[] args) {
    //ประกาศตัวแปลชนิด Array แบบที่1 - รู้จำนวนข้อมุลล่วงหน้า
    String[] colors = {"purple","Cyan","Blue","Green","Yellow","Orange","Red"};              //String colors [] = {};

    int[] banks = {20,50,100,500,1000};

    char[] Alphabe= {'A','B','C','D','E'};
        //แสดงผลลัพธ์โดยใช้ indrx ของ Array
        System.out.println("The first color is " + "-" +colors[0]+"-");
        System.out.println ("The first bank is " + "-" + banks[1]+"-");
        System.out.println("The Third Alphabe is " + "-" + Alphabe[2] + "-");           
        //แสดงผลลัพธ์โดยใช้ loop 
        System.out.println("==============================================================================================================");
        System.out.println("Colors in the array are");
        for(int i = 0; i < 7; i++) {
            System.out.print(colors[i] + " ");
        }
           
            
            System.out.println("\n==========================================================================================================");
            System.out.println("Colors in the array are");       
       for(int i=6;i>=0;i--) {
            System.out.print(colors[i]+" ");
       }
            System.out.println("\n============================================================================================================");
            System.out.println("Baks in the array are");
        for (int i = 0; i < banks.length; i++) {
            System.out.print(banks[i] + " ");
        }
            System.out.println("\n============================================================================================================");   
   }
}