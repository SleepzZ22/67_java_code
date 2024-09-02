// คลาส
package W12;

public class W12_00_ExLoopWile {

    public static void main(String[] args) {
        //TODO1
        System.out.println("ToDo 1-for loop");
        for (int i = 1; i < 5; i++) {
            System.out.println("รอบที่" + i);
        }

        System.out.println("____________________________________________________________________________________________________________________________________________");

        System.out.println("ToDo 1-while loop");
        int n1 = 1;
        while (n1 < 5) {
            System.out.println("รอบที่" + n1);
            n1++;

            System.out.println("____________________________________________________________________________________________________________________________________________");
            //TODO2  
            System.out.println("ToDo 2-for loop");
            for (int t1 = 1; t1 < 5; t1++) {
                System.out.println("รอบที่" + t1);
            }

            System.out.println("____________________________________________________________________________________________________________________________________________");

            System.out.println("ToDo 2-while loop");
            int t1 = 1;
            while (t1 <= 5) {
                System.out.println("รอบที่" + t1 + "Hello World");
                t1++;
            }

        }

        System.out.println("\n__________________________________________________________________________________________________________________________________________");
        //TODO3

        //TODO4
        //TODO5
        //TODO6

        //TODO7
        //TODO8
    System.out.println("ToDo 8-while loop");
    int na = 2;
    while (na <= 20){
    System.out.print(na+" ");
    na = na+2;  
        }
  System.out.println("\n__________________________________________________________________________________________________________________________________________");
        //TODO9
        //TODO10
        //ให้แสดงผลลัพธ์ดังนี้
        // ===============
        // รอบที่ 1 เลขคี่
        // รอบที่ 2 เลขคู่
        // รอบที่ 3 เลขคี่
        // รอบที่ 4 เลขคู่
        // รอบที่ 5 เลขคี่
        System.out.println("ToDo 10-while loop");
        int t2 = 1;
        while (t2 <= 5) {
            if (t2 % 2 == 1) {
                System.out.println("รอบที่ " + t2 + " เลขคี่");
            } else {
                System.out.println("รอบที่ " + t2 + " เลขคู่");
            }
            t2++;
            }

    }
}
