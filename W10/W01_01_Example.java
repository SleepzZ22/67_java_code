// คลาส
package W10;

public class W01_01_Example {

    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            System.out.println("รอบที่" + i);
        }
        System.out.println("\n");
        for (int i = 1; i < 5; i++) {
            System.out.println("รอบที่1" + i + "Hollo World");
        }
        System.out.println("\n");
        int sum = 0;
        for (int j = 1; j <= 10; j++) {
            System.out.print(j);
            if (j < 10) {
                System.out.print("+");
            }
            sum += j;
        }
        System.out.print(" = " + sum);
        System.out.println("\n");
        sum = 10;
        for (int j = 10; j <= 1; j++) {
            System.out.print(sum + " ");
            sum--;
        }
        System.out.println("\n");
        sum = 0;
        for (int j = 1; j <= 19; j += 2) {
            System.out.print(j + " ");
        }
        sum = 0;
        for (int j = 1; j <= 10; j++) {
            sum = j * j;
            System.out.print(sum + " ");

        }

        System.out.println("\n");
        for (int j = 1; j <= 5; j++) {
            if (j % 2 == 0) {
                System.out.println("รอบที่" + j + " เลขคู่");
            } else {
                System.out.println("รอบที่" + j + " เลขคี่");

            }
        }
    }
}
