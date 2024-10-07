// การสร้าง method ประกอบด้วยส่วนต่าง ๆ ดังนี้:
// ประเภทการคืนค่า (Return type): สิ่งที่ method จะคืนค่ากลับมา เช่น int, double, void (ไม่คืนค่า)
// ชื่อ method: ชื่อที่ใช้ในการเรียก method
// พารามิเตอร์ (Parameters): ข้อมูลที่ส่งเข้าไปให้ method ทำงาน (อาจมีหรือไม่มี)
// เนื้อหาของ method: คำสั่งที่ method จะดำเนินการ
// ==============================================================
// returnType methodName(parameters) {
//     // คำสั่งที่ต้องการให้ทำงาน
//     return value; // ถ้ามีการคืนค่า
// }
// ==============================================================
package W15;

public class W15_01_method_intro {

    // 1) Method ที่ไม่มีการรับค่าและคืนค่า
    static void printHello(){
        System.out.println("Heiio World");
    }
    // 2) Method ที่รับค่าแต่ไม่คืนค่า
    static void sayHelloTo(String Name){
        System.out.println("Hello " + Name);
    }
    // 3) Method ที่ไม่รับค่าแต่คืนค่า
    static String getITname(){
        return "IT";
    }
    // 4) Method ที่รับค่าและคืนค่า
    static int add(int a , int b) {
        System.out.print(a + "+" + b + "= ");
        return a + b;
    }
    // 5) Method เส้นแบ่ง ที่ไม่มีการรับค่าและคืนค่า
    static void ggez(){
        System.out.println("===========================================");
    }
    public static void main(String[] args) {

        // 1) Method ที่ไม่มีการรับค่าและคืนค่า
        printHello();
        ggez();
        // 2) Method ที่รับค่าและไม่คืนค่า
        sayHelloTo("Porames");
        sayHelloTo("oHm");
        ggez();
        // 3) Method ที่ไม่รับค่าและคืนค่า
        System.out.println("My major is" + getITname());
        ggez();
        // 4) Method ที่รับค่าและคืนค่า
        System.out.println(add(50, 9));
        ggez();
    }
}
