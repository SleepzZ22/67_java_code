package W15;

public class W15_04_method_findMaxMin {

    // 1) Method สำหรับหาค่ามากที่สุด
    static int findMax(int a , int b){
        // if (a > b) {
        //  return a;
        // }else{
        //     return b;
        // }
        return ( a > b ) ? a : b; //ลดรูปการเขียนให้สั้นลง
    }

    // 2) Method สำหรับหาค่าน้อยที่สุด
    static int findMin(int a, int b) {
        //if (a < b) {
        //  return a;
        //} else {
        //  return b;
        //}
        return (a > b) ? a : b;
    }

    // 3) Method สำหรับหาค่ามากที่สุด โดยรับค่า 3 ตัว
    static int findMax(int a, int b, int c) {
        int Max = a;
        if (b > Max){
            Max = b;
        }
        if (c > Max){
            Max = c;
        }
        return Max;
    }
    // 4) Method สำหรับหาค่าน้อยที่สุด โดยรับค่าเป็น array

    static  int findMin(int[] number){
        disPlayArray(number);
        int min = number[0];
        for( int i = 1; i < number.length ; i++ ){
            if(number[i] < min){
                min = number[i];
            }
        }
        return min;
    }
    // 5) Method สำหรับแสดงค่าใน array ทั้งหมด
    static void disPlayArray(int[] number){
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] +" ");
            // 2) Method สำหรับหาค่าน้อยที่สุด
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // 1) Method สำหรับหาค่ามากที่สุด
        System.out.println("ค่ามากที่สุดคือ [ 10 , 20 ] คือ " + findMax(10 ,20));
        // 2) Method สำหรับหาค่าน้อยที่สุด
        System.out.println("ค่ามากที่สุดคือ [ 10 , 20 ] คือ " + findMin(10 , 20));
        // 3) Method สำหรับหาค่ามากที่สุด โดยรับค่า 3 ตัว
        System.out.println("ค่ามากที่สุดของค่า [ 10 , 20 , 15 ] คือ " + findMax(10 , 20 , 15 ));
        // 4) Method สำหรับหาค่าน้อยที่สุด โดยรับค่าเป็น array
        int[] number = {10,20,30,40,50};
        //disPlayArray(number);
        System.out.println("min number in array is " + findMin(number));
    
    }
}

// method ที่มีชื่อเดียวกัน แต่มีพารามิเตอร์ต่างกันได้ เรียกว่า Method Overloading
// การเรียกใช้ method ที่มีชื่อเดียวกัน จะขึ้นอยู่กับพารามิเตอร์ที่ส่งเข้าไป
// ถ้ามี method ที่มีชื่อเดียวกัน และมีพารามิเตอร์ต่างกัน จะต้องมีการส่งพารามิเตอร์ตามที่ method ต้องการ
