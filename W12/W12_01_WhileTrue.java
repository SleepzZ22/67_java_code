package W12;

public class W12_01_WhileTrue {

    public static void main(String[] args) {

    int num = 0;    // กำหนดค่าเริ่มต้น
       while(true){  // วนลูปไปเรื่อยๆ  ใช้ while (true) {
            num++;// update รอบ
            System.out.print(num+" ");  // แสดงข้อความพร้อมกับค่า num
          
                if (num>=1000) { // ตรวจสอบเงื่อนไข ถ้ารอบมากกว่าหรือเท่ากับ 1000 ให้ออกจากลูป
                   break; //if (num>=1000) break;  // ออกจากลูป 
                }
    }    
    }
    }

       
      // แสดงข้อความพร้อมกับค่า count
         
       