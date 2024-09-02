package W12;

import java.util.Scanner;

public class W12_03_doWhile_checkGrade {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int score;// ประกาศตัวแปรเพื่อเก็บค่าที่ผู้ใช้ป้อน
        
        
      
        do { // ถ้าผู้ใช้ป้อนไม่ถูกต้องให้ป้อนใหม่  
        System.out.println("Enter your scoer between 1 and 100:");// แสดงข้อความให้ผู้ใช้ป้อนข้อมูล between 1 and 100 number
          score = kb.nextInt();// รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร
            
        } while (score<=1 || score>=100);  // ให้ผู้ใช้ป้อนข้อมูลซ้ำจนกว่าจะถูกต้อง // แสดงข้อมูลที่ผู้ใช้ป้อน เช่น ou entered: 75
            
                String  grade;
            if (score >= 80) {
                grade = 'A';
            } else if (score >= 70) {
                grade = 'B';
            } else if (score >= 60) {
                grade = 'C';
            } else if (score >= 50) {
                grade = 'D';
            } else {
                grade = 'E';
            }
        
       } kb.close(); // ปิด Scanner object
    }

// ตรวจสอบเกรด